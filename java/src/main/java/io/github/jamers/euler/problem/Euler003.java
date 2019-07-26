package io.github.jamers.euler.problem;

import io.github.jamers.math.PrimeSeries;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
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

        while (nextPrime.longValue() < sqrt)
        {
            nextPrime = primeSeries.next();
            BigInteger[] bigIntegers = limit.divideAndRemainder(nextPrime);
            if(BigInteger.ZERO.equals(bigIntegers[1])) { // no remainder, so it is a factor
                factors.add(nextPrime);
            }
        }

        return factors.last();
    }
}