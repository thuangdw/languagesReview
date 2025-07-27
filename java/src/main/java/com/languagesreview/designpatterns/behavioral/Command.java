package com.languagesreview.designpatterns.behavioral;

/**
 * Command Pattern - Encapsulates a request as an object
 */

// Command interface
public interface Command {
    void execute();
}

// Receiver
public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    
    public void turnOff() {
        System.out.println("Light is OFF");
    }
    
    public void dim() {
        System.out.println("Light is DIM");
    }
}

// Concrete commands
public class TurnOnCommand implements Command {
    private Light light;
    
    public TurnOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.turnOn();
    }
}

public class TurnOffCommand implements Command {
    private Light light;
    
    public TurnOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.turnOff();
    }
}

public class DimCommand implements Command {
    private Light light;
    
    public DimCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.dim();
    }
}

// Invoker
public class RemoteControl {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
} 