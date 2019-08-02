package io.github.jamers.euler.problem;

import io.github.jamers.math.sequence.CollatzSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *  n -> n/2 (n is even)
 *  n -> 3n + 1 (n is odd)
 * Using the above rule and starting with 13 we generate the following sequence:
 * 13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been
 * proven yet (Collatz problem), it is thought that all numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go over one million.
 */
public class Euler014
{
    private static final Logger logger = LoggerFactory.getLogger(Euler014.class);

    public long solve() {
        long maxSize = -1;
        long startingNumber = -1;
        for(long i = 1; i <= 1000000; i++) {
            long size = new CollatzSequence(i).getSize();
            if(size > maxSize) {
                maxSize = size;
                startingNumber = i;
                logger.info("New record: length {} generated from {}.", maxSize, startingNumber);
            }
        }
        return startingNumber;
    }
}
