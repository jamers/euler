package io.github.jamers.euler.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class Euler019Test
{
    @Test
    public void testGetDaysInMonth() {
        assertEquals(29, Euler019.getDaysInMonth(2, 1996));

        assertEquals(31, Euler019.getDaysInMonth(1, 1999));
        assertEquals(28, Euler019.getDaysInMonth(2, 1999));
        assertEquals(31, Euler019.getDaysInMonth(3, 1999));
        assertEquals(30, Euler019.getDaysInMonth(4, 1999));
        assertEquals(31, Euler019.getDaysInMonth(5, 1999));
        assertEquals(30, Euler019.getDaysInMonth(6, 1999));
        assertEquals(31, Euler019.getDaysInMonth(7, 1999));
        assertEquals(31, Euler019.getDaysInMonth(8, 1999));
        assertEquals(30, Euler019.getDaysInMonth(9, 1999));
        assertEquals(31, Euler019.getDaysInMonth(10, 1999));
        assertEquals(30, Euler019.getDaysInMonth(11, 1999));
        assertEquals(31, Euler019.getDaysInMonth(12, 1999));
    }

    @Test
    public void testIsLeapYear() {
        assertFalse(Euler019.isLeapYear(1900));
        assertTrue(Euler019.isLeapYear(1996));
        assertFalse(Euler019.isLeapYear(1999));
        assertTrue(Euler019.isLeapYear(2000));
    }
}
