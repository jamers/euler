package io.github.jamers.math;

import io.github.jamers.euler.problem.Euler001;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamers on 27/01/2016.
 */
public class MathUtilTest {
    @Test
    public void testSumOfMultiples() {
        assertEquals(233168, MathUtil.calculateSumOfMultiples(1000, 3, 5));
    }
}
