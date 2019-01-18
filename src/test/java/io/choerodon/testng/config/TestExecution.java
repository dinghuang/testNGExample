package io.choerodon.testng.config;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dinghuang123@gmail.com
 * @since 2019/1/18
 */
public class TestExecution {

    private static final String FILE_NAME = "testng.xml";
    private static final String FILE_NAME_2 = "aa.xml";

    public static void main(String[] args){
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList<String>();
        //path to xml..
        String filePath = TestExecution.class.getClassLoader().getResource(FILE_NAME).getPath();
        System.out.println(filePath);
        suites.add(FILE_NAME);
        testng.setTestSuites(suites);
        testng.run();
    }
}
