package com.languagesreview.basicsyntax;

/**
 * Bounded generic class that only accepts Number types
 */
public class NumberBox<T extends Number> {
    private T content;
    
    public NumberBox(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
} 