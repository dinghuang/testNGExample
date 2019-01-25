package io.choerodon.testng.demo;

import org.testng.annotations.Factory;

/**
 * @author dinghuang123@gmail.com
 * @since 2019/1/25
 */
public class FactoryTest {

    @Factory
    public Object[] createInstances() {
        Object[] result = new Object[10];
        for (int i = 0; i < 10; i++) {
            result[i] = new FactoryTestIntance(i * 10);
        }
        return result;
    }


}
