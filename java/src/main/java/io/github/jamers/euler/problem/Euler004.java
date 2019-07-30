package io.github.jamers.euler.problem;

import io.github.jamers.math.FibonnacciSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A palindromic number reads the same both ways. The largest palindrom made from the product of two 2 digit numbers is 9009 = 91 x 99.
 * <p/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Euler004
{
    private static final Logger logger = LoggerFactory.getLogger(Euler004.class);

    public int solve()
    {
        int largestPalindromeProduct = -1;
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                int product = i * j;
                if(isPalindrome(product)){
                    logger.info("{} * {} = {}", i, j, product);
                    if(product > largestPalindromeProduct)
                    {
                        largestPalindromeProduct = product;
                    }
                }
            }
        }
        return largestPalindromeProduct;
    }

    private boolean isPalindrome(int product)
    {
        return isPalindrome(String.valueOf(product));
    }

    private boolean isPalindrome(String candidate)
    {
        return candidate.equals(new StringBuilder(candidate).reverse().toString());
    }
}
