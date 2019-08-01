package io.github.jamers.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilTest {
    @Test
    public void testSumOfMultiples() {
        assertEquals(23, MathUtil.calculateSumOfMultiples(10, 3, 5));
        assertEquals(233168, MathUtil.calculateSumOfMultiples(1000, 3, 5));
    }
}
