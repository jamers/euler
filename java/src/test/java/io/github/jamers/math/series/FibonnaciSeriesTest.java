package io.github.jamers.math.series;

import io.github.jamers.math.series.FibonnacciSeries;
import io.github.jamers.math.series.exception.InvalidSeriesIndexException;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonnaciSeriesTest {

    @Test
    public void testGetNth() {
        FibonnacciSeries series = new FibonnacciSeries();
        assertEquals(BigInteger.valueOf(0), series.getNth(1));
        assertEquals(BigInteger.valueOf(1), series.getNth(2));
        assertEquals(BigInteger.valueOf(1), series.getNth(3));
        assertEquals(BigInteger.valueOf(2), series.getNth(4));
        assertEquals(BigInteger.valueOf(3), series.getNth(5));
        assertEquals(BigInteger.valueOf(5), series.getNth(6));
        assertEquals(BigInteger.valueOf(8), series.getNth(7));
        assertEquals(BigInteger.valueOf(13), series.getNth(8));
        assertEquals(BigInteger.valueOf(21), series.getNth(9));
        assertEquals(BigInteger.valueOf(34), series.getNth(10));
        assertEquals(BigInteger.valueOf(55), series.getNth(11));
        assertEquals(BigInteger.valueOf(89), series.getNth(12));
        assertEquals(BigInteger.valueOf(144), series.getNth(13));
        assertEquals(BigInteger.valueOf(233), series.getNth(14));
        assertEquals(BigInteger.valueOf(377), series.getNth(15));
        assertEquals(BigInteger.valueOf(610), series.getNth(16));
        assertEquals(BigInteger.valueOf(987), series.getNth(17));
        assertEquals(BigInteger.valueOf(1597), series.getNth(18));
        assertEquals(BigInteger.valueOf(2584), series.getNth(19));
        assertEquals(BigInteger.valueOf(4181), series.getNth(20));
        assertEquals(BigInteger.valueOf(6765), series.getNth(21));
        assertEquals(BigInteger.valueOf(10946), series.getNth(22));
        assertEquals(BigInteger.valueOf(17711), series.getNth(23));
        assertEquals(BigInteger.valueOf(28657), series.getNth(24));
        assertEquals(BigInteger.valueOf(46368), series.getNth(25));
        assertEquals(BigInteger.valueOf(75025), series.getNth(26));
        assertEquals(BigInteger.valueOf(121393), series.getNth(27));
        assertEquals(BigInteger.valueOf(196418), series.getNth(28));
        assertEquals(BigInteger.valueOf(317811), series.getNth(29));
        assertEquals(BigInteger.valueOf(514229), series.getNth(30));
        assertEquals(BigInteger.valueOf(832040), series.getNth(31));
        assertEquals(BigInteger.valueOf(1346269), series.getNth(32));
        assertEquals(BigInteger.valueOf(2178309), series.getNth(33));
        assertEquals(BigInteger.valueOf(3524578), series.getNth(34));
        assertEquals(BigInteger.valueOf(5702887), series.getNth(35));
        assertEquals(BigInteger.valueOf(9227465), series.getNth(36));
        assertEquals(BigInteger.valueOf(14930352), series.getNth(37));
        assertEquals(BigInteger.valueOf(24157817), series.getNth(38));
        assertEquals(BigInteger.valueOf(39088169), series.getNth(39));
    }

    @Test
    public void testGetNthWithNonDefaultStartValues() {
        FibonnacciSeries series = new FibonnacciSeries(1, 2);
        assertEquals(BigInteger.valueOf(1), series.getNth(1));
        assertEquals(BigInteger.valueOf(2), series.getNth(2));
        assertEquals(BigInteger.valueOf(3), series.getNth(3));
        assertEquals(BigInteger.valueOf(5), series.getNth(4));
        assertEquals(BigInteger.valueOf(8), series.getNth(5));
        assertEquals(BigInteger.valueOf(13), series.getNth(6));
        assertEquals(BigInteger.valueOf(21), series.getNth(7));
        assertEquals(BigInteger.valueOf(34), series.getNth(8));
        assertEquals(BigInteger.valueOf(55), series.getNth(9));
        assertEquals(BigInteger.valueOf(89), series.getNth(10));
        assertEquals(BigInteger.valueOf(144), series.getNth(11));
        assertEquals(BigInteger.valueOf(233), series.getNth(12));
        assertEquals(BigInteger.valueOf(377), series.getNth(13));
        assertEquals(BigInteger.valueOf(610), series.getNth(14));
        assertEquals(BigInteger.valueOf(987), series.getNth(15));
        assertEquals(BigInteger.valueOf(1597), series.getNth(16));
        assertEquals(BigInteger.valueOf(2584), series.getNth(17));
        assertEquals(BigInteger.valueOf(4181), series.getNth(18));
        assertEquals(BigInteger.valueOf(6765), series.getNth(19));
        assertEquals(BigInteger.valueOf(10946), series.getNth(20));
        assertEquals(BigInteger.valueOf(17711), series.getNth(21));
        assertEquals(BigInteger.valueOf(28657), series.getNth(22));
        assertEquals(BigInteger.valueOf(46368), series.getNth(23));
        assertEquals(BigInteger.valueOf(75025), series.getNth(24));
        assertEquals(BigInteger.valueOf(121393), series.getNth(25));
        assertEquals(BigInteger.valueOf(196418), series.getNth(26));
        assertEquals(BigInteger.valueOf(317811), series.getNth(27));
        assertEquals(BigInteger.valueOf(514229), series.getNth(28));
        assertEquals(BigInteger.valueOf(832040), series.getNth(29));
        assertEquals(BigInteger.valueOf(1346269), series.getNth(30));
        assertEquals(BigInteger.valueOf(2178309), series.getNth(31));
        assertEquals(BigInteger.valueOf(3524578), series.getNth(32));
        assertEquals(BigInteger.valueOf(5702887), series.getNth(33));
        assertEquals(BigInteger.valueOf(9227465), series.getNth(34));
        assertEquals(BigInteger.valueOf(14930352), series.getNth(35));
        assertEquals(BigInteger.valueOf(24157817), series.getNth(36));
        assertEquals(BigInteger.valueOf(39088169), series.getNth(37));
    }

    @Test(expected = InvalidSeriesIndexException.class)
    public void testGetNthBadIndex() {
        FibonnacciSeries series = new FibonnacciSeries();
        series.getNth(0);
    }
}
