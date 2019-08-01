package io.github.jamers.math.series;

import io.github.jamers.math.series.exception.InvalidSeriesIndexException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeSeries implements Series<BigInteger> {

    private static final Logger logger = LoggerFactory.getLogger(PrimeSeries.class);

    private boolean[] sieve; // sieve of Erastothenes
    private List<BigInteger> results = new ArrayList<>(); // List of prime numbers we have worked out so far

    public PrimeSeries() {
        doubleCalculatedAmount();
    }

    private void doubleCalculatedAmount() {
        int originalSieveLength;
        if(sieve == null)
        {
            originalSieveLength = 0;
            sieve = new boolean[100];
        } else {
            originalSieveLength = sieve.length;
            sieve = Arrays.copyOf(sieve, sieve.length * 2);
        }

        for(int i = originalSieveLength ; i < sieve.length; i++) {
            sieve[i] = true;
        }
        sieve[0] = false; // 0 is not prime
        sieve[1] = false; // 1 is not prime

        int sieveCounter = 0;
        while(sieveCounter < Math.sqrt(sieve.length)) {
            if(sieve[sieveCounter]) { // if it is prime
                sieve(sieveCounter); // then get with the sieving
            }
            sieveCounter ++;
        }

        for(int i = originalSieveLength; i < sieve.length; i ++) {
            if(sieve[i]) {
                results.add(BigInteger.valueOf(i));
            }
        }
        logger.info("Extended series size from {} to {}.", originalSieveLength, sieve.length);
    }

    private void sieve(int sieveCounter)
    {
        // Uncommenting the logging takes test from 600ms to 28s!!!!!
        //logger.info("{} is prime.", sieveCounter);
        for(int i = sieveCounter * 2; i < sieve.length; i += sieveCounter) {
            if(sieve[i])
            {
                sieve[i] = false;
                //logger.info("{} is not prime.", i);
            }
        }
    }

    @Override public BigInteger getNth(int n)
    {
        if(n < 1) {
            throw new InvalidSeriesIndexException(this.getClass(), n);
        }
        while(n >= results.size()) {
            doubleCalculatedAmount();
        }
        return results.get(n - 1);
    }
}
