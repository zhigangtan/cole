package cn.tanziquan.produce.cole.gitdeploy.util;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * CommandLineUtil
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class CommandLineUtil {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineUtil.class);


    public static boolean gitPull(String path, String branch, String gitRepository) {
        try {
            File file = ResourceUtils.getFile("classpath:sh/gitPull.sh");
            file.setExecutable(true);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
            Map map = new HashMap();
            map.put("dir", path);
            map.put("branch", branch);
            map.put("repository", gitRepository);
            CommandLine cmdLine = new CommandLine(file);
            cmdLine.addArgument("${dir}");
            cmdLine.addArgument("${branch}");
            cmdLine.addArgument("${repository}");
            cmdLine.setSubstitutionMap(map);
            PumpStreamHandler streamHandler = new PumpStreamHandler(
                    outputStream, errorStream);
            DefaultExecutor executor = new DefaultExecutor();
            ExecuteWatchdog watchdog = new ExecuteWatchdog(60000);
            executor.setStreamHandler(streamHandler);
            executor.setWatchdog(watchdog);
            int exitValue = executor.execute(cmdLine);
            String out = outputStream.toString("GBK");
            logger.info("out info:{}", out);
            String error = errorStream.toString("GBK");
            logger.info("out error:{}", error);
            if (exitValue == 0) {
                return true;
            }
        } catch (Exception e) {
            logger.error("command cd error", e);
        }
        return false;
    }

    public static boolean executeSh(String sh, String workingDirectory) {
        try {
            File workingDirectoryFile = new File(workingDirectory);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
            CommandLine cmdLine = new CommandLine(sh);
            PumpStreamHandler streamHandler = new PumpStreamHandler(
                    outputStream, errorStream);
            DefaultExecutor executor = new DefaultExecutor();
            ExecuteWatchdog watchdog = new ExecuteWatchdog(60000);
            executor.setStreamHandler(streamHandler);
            executor.setWatchdog(watchdog);
            executor.setWorkingDirectory(workingDirectoryFile);
            int exitValue = executor.execute(cmdLine);
            String out = outputStream.toString("GBK");
            logger.info("executeSh out info:{}", out);
            String error = errorStream.toString("GBK");
            logger.info("executeSh out error:{}", error);
            if (exitValue == 0) {
                return true;
            }
        } catch (Exception e) {
            logger.error("command cd error", e);
        }
        return false;
    }
}
