package io.github.jamers.euler.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Euler015
{
    private static final Logger logger = LoggerFactory.getLogger(Euler015.class);

    public long countRoutesAcrossGridWithSize(int size) {
        logger.info("START: {}", size);
        long l = countRoutesAcrossGridWithSize(size, size, "");
        logger.info("FINISH: {} -> {}\n\n", size, l);
        return l;
    }

    private long countRoutesAcrossGridWithSize(int downCount, int rightCount, String route) {
        if(downCount + rightCount == 0) {
//            logger.info(route);
            return 1; // We are at the bottom right corner
        } else if(downCount == 0) {
            return countRoutesAcrossGridWithSize(downCount, rightCount - 1, route + "R");
        } else if (rightCount == 0){
            return countRoutesAcrossGridWithSize(downCount - 1, rightCount, route + "D");
        } else {
            return countRoutesAcrossGridWithSize(downCount, rightCount - 1, route + "R") +
                    countRoutesAcrossGridWithSize(downCount - 1 , rightCount, route + "D");
        }
    }
}
