package io.github.jamers.euler.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c for which
 * a^2 + b^2 = c^2
 * For example 3, 4, 5 - 9 + 16 = 25
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000
 * Find the product abc
 */
public class Euler009
{
    private static final Logger logger = LoggerFactory.getLogger(Euler009.class);

    public int solve() {
        for(int a = 1; a < 999; a++) {
            for(int b = a + 1; b < 999; b++) {
                for(int c = b + 1; c < 999; c++) {
                    if((a + b + c) == 1000) {
                        if(isPythagoreanTriplet(a, b, c)) {
                            logger.info("isPythagoreanTriplet: {}, {}, {}", a, b, c);
                            return a * b * c;
                        }
                    }
                }
            }
        }
        return -1;
    }

    private boolean isPythagoreanTriplet(int a, int b, int c)
    {
//        logger.info("Add to 1000: {}, {}, {}", a, b, c);
        return ((a * a ) + (b * b)) == (c * c);
    }
}
