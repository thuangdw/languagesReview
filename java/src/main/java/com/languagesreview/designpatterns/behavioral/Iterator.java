package com.languagesreview.designpatterns.behavioral;

import java.util.List;
import java.util.ArrayList;

/**
 * Iterator Pattern - Provides a way to access elements of a collection without exposing its underlying representation
 */

// Iterator interface
public interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Collection interface
public interface Collection<T> {
    Iterator<T> createIterator();
}

// Book class for Iterator pattern
public class IteratorBook {
    private String title;
    private String author;
    
    public IteratorBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
}

// Concrete collection
public class BookCollection implements Collection<IteratorBook> {
    private List<IteratorBook> books;
    
    public BookCollection() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(IteratorBook book) {
        books.add(book);
    }
    
    @Override
    public Iterator<IteratorBook> createIterator() {
        return new BookIterator(books);
    }
}

// Concrete iterator
public class BookIterator implements Iterator<IteratorBook> {
    private List<IteratorBook> books;
    private int position;
    
    public BookIterator(List<IteratorBook> books) {
        this.books = books;
        this.position = 0;
    }
    
    @Override
    public boolean hasNext() {
        return position < books.size();
    }
    
    @Override
    public IteratorBook next() {
        if (hasNext()) {
            return books.get(position++);
        }
        return null;
    }
} 