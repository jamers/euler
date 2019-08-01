package io.github.jamers.math;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.*;

public class NumberUtilTest {
    @Test
    public void testIsEven() {
        assertTrue(NumberUtil.isEven(BigInteger.TEN));
        assertFalse(NumberUtil.isEven(BigInteger.ONE));

        assertTrue(NumberUtil.isEven(10));
        assertFalse(NumberUtil.isEven(1));
    }
}
