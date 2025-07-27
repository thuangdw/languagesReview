package com.languagesreview.basicsyntax;

/**
 * Custom exception for invalid age validation
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
} 