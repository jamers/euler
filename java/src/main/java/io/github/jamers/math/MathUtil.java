package io.github.jamers.math;

/**
 * Created by jamers on 27/01/2016.
 */
public class MathUtil {
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
}
