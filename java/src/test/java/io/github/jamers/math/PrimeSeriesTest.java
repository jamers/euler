package io.github.jamers.math;

import org.junit.Test;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeSeriesTest
{
    @Test
    public void testNext() throws IOException
    {
        Series series = new PrimeSeries();

        for(String nextExpectedPrime : loadPrimes())
        {
            assertEquals(new BigInteger(nextExpectedPrime), series.next());
        }

    }

    private List<String> loadPrimes() throws IOException
    {
        List<String> primes = IOUtils.readLines(PrimeSeriesTest.class.getResourceAsStream("/primes.txt"), Charset.defaultCharset());
        return primes;
    }
}
