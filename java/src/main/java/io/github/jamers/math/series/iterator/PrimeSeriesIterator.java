package io.github.jamers.math.series.iterator;

import io.github.jamers.math.series.PrimeSeries;

import java.math.BigInteger;
import java.util.Iterator;

public class PrimeSeriesIterator implements SeriesIterator<BigInteger> {

    private final PrimeSeries series= new PrimeSeries();
    private int current = 0;

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
