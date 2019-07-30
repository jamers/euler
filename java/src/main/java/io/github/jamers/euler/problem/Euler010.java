package io.github.jamers.euler.problem;

import io.github.jamers.math.PrimeSeries;

import java.math.BigInteger;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
 * Find the sum of primes below two million.
 */
public class Euler010
{
    public BigInteger solve() {
        PrimeSeries primes = new PrimeSeries();
        BigInteger prime = primes.next();
        BigInteger sum = BigInteger.ZERO;
        while(prime.compareTo(BigInteger.valueOf(2000000)) < 1) {
            sum = sum.add(prime);
            prime = primes.next();
        }
        return sum;
    }
}
