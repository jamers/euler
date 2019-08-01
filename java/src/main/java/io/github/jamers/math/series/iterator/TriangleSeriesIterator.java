package io.github.jamers.math.series.iterator;

import io.github.jamers.math.series.TriangleSeries;

import java.math.BigInteger;
import java.util.Iterator;

public class TriangleSeriesIterator implements SeriesIterator<Integer> {

    private final TriangleSeries series= new TriangleSeries();
    private int current = 0;

    @Override
    public Integer next() {
        current += 1;
        return series.getNth(current);
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
