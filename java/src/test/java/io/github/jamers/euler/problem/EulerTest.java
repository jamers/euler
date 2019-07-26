package io.github.jamers.euler.problem;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EulerTest
{
    @Test
    public void testSolve() {
        assertEquals(233168, new Euler001().solve());
        assertEquals(4613732, new Euler002().addEvenValuedFibonnacciTerms(4_000_000));
        assertEquals(BigInteger.valueOf(6857), new Euler003().largestPrimeFactor(BigInteger.valueOf(600_851_475_143L)));
    }
}
