package io.github.jamers.euler.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p/>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Euler005
{
    /*
    Do not need to bother checking 1 - 10, as if something is divisible by it's double, it will be divisible by it
     */
    public int solve()
    {
        for(int i = 20; i < Integer.MAX_VALUE; i += 20) {
            if(i % 19 == 0) {
                if(i % 18 == 0) {
                    if(i % 17 == 0) {
                        if(i % 16 == 0) {
                            if(i % 15 == 0) {
                                if(i % 14 == 0) {
                                    if(i % 13 == 0) {
                                        if(i % 12 == 0) {
                                            if(i % 11 == 0) {
                                                return i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
