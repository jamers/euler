package io.github.jamers.math;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MathUtilTest {
    @Test
    public void testSumOfMultiples() {
        assertEquals(23, MathUtil.calculateSumOfMultiples(10, 3, 5));
        assertEquals(233168, MathUtil.calculateSumOfMultiples(1000, 3, 5));
    }

    @Test
    public void testIsEven() {
        assertTrue(MathUtil.isEven(BigInteger.TEN));
        assertFalse(MathUtil.isEven(BigInteger.ONE));

        assertTrue(MathUtil.isEven(10));
        assertFalse(MathUtil.isEven(1));
    }
}
