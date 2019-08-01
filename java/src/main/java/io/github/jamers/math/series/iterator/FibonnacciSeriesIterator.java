package io.github.jamers.math.series.iterator;

import io.github.jamers.math.series.FibonnacciSeries;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonnacciSeriesIterator implements SeriesIterator<BigInteger> {

    private final FibonnacciSeries series;
    private int current = 0;

    public FibonnacciSeriesIterator() {
        series = new FibonnacciSeries();
    }

    public FibonnacciSeriesIterator(Integer first, Integer second) {
        series = new FibonnacciSeries(BigInteger.valueOf(first), BigInteger.valueOf(second));
    }

    public FibonnacciSeriesIterator(BigInteger first, BigInteger second) {
        series = new FibonnacciSeries(first, second);
    }

    @Override
    public BigInteger next() {
        current += 1;
        return series.getNth(current);
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
