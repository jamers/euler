package io.github.jamers.math;

import io.github.jamers.math.series.TriangleSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.*;

public class NumberUtil {
    private static final Logger logger = LoggerFactory.getLogger(NumberUtil.class);

    public static boolean isEven(BigInteger bigInteger) {
        BigInteger[] bigIntegers = bigInteger.divideAndRemainder(BigInteger.valueOf(2));
        return bigIntegers[1].equals(BigInteger.ZERO);
    }

    public static boolean isEven(int i) {
        int remainder = i % 2;
        return remainder == 0;
    }

    public static List<Character> toSortedDigitsList(BigInteger counter) {
        List<Character> x = new ArrayList<>();
        for(char c : String.valueOf(counter).toCharArray()) {
            x.add(c);
        }
        Collections.sort(x);
        return x;
    }

    public static Set<Integer> listDivisors(int x) {
        Set<Integer> divisors = new HashSet<>();
        double limit = Math.sqrt(x);
        for(int i = 1; i <= limit; i++) {
            int remainder = x % i;
            int divisor = x / i;
            if(remainder == 0) {
                divisors.add(i);
                divisors.add(divisor);
            }
        }
//        logger.info("Divisors of {}: {}", x, divisors);
        return divisors;
    }
}
