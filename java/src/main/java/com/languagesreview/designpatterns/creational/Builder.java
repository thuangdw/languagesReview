package com.languagesreview.designpatterns.creational;

/**
 * Builder Pattern - Constructs complex objects step by step
 */

// Product
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    
    public Computer(String cpu, String ram, String storage, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }
    
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGpu() { return gpu; }
    
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}

// Builder
public class ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    
    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }
    
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    
    public Computer build() {
        return new Computer(cpu, ram, storage, gpu);
    }
} 