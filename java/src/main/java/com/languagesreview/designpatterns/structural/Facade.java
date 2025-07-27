package com.languagesreview.designpatterns.structural;

/**
 * Facade Pattern - Provides a simplified interface to a complex subsystem
 */

// Complex subsystem classes
public class SubsystemA {
    public void operationA1() {
        System.out.println("SubsystemA: Operation A1");
    }
    
    public void operationA2() {
        System.out.println("SubsystemA: Operation A2");
    }
}

public class SubsystemB {
    public void operationB1() {
        System.out.println("SubsystemB: Operation B1");
    }
    
    public void operationB2() {
        System.out.println("SubsystemB: Operation B2");
    }
}

public class SubsystemC {
    public void operationC1() {
        System.out.println("SubsystemC: Operation C1");
    }
    
    public void operationC2() {
        System.out.println("SubsystemC: Operation C2");
    }
}

// Facade
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;
    
    public Facade(SubsystemA subsystemA, SubsystemB subsystemB, SubsystemC subsystemC) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
        this.subsystemC = subsystemC;
    }
    
    public void operation1() {
        System.out.println("Facade: Starting Operation 1");
        subsystemA.operationA1();
        subsystemB.operationB1();
        subsystemC.operationC1();
        System.out.println("Facade: Operation 1 completed");
    }
    
    public void operation2() {
        System.out.println("Facade: Starting Operation 2");
        subsystemA.operationA2();
        subsystemB.operationB2();
        subsystemC.operationC2();
        System.out.println("Facade: Operation 2 completed");
    }
} 