package com.languagesreview.designpatterns.creational;

/**
 * Prototype Pattern - Creates new objects by cloning an existing object
 */

// Prototype interface
public interface Shape extends Cloneable {
    Shape clone();
    void draw();
}

// Concrete prototypes
public class Circle implements Shape {
    private int radius;
    private String color;
    
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public Shape clone() {
        return new Circle(this.radius, this.color);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
    
    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", color='" + color + "'}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return radius == circle.radius && color.equals(circle.color);
    }
}

public class Rectangle implements Shape {
    private int width;
    private int height;
    private String color;
    
    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height, this.color);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle " + width + "x" + height);
    }
    
    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + ", color='" + color + "'}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && height == rectangle.height && color.equals(rectangle.color);
    }
} 