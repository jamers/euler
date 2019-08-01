package io.github.jamers.math.series.iterator;

import io.github.jamers.math.series.PrimeSeries;
import io.github.jamers.math.series.Series;
import io.github.jamers.math.series.exception.InvalidSeriesIndexException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeSeriesIteratorTest
{
    @Test
    public void testNext() throws IOException
    {
        SeriesIterator series = new PrimeSeriesIterator();
        List<String> primes = loadPrimes();
        for(int i = 1; i <= primes.size(); i++)
        {
            assertEquals(new BigInteger(primes.get(i)), series.next());
        }
    }

    private List<String> loadPrimes() throws IOException
    {
        List<String> primes = IOUtils.readLines(PrimeSeriesIteratorTest.class.getResourceAsStream("/primes.txt"), Charset.defaultCharset());
        return primes;
    }
}
