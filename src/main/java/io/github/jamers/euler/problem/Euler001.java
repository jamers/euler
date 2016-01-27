package io.github.jamers.euler.problem;

import io.github.jamers.euler.EulerProblem;
import io.github.jamers.math.MathUtil;

/**
 * Created by jamers on 27/01/2016.
 */
public class Euler001 implements EulerProblem {
    @Override
    public int solve() {
        int limit = 1000;
        int multiple1 = 3;
        int multiple2 = 5;
        return MathUtil.calculateSumOfMultiples(limit, multiple1, multiple2);
    }

    public static void main(String[] args) {
        System.out.println(new Euler001().solve());
    }
}
