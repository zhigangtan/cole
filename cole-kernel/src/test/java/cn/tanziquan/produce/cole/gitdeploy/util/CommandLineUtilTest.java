package cn.tanziquan.produce.cole.gitdeploy.util;

import static org.junit.Assert.*;

/**
 * CommandLineUtilTest
 *Ø
 * @author zhigang.tan
 * @version 0.0.1
 */
public class CommandLineUtilTest {

    @org.junit.Test
    public void cddir() throws Exception {
        CommandLineUtil.gitPull("/project/tzgproject/test/","master","https://github.com/zhigangtan/cole.git");
    }

}