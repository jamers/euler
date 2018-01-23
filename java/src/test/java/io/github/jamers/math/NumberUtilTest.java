package io.github.jamers.math;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.*;

/**
 * Created by jamers on 06/02/2016.
 */

public class NumberUtilTest {
    @Test
    public void testIsEven() {
        assertTrue(NumberUtil.isEven(BigInteger.TEN));
        assertFalse(NumberUtil.isEven(BigInteger.ONE));

        assertTrue(NumberUtil.isEven(10));
        assertFalse(NumberUtil.isEven(1));
    }
}
