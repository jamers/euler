package io.github.jamers.euler.problem;

import io.github.jamers.math.MathUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

/**
 * Find the sum of the digits in 100!
 */
public class Euler020
{
    private static final Logger logger = LoggerFactory.getLogger(Euler020.class);

    public int solve() {
        BigInteger factorial = MathUtil.factorial(BigInteger.valueOf(100));
        List<Character> characters = MathUtil.toDigitsList(factorial);
        return MathUtil.sumDigits(characters);
    }
}
