package io.choerodon.testng.demo;

import org.testng.annotations.Test;

/**
 * @author dinghuang123@gmail.com
 * @since 2019/1/25
 */
public class ParallelTest {

    @Test
    public void parallelTest1() {
        System.out.println(1);
    }

    @Test
    public void parallelTest2() {
        System.out.println(2);
    }

    @Test
    public void parallelTest3() {
        System.out.println(3);
    }
}
