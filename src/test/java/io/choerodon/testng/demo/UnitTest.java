package io.choerodon.testng.demo;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

/**
 * @author dinghuang123@gmail.com
 * @since 2019/1/25
 */
public class UnitTest {
    @Test
    public void isEmpty() {
        System.out.println("isEmpty");
    }

    @Test
    public void trim() {
        assert "foo".equals(StringUtils.trim("  foo   "));
    }
}
