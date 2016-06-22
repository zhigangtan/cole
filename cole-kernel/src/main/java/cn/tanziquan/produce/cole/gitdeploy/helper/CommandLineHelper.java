package cn.tanziquan.produce.cole.gitdeploy.helper;

import org.apache.commons.exec.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * CommandLineHelper
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class CommandLineHelper {


    private static final Logger logger = LoggerFactory.getLogger(CommandLineHelper.class);


    public boolean executeGitClone(String workingDirectory, String branch, String repository) {
        ByteArrayOutputStream outputStream = null;
        ByteArrayOutputStream errorStream = null;
        try {
            File workingDirectoryFile = new File(workingDirectory);
            if (!workingDirectoryFile.exists()) {
                workingDirectoryFile.mkdirs();
            }
            CommandLine cmdLine = new CommandLine("git");
            cmdLine.addArgument("clone");
            cmdLine.addArgument("-b");
            cmdLine.addArgument("${branch}");
            cmdLine.addArgument("${repository}");
            cmdLine.addArgument(".");
            HashMap map = new HashMap();
            map.put("branch", branch);
            map.put("repository", repository);
            cmdLine.setSubstitutionMap(map);
            outputStream = new ByteArrayOutputStream();
            errorStream = new ByteArrayOutputStream();
            PumpStreamHandler streamHandler = new PumpStreamHandler(
                    outputStream, errorStream);
            DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();

            DefaultExecutor executor = new DefaultExecutor();
            executor.setStreamHandler(streamHandler);
            executor.setWorkingDirectory(workingDirectoryFile);
            executor.execute(cmdLine, resultHandler);
            resultHandler.waitFor();
            logger.debug("info out :{}", outputStream.toString("GBK"));
            logger.debug("error out :{}", errorStream.toString("GBK"));
            if (resultHandler.getExitValue() == 0) {
                return true;
            }
        } catch (Exception e) {
            logger.error("executeGitClone error", e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    //
                }
            }
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException e) {
                    //
                }
            }
        }
        return false;
    }

    public boolean executeScript(String workingDirectory, String script) {
        ByteArrayOutputStream outputStream = null;
        ByteArrayOutputStream errorStream = null;
        try {
            File workingDirectoryFile = new File(workingDirectory);

            CommandLine cmdLine = CommandLine.parse(script);
            outputStream = new ByteArrayOutputStream();
            errorStream = new ByteArrayOutputStream();
            PumpStreamHandler streamHandler = new PumpStreamHandler(
                    outputStream, errorStream);
            DefaultExecutor executor = new DefaultExecutor();
            executor.setStreamHandler(streamHandler);
            executor.setWorkingDirectory(workingDirectoryFile);
            int exitValue = executor.execute(cmdLine);
            logger.debug("info out :{}", outputStream.toString("GBK"));
            logger.debug("error out :{}", errorStream.toString("GBK"));
            if (exitValue == 0) {
                return true;
            }
        } catch (Exception e) {
            logger.error("executeGitClone error", e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    //
                }
            }
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException e) {
                    //
                }
            }
        }
        return false;
    }
}
