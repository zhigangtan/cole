package cn.tanziquan.produce.cole.gitdeploy.helper;

import org.junit.Test;

/**
 * CommandLineHelperTest
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class CommandLineHelperTest {
    @Test
    public void executeGitClone() throws Exception {
        CommandLineHelper commandLineHelper=new CommandLineHelper();
        commandLineHelper.executeGitClone("/project/tzgproject/test/","master","https://github.com/zhigangtan/cole.git");

    }

}