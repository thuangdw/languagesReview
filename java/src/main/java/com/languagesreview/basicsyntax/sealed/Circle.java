package com.languagesreview.basicsyntax.sealed;

/**
 * Circle shape class extending sealed Shape class
 */
public final class Circle extends Shape {
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double radius() {
        return radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
} 