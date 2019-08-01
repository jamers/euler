package io.github.jamers.math.series;

import io.github.jamers.math.series.exception.InvalidSeriesIndexException;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TriangleSeriesTest
{
    @Test
    public void testGetNth()
    {
        TriangleSeries series = new TriangleSeries();
        assertEquals(BigInteger.valueOf(1), series.getNth(1));
        assertEquals(BigInteger.valueOf(3), series.getNth(2));
        assertEquals(BigInteger.valueOf(6), series.getNth(3));
        assertEquals(BigInteger.valueOf(10), series.getNth(4));
        assertEquals(BigInteger.valueOf(15), series.getNth(5));
        assertEquals(BigInteger.valueOf(21), series.getNth(6));
        assertEquals(BigInteger.valueOf(28), series.getNth(7));
        assertEquals(BigInteger.valueOf(36), series.getNth(8));
        assertEquals(BigInteger.valueOf(45), series.getNth(9));
        assertEquals(BigInteger.valueOf(55), series.getNth(10));
        assertEquals(BigInteger.valueOf(66), series.getNth(11));
        assertEquals(BigInteger.valueOf(78), series.getNth(12));
        assertEquals(BigInteger.valueOf(91), series.getNth(13));
        assertEquals(BigInteger.valueOf(105), series.getNth(14));
        assertEquals(BigInteger.valueOf(120), series.getNth(15));
    }

    @Test(expected = InvalidSeriesIndexException.class)
    public void testGetNthBadIndex() {
        TriangleSeries series = new TriangleSeries();
        series.getNth(0);
    }
}
