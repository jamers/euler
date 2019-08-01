package io.github.jamers.euler.problem;

import io.github.jamers.math.series.PrimeSeries;

import java.math.BigInteger;
import java.util.TreeSet;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
public class Euler003 {

    public BigInteger largestPrimeFactor(BigInteger limit) {
        PrimeSeries primeSeries = new PrimeSeries();
        double sqrt = Math.sqrt(limit.longValue());
        BigInteger nextPrime = BigInteger.ZERO;
        TreeSet<BigInteger> factors = new TreeSet<>();
        int counter = 1;
        while (nextPrime.longValue() < sqrt)
        {
            nextPrime = primeSeries.getNth(counter);
            BigInteger[] bigIntegers = limit.divideAndRemainder(nextPrime);
            if(BigInteger.ZERO.equals(bigIntegers[1])) { // no remainder, so it is a factor
                factors.add(nextPrime);
            }
            counter += 1;
        }

        return factors.last();
    }
}