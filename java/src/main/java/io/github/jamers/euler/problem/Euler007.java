package io.github.jamers.euler.problem;

import io.github.jamers.math.series.PrimeSeries;

import java.math.BigInteger;

/**
 * What is the 10,001st prime number?
 */
public class Euler007
{
    public BigInteger solve() {
        return new PrimeSeries().getNth(10001);
    }
}
