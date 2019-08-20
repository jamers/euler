package io.github.jamers.euler.problem;

import io.github.jamers.math.MathUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Let d(n) be defined as the sum of proper divisors of n. (numbers less than n which divide exactly into n)
 * If d(a) = b and d(b) = a where a != b then a and b are an amicable pair.
 * Evaluate the sum of all amicable numbers under 10000
 */
public class Euler021
{
    private static final Logger logger = LoggerFactory.getLogger(Euler021.class);

    public int solve() {
        Map<Integer, Integer> dMap = new HashMap<>();
        for(int i = 1; i < 10000; i++) {
            Set<Integer> integers = MathUtil.calculateProperDivisors(i);
            dMap.put(i, sum(integers));
        }
        Set<Integer> amicableNumbers = new HashSet<>();
        for(int a : dMap.keySet()) {
            int da = dMap.get(a);
            Integer db = dMap.get(da);
            if(db != null && db == a && db != da) {
                amicableNumbers.add(a);
                amicableNumbers.add(da);
                logger.info("Amicable pair: {} and {}", a, da);
            }
        }
        return sum(amicableNumbers);
    }

    private Integer sum(Set<Integer> integers)
    {
        int sum = 0;
        for(Integer i : integers) {
            sum += i;
        }
        return sum;
    }
}
