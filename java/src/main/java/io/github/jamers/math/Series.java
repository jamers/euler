package io.github.jamers.math;

import java.util.List;

public interface Series<T> {
    T next();
    T getNth(int n);
}
