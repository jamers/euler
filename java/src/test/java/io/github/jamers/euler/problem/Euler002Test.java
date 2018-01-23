package io.github.jamers.euler.problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamers on 27/01/2016.
 */
public class Euler002Test {
    @Test
    public void testSolve() {
        assertEquals(4613732, new Euler002().addEvenValuedFibonnacciTerms(4_000_000));
    }
}