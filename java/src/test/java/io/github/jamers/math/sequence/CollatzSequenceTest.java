package io.github.jamers.math.sequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollatzSequenceTest
{
    @Test
    public void test() {
        assertEquals(10, new CollatzSequence(13).getSize());
    }
}
