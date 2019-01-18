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


    public static void main(String[] args) {
        URL url = TestExecution.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = null;
        try {
            // 转化为utf-8编码
            filePath = URLDecoder.decode(url.getPath(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        TestNG testNG = new TestNG();
        testNG.setTestJar(filePath);
        testNG.initializeSuitesAndJarFile();
        testNG.run();
    }
}
