package io.github.jamers.euler.problem;

import io.github.jamers.math.MathUtil;

import java.math.BigInteger;
import java.util.List;

public class Euler016
{
    public int solve() {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger twoToPowerOfOneHundred = two.pow(1000);
        List<Character> characters = MathUtil.toDigitsList(twoToPowerOfOneHundred);
        return MathUtil.sumDigits(characters);
    }
}
