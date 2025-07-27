package com.languagesreview.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer Pattern - Defines a one-to-many dependency between objects
 */

// Subject interface
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(String news);
}

// Observer interface
public interface Observer {
    void update(String news);
}

// Concrete subject
public class NewsAgency implements Subject {
    private List<Observer> observers;
    private String news;
    
    public NewsAgency() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(String news) {
        this.news = news;
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
    
    public void publishNews(String news) {
        System.out.println("News Agency publishes: " + news);
        notifyObservers(news);
    }
}

// Concrete observers
public class NewsChannel implements Observer {
    private String name;
    
    public NewsChannel(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
} 