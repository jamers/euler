package io.github.jamers.math.series.exception;

import io.github.jamers.math.series.Series;

public class InvalidSeriesIndexException extends RuntimeException
{
    public InvalidSeriesIndexException(String message) {
        super(message);
    }

    public InvalidSeriesIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSeriesIndexException(Class<? extends Series> c, int index) {
        super("Invalid index requested for " + c + ": " + index + ". Index must be > 0.");
    }
}
