package io.github.jamers.math;

/**
 * Created by jamers on 06/02/2016.
 */
public interface Series<T> {
    T next();
    T getNth(int n);
}
