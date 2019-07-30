package io.github.jamers.euler.problem;

/**
 * The sum of the squares of the first ten natural numbers is
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares and the square of the sum of the first ten natural numbers is 3025 - 385 = 2640
 * Find the difference between the sum of the squares and the square of the sum of the first 100 natural numbers.
 */
public class Euler006
{

    public int sumSquareDifference(int num)
    {
        int sum = 0;
        int sumOfSquares = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
            sumOfSquares += (i * i);
        }
        int squareOfSum = sum * sum;
        int diff = squareOfSum - sumOfSquares;
        return diff;
    }
}
