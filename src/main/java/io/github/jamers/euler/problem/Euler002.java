package io.github.jamers.euler.problem;

import io.github.jamers.euler.EulerProblem;
import io.github.jamers.math.FibonnacciSeriesIterator;
import io.github.jamers.math.MathUtil;
import io.github.jamers.math.NumberUtil;

import java.math.BigInteger;

/**
 * Created by jamers on 27/01/2016.
 * <p>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Euler002 implements EulerProblem {
    @Override
    public int solve() {
        int limit = 4_000_000;
        return addEvenValuedFibonnacciTerms(limit);
    }

    public int addEvenValuedFibonnacciTerms(int limit) {
        int result = 0;
        FibonnacciSeriesIterator i = new FibonnacciSeriesIterator(1, 2);
        for(BigInteger v : i) {
            if(v.intValue() > limit) {
                break;
            } else if(NumberUtil.isEven(v)) {
                result = result + v.intValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Euler002().solve());
    }
}
