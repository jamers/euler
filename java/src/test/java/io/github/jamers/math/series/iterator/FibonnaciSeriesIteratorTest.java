package io.github.jamers.math.series.iterator;

import io.github.jamers.math.series.iterator.FibonnacciSeriesIterator;
import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.assertEquals;

public class FibonnaciSeriesIteratorTest
{

    @Test
    public void testNext() {
        FibonnacciSeriesIterator series = new FibonnacciSeriesIterator();
        assertEquals(BigInteger.valueOf(0), series.next());
        assertEquals(BigInteger.valueOf(1), series.next());
        assertEquals(BigInteger.valueOf(1), series.next());
        assertEquals(BigInteger.valueOf(2), series.next());
        assertEquals(BigInteger.valueOf(3), series.next());
        assertEquals(BigInteger.valueOf(5), series.next());
        assertEquals(BigInteger.valueOf(8), series.next());
        assertEquals(BigInteger.valueOf(13), series.next());
        assertEquals(BigInteger.valueOf(21), series.next());
        assertEquals(BigInteger.valueOf(34), series.next());
        assertEquals(BigInteger.valueOf(55), series.next());
        assertEquals(BigInteger.valueOf(89), series.next());
        assertEquals(BigInteger.valueOf(144), series.next());
        assertEquals(BigInteger.valueOf(233), series.next());
        assertEquals(BigInteger.valueOf(377), series.next());
        assertEquals(BigInteger.valueOf(610), series.next());
        assertEquals(BigInteger.valueOf(987), series.next());
        assertEquals(BigInteger.valueOf(1597), series.next());
        assertEquals(BigInteger.valueOf(2584), series.next());
        assertEquals(BigInteger.valueOf(4181), series.next());
        assertEquals(BigInteger.valueOf(6765), series.next());
        assertEquals(BigInteger.valueOf(10946), series.next());
        assertEquals(BigInteger.valueOf(17711), series.next());
        assertEquals(BigInteger.valueOf(28657), series.next());
        assertEquals(BigInteger.valueOf(46368), series.next());
        assertEquals(BigInteger.valueOf(75025), series.next());
        assertEquals(BigInteger.valueOf(121393), series.next());
        assertEquals(BigInteger.valueOf(196418), series.next());
        assertEquals(BigInteger.valueOf(317811), series.next());
        assertEquals(BigInteger.valueOf(514229), series.next());
        assertEquals(BigInteger.valueOf(832040), series.next());
        assertEquals(BigInteger.valueOf(1346269), series.next());
        assertEquals(BigInteger.valueOf(2178309), series.next());
        assertEquals(BigInteger.valueOf(3524578), series.next());
        assertEquals(BigInteger.valueOf(5702887), series.next());
        assertEquals(BigInteger.valueOf(9227465), series.next());
        assertEquals(BigInteger.valueOf(14930352), series.next());
        assertEquals(BigInteger.valueOf(24157817), series.next());
        assertEquals(BigInteger.valueOf(39088169), series.next());
    }

    @Test
    public void testNextWithNonDefaultStartValues() {
        FibonnacciSeriesIterator series = new FibonnacciSeriesIterator(1, 2);
        assertEquals(BigInteger.valueOf(1), series.next());
        assertEquals(BigInteger.valueOf(2), series.next());
        assertEquals(BigInteger.valueOf(3), series.next());
        assertEquals(BigInteger.valueOf(5), series.next());
        assertEquals(BigInteger.valueOf(8), series.next());
        assertEquals(BigInteger.valueOf(13), series.next());
        assertEquals(BigInteger.valueOf(21), series.next());
        assertEquals(BigInteger.valueOf(34), series.next());
        assertEquals(BigInteger.valueOf(55), series.next());
        assertEquals(BigInteger.valueOf(89), series.next());
        assertEquals(BigInteger.valueOf(144), series.next());
        assertEquals(BigInteger.valueOf(233), series.next());
        assertEquals(BigInteger.valueOf(377), series.next());
        assertEquals(BigInteger.valueOf(610), series.next());
        assertEquals(BigInteger.valueOf(987), series.next());
        assertEquals(BigInteger.valueOf(1597), series.next());
        assertEquals(BigInteger.valueOf(2584), series.next());
        assertEquals(BigInteger.valueOf(4181), series.next());
        assertEquals(BigInteger.valueOf(6765), series.next());
        assertEquals(BigInteger.valueOf(10946), series.next());
        assertEquals(BigInteger.valueOf(17711), series.next());
        assertEquals(BigInteger.valueOf(28657), series.next());
        assertEquals(BigInteger.valueOf(46368), series.next());
        assertEquals(BigInteger.valueOf(75025), series.next());
        assertEquals(BigInteger.valueOf(121393), series.next());
        assertEquals(BigInteger.valueOf(196418), series.next());
        assertEquals(BigInteger.valueOf(317811), series.next());
        assertEquals(BigInteger.valueOf(514229), series.next());
        assertEquals(BigInteger.valueOf(832040), series.next());
        assertEquals(BigInteger.valueOf(1346269), series.next());
        assertEquals(BigInteger.valueOf(2178309), series.next());
        assertEquals(BigInteger.valueOf(3524578), series.next());
        assertEquals(BigInteger.valueOf(5702887), series.next());
        assertEquals(BigInteger.valueOf(9227465), series.next());
        assertEquals(BigInteger.valueOf(14930352), series.next());
        assertEquals(BigInteger.valueOf(24157817), series.next());
        assertEquals(BigInteger.valueOf(39088169), series.next());
    }
}
