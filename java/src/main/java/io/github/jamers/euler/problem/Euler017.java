package io.github.jamers.euler.problem;

import io.github.jamers.math.NumberToWordFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Euler017
{
    private static final Logger logger = LoggerFactory.getLogger(Euler015.class);

    public int solve() {
        int total = 0;
        for(int i = 1; i < 1001; i++) {
            String format = NumberToWordFormatter.format(i);
//            logger.info("{} : {}", i, format);
            total = total + format.replace(" ", "").replace("-", "").length();
        }
        return total;
    }
}
