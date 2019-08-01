package io.github.jamers.math.series;

import io.github.jamers.math.series.exception.InvalidSeriesIndexException;
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
    public void testGetNth() throws IOException
    {
        Series series = new PrimeSeries();
        List<String> primes = loadPrimes();
        for(int i = 1; i <= primes.size(); i++)
        {
            assertEquals(new BigInteger(primes.get(i - 1)), series.getNth(i));
        }
    }

    @Test(expected = InvalidSeriesIndexException.class)
    public void testGetNthBadIndex() {
        PrimeSeries series = new PrimeSeries();
        series.getNth(0);
    }

    private List<String> loadPrimes() throws IOException
    {
        List<String> primes = IOUtils.readLines(PrimeSeriesTest.class.getResourceAsStream("/primes.txt"), Charset.defaultCharset());
        return primes;
    }
}
