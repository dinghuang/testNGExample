package io.choerodon.testng.config;

import org.testng.Reporter;
import org.testng.TestNG;

import java.net.URL;
import java.net.URLDecoder;


/**
 * @author dinghuang123@gmail.com
 * @since 2019/1/18
 */
public class TestExecution {

    private static final String JAR_NAME = "/app-fat-tests.jar";


    public static void main(String[] args) {
        URL url = TestExecution.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = null;
        try {
            // 转化为utf-8编码
            filePath = URLDecoder.decode(url.getPath(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 可执行jar包运行的结果里包含".jar"
        filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
        Reporter.log(filePath);
        TestNG testNG = new TestNG();
        testNG.setTestJar(filePath + JAR_NAME);
        testNG.initializeSuitesAndJarFile();
        testNG.run();
    }
}
