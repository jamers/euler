package io.github.jamers.math;

public interface Series<T> {
    T next();
    T getNth(int n);
}
