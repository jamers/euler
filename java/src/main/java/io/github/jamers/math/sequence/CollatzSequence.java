package io.github.jamers.math.sequence;

import io.github.jamers.math.NumberUtil;
import io.github.jamers.math.series.PrimeSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *  n -> n/2 (n is even)
 *  n -> 3n + 1 (n is odd)
 * Using the above rule and starting with 13 we generate the following sequence:
 * 13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been
 * proven yet (Collatz problem), it is thought that all numbers finish at 1.
 */
public class CollatzSequence
{
    private static final Logger logger = LoggerFactory.getLogger(CollatzSequence.class);

    private long[] sequence;
    private int pointer = 0;

    public CollatzSequence(long start) {
        this.sequence = new long[20];
        sequence[0] = start;
        resolve();
    }

    private void resolve() {
        long next = -1;
        while(next != 1) {
            long current = sequence[pointer];
            pointer ++;
            if(pointer >= sequence.length) {
                doubleSequence();
            }
            if(NumberUtil.isEven(current)) {
                next = current / 2;
            } else {
                next = (current * 3) + 1;
            }
            if(next < 0) {
                throw new ArithmeticException("Starting at " + sequence[0]);
            }
            sequence[pointer] = next;
        }
    }

    private void doubleSequence() {
//        logger.info("Extending sequence size from {} to {}.", sequence.length, sequence.length * 2);
        try
        {
            this.sequence = Arrays.copyOf(sequence, sequence.length * 2);
        } catch (Error e ) {
            System.out.println();
        }
    }

    public long getSize() {
        return pointer + 1;
    }
}
