package io.github.jamers.math;

import io.github.jamers.euler.problem.Euler014;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.*;

public class MathUtil {
    private static final Logger logger = LoggerFactory.getLogger(MathUtil.class);

    public static int calculateSumOfMultiples(int limit, int... multiples) {
        int sum = 0;
        for(int i = 1; i < limit; i++) {
            for(int multiple : multiples) {
                if (isMultiple(i, multiple)) {
                    sum+=i;
                    break;
                }
            }
        }
        return sum;
    }

    public static boolean isMultiple(int i, int multiple) {
        return i % multiple == 0;
    }


    public static boolean isEven(BigInteger bigInteger) {
        BigInteger[] bigIntegers = bigInteger.divideAndRemainder(BigInteger.valueOf(2));
        return bigIntegers[1].equals(BigInteger.ZERO);
    }

    public static boolean isEven(int i) {
        int remainder = i % 2;
        return remainder == 0;
    }

    public static boolean isEven(long i) {
        long remainder = i % 2;
        return remainder == 0;
    }

    public static List<Character> toSortedDigitsList(BigInteger counter) {
        List<Character> x = toDigitsList(counter);
        Collections.sort(x);
        return x;
    }

    public static List<Character> toDigitsList(BigInteger counter) {
        List<Character> x = new ArrayList<>();
        for(char c : String.valueOf(counter).toCharArray()) {
            x.add(c);
        }
        return x;
    }

    public static Set<Integer> calculateDivisors(int x) {
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

    public static Set<Integer> calculateProperDivisors(int x) {
        Set<Integer> divisors = calculateDivisors(x);
        divisors.remove(x);
        return divisors;
    }

    public static BigInteger factorial(BigInteger n) {
        if(n.compareTo(BigInteger.valueOf(2)) < 0) {
            return n;
        }
        BigInteger factorial = factorial(n.subtract(BigInteger.ONE));

        return n.multiply(factorial);
    }

    public static List<Character> toDigitsList(long num)
    {
        return toDigitsList(BigInteger.valueOf(num));
    }

    public static int sumDigits(List<Character> characters)
    {
        int sum = 0;
        for(Character c : characters) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
