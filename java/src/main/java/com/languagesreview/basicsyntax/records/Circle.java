package com.languagesreview.basicsyntax.records;

/**
 * Record for circle with custom area calculation method
 */
public record Circle(double radius) {
    public double area() {
        return Math.PI * radius * radius;
    }
} 