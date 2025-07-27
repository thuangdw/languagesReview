package com.languagesreview.designpatterns.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite Pattern - Composes objects into tree structures
 */

// Component interface
public interface FileSystemComponent {
    void display(int depth);
    int getSize();
}

// Leaf
public class File implements FileSystemComponent {
    private String name;
    private int size;
    
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent + "File: " + name + " (" + size + " bytes)");
    }
    
    @Override
    public int getSize() {
        return size;
    }
}

// Composite
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;
    
    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }
    
    @Override
    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent + "Directory: " + name);
        
        for (FileSystemComponent child : children) {
            child.display(depth + 1);
        }
    }
    
    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }
} 