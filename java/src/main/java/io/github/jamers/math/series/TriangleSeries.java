package io.github.jamers.math.series;

import io.github.jamers.math.series.exception.InvalidSeriesIndexException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TriangleSeries implements Series<Integer>
{
    private static final Logger logger = LoggerFactory.getLogger(TriangleSeries.class);
    private List<Integer> results = new ArrayList<>();

    public TriangleSeries() {
        results.add(1);
    }

    private void doubleCalculatedAmount()
    {
        int previousNumElements = results.size();
        logger.info("Extending series size from {}.", previousNumElements);
        int nextMinus1 = results.get(previousNumElements - 1);
        for(int i = previousNumElements + 1; i <= previousNumElements * 2; i++) {
            int next = nextMinus1 + i;
            results.add(next);
            nextMinus1 = next;
        }

        logger.info("Extended series size from {} to {}. Latest triangle calculated is {}.", previousNumElements, results.size(), results.get(results.size() - 1));
    }

    @Override public Integer getNth(int n)
    {
        if(n < 1) {
            throw new InvalidSeriesIndexException(this.getClass(), n);
        }
        while(n >= results.size()) {
            doubleCalculatedAmount();
        }
        return results.get(n - 1);
    }
}
