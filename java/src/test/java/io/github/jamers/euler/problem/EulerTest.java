package io.github.jamers.euler.problem;

import io.github.jamers.math.PrimeSeries;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EulerTest
{
    @Test
    public void test001() {
        assertEquals(233168, new Euler001().solve());
    }

    @Test
    public void test002() {
        assertEquals(4613732, new Euler002().addEvenValuedFibonnacciTerms(4_000_000));
    }

    @Test
    public void test003() {
        assertEquals(BigInteger.valueOf(6857), new Euler003().largestPrimeFactor(BigInteger.valueOf(600_851_475_143L)));
    }

    @Test
    public void test004() {
        assertEquals(906609, new Euler004().solve());
    }

    @Test
    public void test005() {
        assertEquals(232792560, new Euler005().solve());
    }

    @Test
    public void test006() {
        assertEquals(2640, new Euler006().sumSquareDifference(10));
        assertEquals(25164150, new Euler006().sumSquareDifference(100));
    }

    @Test
    public void test007() {
        assertEquals(BigInteger.valueOf(2), new PrimeSeries().getNth(1));
        assertEquals(BigInteger.valueOf(13), new PrimeSeries().getNth(6));
        assertEquals(BigInteger.valueOf(104743), new Euler007().solve());
    }

    @Test
    public void test009() {
        assertEquals(31875000, new Euler009().solve());
    }

    @Test
    public void test010() {
        assertEquals(BigInteger.valueOf(142913828922L), new Euler010().solve());
    }

    @Test
    public void test012() {
        assertEquals(BigInteger.valueOf(3), new Euler012().solve());
    }
}
