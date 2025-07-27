package com.languagesreview.designpatterns.creational;

/**
 * Factory Method Pattern - Defines an interface for creating objects but lets subclasses decide which class to instantiate
 */

// Product interface
public interface Vehicle {
    String getType();
    void start();
}

// Concrete products
public class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
    
    @Override
    public void start() {
        System.out.println("Car engine started");
    }
}

public class Motorcycle implements Vehicle {
    @Override
    public String getType() {
        return "Motorcycle";
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }
}

// Creator interface
public interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete creators
public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
} 