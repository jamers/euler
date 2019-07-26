package io.github.jamers.euler.problem;

import io.github.jamers.math.MathUtil;

public class Euler001 {

    public int solve() {
        int limit = 1000;
        int multiple1 = 3;
        int multiple2 = 5;
        return MathUtil.calculateSumOfMultiples(limit, multiple1, multiple2);
    }
}
