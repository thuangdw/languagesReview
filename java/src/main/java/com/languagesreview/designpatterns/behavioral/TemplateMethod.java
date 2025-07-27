package com.languagesreview.designpatterns.behavioral;

/**
 * Template Method Pattern - Defines the skeleton of an algorithm in a method
 */

// Abstract class with template method
abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

// Concrete implementations
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }
    
    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
    
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }
    
    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
    
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
} 