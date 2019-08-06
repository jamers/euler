package io.github.jamers.math;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

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

    @Test
    public void testFactorial() {
        assertEquals(BigInteger.valueOf(1), MathUtil.factorial(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(2), MathUtil.factorial(BigInteger.valueOf(2)));
        assertEquals(BigInteger.valueOf(6), MathUtil.factorial(BigInteger.valueOf(3)));
        assertEquals(BigInteger.valueOf(24), MathUtil.factorial(BigInteger.valueOf(4)));
        assertEquals(BigInteger.valueOf(120), MathUtil.factorial(BigInteger.valueOf(5)));
        assertEquals(BigInteger.valueOf(720), MathUtil.factorial(BigInteger.valueOf(6)));
        assertEquals(BigInteger.valueOf(5040), MathUtil.factorial(BigInteger.valueOf(7)));
        assertEquals(BigInteger.valueOf(40320), MathUtil.factorial(BigInteger.valueOf(8)));
        assertEquals(BigInteger.valueOf(362880), MathUtil.factorial(BigInteger.valueOf(9)));
        assertEquals(BigInteger.valueOf(3628800), MathUtil.factorial(BigInteger.valueOf(10)));
    }

    @Test
    public void testSumDigits() {
        assertEquals(6, MathUtil.sumDigits(Arrays.asList('1', '2', '3')));
    }
}
