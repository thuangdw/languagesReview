package com.languagesreview.basicsyntax.sealed;

/**
 * Rectangle shape class extending sealed Shape class
 */
public final class Rectangle extends Shape {
    private final double width;
    private final double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double width() {
        return width;
    }
    
    public double height() {
        return height;
    }
    
    @Override
    double area() {
        return width * height;
    }
} 