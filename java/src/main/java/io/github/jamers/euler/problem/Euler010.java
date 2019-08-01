package io.github.jamers.euler.problem;

import io.github.jamers.math.series.PrimeSeries;

import java.math.BigInteger;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
 * Find the sum of primes below two million.
 */
public class Euler010
{
    public BigInteger solve() {
        PrimeSeries primes = new PrimeSeries();
        BigInteger sum = BigInteger.ZERO;
        int counter = 1;
        BigInteger prime = primes.getNth(counter);
        while(prime.compareTo(BigInteger.valueOf(2000000)) < 1) {
            sum = sum.add(prime);

            counter += 1;
            prime = primes.getNth(counter);
        }
        return sum;
    }
}
