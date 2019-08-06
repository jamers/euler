package io.github.jamers.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToWordFormatterTest
{
    @Test
    public void testFormat() {
        assertEquals("one", NumberToWordFormatter.format(1));
        assertEquals("seventeen", NumberToWordFormatter.format(17));
        assertEquals("twenty-eight", NumberToWordFormatter.format(28));
        assertEquals("seventy", NumberToWordFormatter.format(70));
        assertEquals("seventy-seven", NumberToWordFormatter.format(77));
        assertEquals("one hundred and three", NumberToWordFormatter.format(103));
        assertEquals("one hundred and thirty-three", NumberToWordFormatter.format(133));
        assertEquals("eight hundred and eighty-three", NumberToWordFormatter.format(883));
        assertEquals("one thousand", NumberToWordFormatter.format(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBoundsUp() {
        NumberToWordFormatter.format(1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBoundsDown() {
        NumberToWordFormatter.format(-1);
    }
}
