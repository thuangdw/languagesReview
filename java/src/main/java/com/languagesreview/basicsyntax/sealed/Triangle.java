package com.languagesreview.basicsyntax.sealed;

/**
 * Triangle shape class extending sealed Shape class
 */
public final class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double a() {
        return a;
    }
    
    public double b() {
        return b;
    }
    
    public double c() {
        return c;
    }
    
    @Override
    double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
} 