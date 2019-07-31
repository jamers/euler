package io.github.jamers.math;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TriangleSeries implements Series<BigInteger>
{
    private int cursor;
    private List<BigInteger> triangles = new ArrayList<>();

    public TriangleSeries() {
        this.cursor = 0;
        triangles.add(BigInteger.ONE);
    }

    @Override public BigInteger next()
    {

        BigInteger previous = triangles.get(cursor);
        BigInteger next = previous.add(BigInteger.valueOf(cursor));
        cursor += 1;
        triangles.add(next);
        return next;
    }

    @Override public BigInteger getNth(int n)
    {

        return triangles.get(n - 1);
    }
}
