package com.languagesreview.designpatterns.behavioral;

/**
 * State Pattern - Allows an object to alter its behavior when its internal state changes
 */

// State interface
public interface VendingMachineState {
    void insertCoin();
    void selectProduct();
    void dispense();
}

// Context
public class VendingMachine {
    private VendingMachineState state;
    
    public VendingMachine() {
        this.state = new IdleState();
    }
    
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public void insertCoin() {
        state.insertCoin();
    }
    
    public void selectProduct() {
        state.selectProduct();
    }
    
    public void dispense() {
        state.dispense();
    }
    
    public String getState() {
        return state.getClass().getSimpleName();
    }
}

// Concrete states
public class IdleState implements VendingMachineState {
    private VendingMachine machine;
    
    public IdleState() {
        this.machine = null;
    }
    
    public void setMachine(VendingMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Moving to HasCoinState.");
        if (machine != null) {
            machine.setState(new HasCoinState());
        }
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Please insert a coin first.");
    }
    
    @Override
    public void dispense() {
        System.out.println("Please insert a coin first.");
    }
}

public class HasCoinState implements VendingMachineState {
    private VendingMachine machine;
    
    public HasCoinState() {
        this.machine = null;
    }
    
    public void setMachine(VendingMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Product selected. Moving to DispensingState.");
        if (machine != null) {
            machine.setState(new DispensingState());
        }
    }
    
    @Override
    public void dispense() {
        System.out.println("Please select a product first.");
    }
}

public class DispensingState implements VendingMachineState {
    private VendingMachine machine;
    
    public DispensingState() {
        this.machine = null;
    }
    
    public void setMachine(VendingMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Please wait for current transaction to complete.");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Product already selected.");
    }
    
    @Override
    public void dispense() {
        System.out.println("Product dispensed. Moving to IdleState.");
        if (machine != null) {
            machine.setState(new IdleState());
        }
    }
} 