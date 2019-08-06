package io.github.jamers.euler.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given the following information, but you may prefer to do some research yourself
 * - 1 Jan 1900 was a Monday
 * - 30 days hath September, April, June, and November
 *   All the rest have thirty-one
 *   Save February alone
 *   Which has twenty-eight, rain or shine.
 *   And on leap years, 29
 * - A leap year occurs on every year divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the 20th century? (1 Jan 1901 to 31 Dec 2000)?
 */
public class Euler019
{
    private static final Logger logger = LoggerFactory.getLogger(Euler015.class);

    public int solve() {
        int sundaysOnFirstOfMonth = 0;

        int dayOfMonth = 7; // Sunday
        int monthOfYear = 1;
        int year = 1900;

        while(year < 2001) {
            dayOfMonth += 7; // progress one week
            int daysInMonth = getDaysInMonth(monthOfYear, year);
            int oldDayOfMonth = dayOfMonth;
            dayOfMonth = dayOfMonth % daysInMonth;
            if(dayOfMonth == 0) {
                dayOfMonth = oldDayOfMonth;
            }
            if(oldDayOfMonth > dayOfMonth) {
                monthOfYear ++; // we have rolled into a new month
            }
            int oldMonthOfYear = monthOfYear;
            monthOfYear = monthOfYear % 12;
            if(monthOfYear == 0) {
                monthOfYear = oldMonthOfYear;
            }
            if(oldMonthOfYear > monthOfYear) {
                year ++;
                monthOfYear = 1;
            }

//            logger.info("Next Sunday = {} of {}, {}", dayOfMonth, monthOfYear, year);
            if(dayOfMonth == 1 && year > 1900) {
                sundaysOnFirstOfMonth ++;
                logger.info("FirstOfMonth #{}! Next Sunday = {} of {}, {}", sundaysOnFirstOfMonth, dayOfMonth, monthOfYear, year);
            }
        }

        return sundaysOnFirstOfMonth;
    }

    public static int getDaysInMonth(int monthOfYear, int year)
    {
        switch(monthOfYear) {
            case 1: // Jan
            case 3: // Mar
            case 5: // May
            case 7: // Jul
            case 8: // Aug
            case 10: // Oct
            case 12: // Dec
                return 31;
            case 4: //Apr
            case 6: //Jun
            case 9: //Sep
            case 11: //Nov
                return 30;
            case 2: // Feb
                if(isLeapYear(year)) {
                    return 29;
                }
                return 28;
        }

        throw new IllegalArgumentException("Invalid monthOfYear/year:" + monthOfYear + "/" + year);
    }

    public static boolean isLeapYear(int year)
    {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }
}
