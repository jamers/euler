package io.github.jamers.math;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jamers on 06/02/2016.
 */
public class NumberUtil {
    public static boolean isEven(BigInteger bigInteger) {
        BigInteger[] bigIntegers = bigInteger.divideAndRemainder(bigInteger.valueOf(2));
        return bigIntegers[1] == BigInteger.ZERO;
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
}
