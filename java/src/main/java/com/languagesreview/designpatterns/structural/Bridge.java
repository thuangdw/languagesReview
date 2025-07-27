package com.languagesreview.designpatterns.structural;

/**
 * Bridge Pattern - Separates abstraction from implementation
 */

// Implementation interface
public interface DrawingAPI {
    void drawCircle(int x, int y, int radius);
    void drawRectangle(int x, int y, int width, int height);
}

// Concrete implementations
public class RasterDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing circle at (" + x + "," + y + ") with radius " + radius + " using Raster API");
    }
    
    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Drawing rectangle at (" + x + "," + y + ") with size " + width + "x" + height + " using Raster API");
    }
}

public class VectorDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing circle at (" + x + "," + y + ") with radius " + radius + " using Vector API");
    }
    
    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Drawing rectangle at (" + x + "," + y + ") with size " + width + "x" + height + " using Vector API");
    }
}

// Abstraction
abstract class Shape {
    protected DrawingAPI drawingAPI;
    
    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }
    
    public abstract void draw();
}

// Refined abstractions
public class CircleShape extends Shape {
    private int x, y, radius;
    
    public CircleShape(DrawingAPI drawingAPI, int x, int y, int radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}

public class RectangleShape extends Shape {
    private int x, y, width, height;
    
    public RectangleShape(DrawingAPI drawingAPI, int x, int y, int width, int height) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        drawingAPI.drawRectangle(x, y, width, height);
    }
} 