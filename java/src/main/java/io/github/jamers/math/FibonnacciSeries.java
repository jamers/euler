package io.github.jamers.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by jamers on 06/02/2016.
 */
public class FibonnacciSeries implements Series<BigInteger> {

    private static final Logger logger = LoggerFactory.getLogger(FibonnacciSeries.class);
    private int current = -1;
    private BigInteger[] results;

    public FibonnacciSeries() {
        results = new BigInteger[2];
        results[0] = BigInteger.ZERO;
        results[1] = BigInteger.ONE;
    }

    public FibonnacciSeries(BigInteger one, BigInteger two) {
        results = new BigInteger[2];
        results[0] = one;
        results[1] = two;
    }

    public FibonnacciSeries(Integer one, Integer two) {
        results = new BigInteger[2];
        results[0] = BigInteger.valueOf(one);
        results[1] = BigInteger.valueOf(two);
    }

    private void populate(int requested) {
        int previousMax = results.length;

        while(requested >= results.length) {
            results = Arrays.copyOf(results, results.length * 2);
        }

        for(int i = previousMax; i < results.length; i++) {
            results[i] = calculate(i);
        }

        logger.info("Extended series size from {} to {} to accommodate requested size {}.", previousMax, results.length, requested);
    }

    private BigInteger calculate(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i < 2) {
            return BigInteger.valueOf(i);
        }
        BigInteger total = results[i - 1].add(results[i - 2]);
        if(total.compareTo(BigInteger.ZERO) < 0) {
            throw new ArithmeticException("Integer overflow occurred adding: " + results[i - 1] + ", " + results[i - 2]);
        }
        return total;
    }

    @Override
    public BigInteger next() {
        current += 1;
        if (current >= results.length) {
            populate(results.length);
        }
        return results[current];
    }

    @Override
    public BigInteger getNth(int n) {
        if(n >= results.length) {
            populate(n);
        }
        return results[n];
    }
}