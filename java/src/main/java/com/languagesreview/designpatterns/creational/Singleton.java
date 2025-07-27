package com.languagesreview.designpatterns.creational;

/**
 * Singleton Pattern - Ensures a class has only one instance and provides global access
 */
public class Singleton {
    private static Singleton instance;
    private String data;
    
    // Private constructor to prevent instantiation
    private Singleton() {
        data = "Singleton data";
    }
    
    // Public method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Singleton{data='" + data + "'}";
    }
}

/**
 * Thread-safe Singleton using double-checked locking
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private String data;
    
    private ThreadSafeSingleton() {
        data = "Thread-safe singleton data";
    }
    
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "ThreadSafeSingleton{data='" + data + "'}";
    }
} 