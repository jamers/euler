package io.github.jamers.euler.problem;

import io.github.jamers.math.series.PrimeSeries;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EulerTest
{
    private static final Logger logger = LoggerFactory.getLogger(EulerTest.class);

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // website suggests all tests should run in under one minute

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
        assertEquals(76576500, new Euler012().solve());
    }

    @Test
    public void test014() {
        assertEquals(837799L, new Euler014().solve());
    }

    @Test
    public void test015() {
        assertEquals(2, new Euler015().countRoutesAcrossGridWithSize(1));
        assertEquals(6, new Euler015().countRoutesAcrossGridWithSize(2));
//        new Euler015().countRoutesAcrossGridWithSize(3);
//        new Euler015().countRoutesAcrossGridWithSize(4);
//        new Euler015().countRoutesAcrossGridWithSize(5);
//        new Euler015().countRoutesAcrossGridWithSize(6);
//        new Euler015().countRoutesAcrossGridWithSize(7);
//        new Euler015().countRoutesAcrossGridWithSize(8);
//        new Euler015().countRoutesAcrossGridWithSize(9);
//        new Euler015().countRoutesAcrossGridWithSize(10);
//        new Euler015().countRoutesAcrossGridWithSize(11);
//        new Euler015().countRoutesAcrossGridWithSize(12);
//        new Euler015().countRoutesAcrossGridWithSize(13);
//        new Euler015().countRoutesAcrossGridWithSize(14);
//        new Euler015().countRoutesAcrossGridWithSize(15);
//        new Euler015().countRoutesAcrossGridWithSize(16);
//        new Euler015().countRoutesAcrossGridWithSize(17);
//        new Euler015().countRoutesAcrossGridWithSize(18);
//        new Euler015().countRoutesAcrossGridWithSize(19);
        assertEquals(137846528820L, new Euler015().countRoutesAcrossGridWithSize(20));
    }

    @Test
    public void test016() {
        assertEquals(1366, new Euler016().solve());
    }

    @Test
    public void test017() {
        assertEquals(21124, new Euler017().solve());
    }
}
