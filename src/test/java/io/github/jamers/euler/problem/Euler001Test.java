package io.github.jamers.euler.problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamers on 27/01/2016.
 */
public class Euler001Test {
    @Test
    public void testSolve() {
        assertEquals(233168, new Euler001().solve());
    }
}
