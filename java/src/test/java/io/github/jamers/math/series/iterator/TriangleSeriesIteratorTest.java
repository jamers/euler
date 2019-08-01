package io.github.jamers.math.series.iterator;

import io.github.jamers.math.series.TriangleSeries;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TriangleSeriesIteratorTest
{
    @Test
    public void testGetNth()
    {
        TriangleSeriesIterator series = new TriangleSeriesIterator();
        assertEquals(BigInteger.valueOf(1), series.next());
        assertEquals(BigInteger.valueOf(3), series.next());
        assertEquals(BigInteger.valueOf(6), series.next());
        assertEquals(BigInteger.valueOf(10), series.next());
        assertEquals(BigInteger.valueOf(15), series.next());
        assertEquals(BigInteger.valueOf(21), series.next());
        assertEquals(BigInteger.valueOf(28), series.next());
        assertEquals(BigInteger.valueOf(36), series.next());
        assertEquals(BigInteger.valueOf(45), series.next());
        assertEquals(BigInteger.valueOf(55), series.next());
        assertEquals(BigInteger.valueOf(66), series.next());
        assertEquals(BigInteger.valueOf(78), series.next());
        assertEquals(BigInteger.valueOf(91), series.next());
        assertEquals(BigInteger.valueOf(105), series.next());
        assertEquals(BigInteger.valueOf(120), series.next());
    }
}
