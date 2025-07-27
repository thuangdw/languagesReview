package com.languagesreview.basicsyntax;

/**
 * Example of an AutoCloseable resource for try-with-resources demonstration
 */
public class AutoCloseableResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Resource is doing something");
    }
    
    @Override
    public void close() {
        System.out.println("Resource is being closed");
    }
} 