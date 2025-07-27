package com.languagesreview.designpatterns.creational;

/**
 * Abstract Factory Pattern - Provides an interface for creating families of related objects
 */

// Abstract products
public interface Chair {
    String getStyle();
    void sit();
}

public interface Table {
    String getStyle();
    void eat();
}

// Concrete products - Modern family
public class ModernChair implements Chair {
    @Override
    public String getStyle() {
        return "Modern";
    }
    
    @Override
    public void sit() {
        System.out.println("Sitting on a modern chair");
    }
}

public class ModernTable implements Table {
    @Override
    public String getStyle() {
        return "Modern";
    }
    
    @Override
    public void eat() {
        System.out.println("Eating on a modern table");
    }
}

// Concrete products - Vintage family
public class VintageChair implements Chair {
    @Override
    public String getStyle() {
        return "Vintage";
    }
    
    @Override
    public void sit() {
        System.out.println("Sitting on a vintage chair");
    }
}

public class VintageTable implements Table {
    @Override
    public String getStyle() {
        return "Vintage";
    }
    
    @Override
    public void eat() {
        System.out.println("Eating on a vintage table");
    }
}

// Abstract factory
public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

// Concrete factories
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    
    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

public class VintageFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }
    
    @Override
    public Table createTable() {
        return new VintageTable();
    }
} 