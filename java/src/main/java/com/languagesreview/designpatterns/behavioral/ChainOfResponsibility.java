package com.languagesreview.designpatterns.behavioral;

/**
 * Chain of Responsibility Pattern - Passes requests along a chain of handlers
 */

// Request
public class LogRequest {
    private LogLevel level;
    private String message;
    
    public LogRequest(LogLevel level, String message) {
        this.level = level;
        this.message = message;
    }
    
    public LogLevel getLevel() {
        return level;
    }
    
    public String getMessage() {
        return message;
    }
}

// Log levels
enum LogLevel {
    INFO, WARNING, ERROR
}

// Handler interface
public interface Handler {
    void setNext(Handler handler);
    void handle(LogRequest request);
}

// Abstract handler
abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;
    
    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
    
    protected void passToNext(LogRequest request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

// Concrete handlers
public class ErrorHandler extends AbstractHandler {
    @Override
    public void handle(LogRequest request) {
        if (request.getLevel() == LogLevel.ERROR) {
            System.out.println("ERROR: " + request.getMessage());
        } else {
            passToNext(request);
        }
    }
}

public class WarningHandler extends AbstractHandler {
    @Override
    public void handle(LogRequest request) {
        if (request.getLevel() == LogLevel.WARNING) {
            System.out.println("WARNING: " + request.getMessage());
        } else {
            passToNext(request);
        }
    }
}

public class InfoHandler extends AbstractHandler {
    @Override
    public void handle(LogRequest request) {
        if (request.getLevel() == LogLevel.INFO) {
            System.out.println("INFO: " + request.getMessage());
        } else {
            passToNext(request);
        }
    }
} 