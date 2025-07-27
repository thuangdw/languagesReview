package com.languagesreview.designpatterns.behavioral;

import java.util.Stack;

/**
 * Memento Pattern - Captures and externalizes an object's internal state
 */

// Memento
public class EditorMemento {
    private String content;
    
    public EditorMemento(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
}

// Originator
public class Editor {
    private String content;
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public EditorMemento save() {
        return new EditorMemento(content);
    }
    
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}

// Caretaker
public class Caretaker {
    private Stack<EditorMemento> mementos;
    
    public Caretaker() {
        this.mementos = new Stack<>();
    }
    
    public void save(EditorMemento memento) {
        mementos.push(memento);
    }
    
    public EditorMemento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
} 