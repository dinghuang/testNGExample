package io.choerodon.testng.config;

import io.choerodon.testng.config.domain.TestConfigure;
import org.testng.Reporter;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

/**
 * @author dinghuang123@gmail.com
 * @since 2019/1/17
 */
public class TestConfigureParse {

    private static TestConfigure testConfigure = null;
    private static final String FILE_NAME = "configure.yaml";

    private TestConfigureParse() {
    }

    public static TestConfigure getConfigure() {
        synchronized (TestConfigure.class) {
            if (testConfigure != null) {
                return testConfigure;
            } else {
                Yaml yaml = new Yaml();
                URL url = TestConfigureParse.class.getClassLoader().getResource(FILE_NAME);
                if (url == null) {
                    throw new IllegalArgumentException("The configuration file configure.yaml could not be found");
                } else {
                    String filePath = url.getPath();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
                        testConfigure = yaml.loadAs(fileInputStream, TestConfigure.class);
                    } catch (FileNotFoundException e) {
                        Reporter.log("The configuration file configure.yaml could not be found" + e, true);
                    }
                }
                return testConfigure;
            }
        }

    }
}
