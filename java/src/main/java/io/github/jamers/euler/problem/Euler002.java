package io.github.jamers.euler.problem;

import io.github.jamers.math.MathUtil;
import io.github.jamers.math.series.iterator.FibonnacciSeriesIterator;

import java.math.BigInteger;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Euler002 {

    public int addEvenValuedFibonnacciTerms(int limit) {
        int result = 0;
        FibonnacciSeriesIterator i = new FibonnacciSeriesIterator(1, 2);
        for(BigInteger v : i) {
            if(v.intValue() > limit) {
                break;
            } else if(MathUtil.isEven(v)) {
                result = result + v.intValue();
            }
        }
        return result;
    }
}
