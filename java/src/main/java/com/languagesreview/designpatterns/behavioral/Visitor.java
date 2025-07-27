package com.languagesreview.designpatterns.behavioral;

/**
 * Visitor Pattern - Separates an algorithm from the object structure on which it operates
 */

// Visitor interface
public interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Fruit fruit);
    double visit(Electronics electronics);
}

// Element interface
public interface Element {
    double accept(ShoppingCartVisitor visitor);
}

// Concrete elements
public class Book implements Element {
    private double price;
    private double weight;
    
    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getWeight() {
        return weight;
    }
    
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

public class Fruit implements Element {
    private double price;
    private double weight;
    
    public Fruit(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getWeight() {
        return weight;
    }
    
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

public class Electronics implements Element {
    private double price;
    private double weight;
    
    public Electronics(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getWeight() {
        return weight;
    }
    
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

// Concrete visitors
public class PriceVisitor implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        return book.getPrice();
    }
    
    @Override
    public double visit(Fruit fruit) {
        return fruit.getPrice();
    }
    
    @Override
    public double visit(Electronics electronics) {
        return electronics.getPrice();
    }
}

public class WeightVisitor implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        return book.getWeight();
    }
    
    @Override
    public double visit(Fruit fruit) {
        return fruit.getWeight();
    }
    
    @Override
    public double visit(Electronics electronics) {
        return electronics.getWeight();
    }
} 