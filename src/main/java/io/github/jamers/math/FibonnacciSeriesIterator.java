package io.github.jamers.math;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * Created by jamers on 06/02/2016.
 */
public class FibonnacciSeriesIterator implements Iterator<BigInteger>, Iterable<BigInteger> {

    private final FibonnacciSeries series;

    public FibonnacciSeriesIterator() {
        series = new FibonnacciSeries();
    }

    public FibonnacciSeriesIterator(BigInteger one, BigInteger two) {
        series = new FibonnacciSeries(one, two);
    }

    public FibonnacciSeriesIterator(Integer one, Integer two) {
        series = new FibonnacciSeries(one, two);
    }

    @Override
    public BigInteger next() {
        return series.next();
    }

    @Override
    public Iterator<BigInteger> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
