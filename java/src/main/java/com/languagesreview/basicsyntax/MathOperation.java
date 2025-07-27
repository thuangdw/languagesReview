package com.languagesreview.basicsyntax;

/**
 * Functional interface for mathematical operations
 */
@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);
} 