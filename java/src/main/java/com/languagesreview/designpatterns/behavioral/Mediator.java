package com.languagesreview.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator Pattern - Defines an object that encapsulates how a set of objects interact
 */

// Mediator interface
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// User interface
public interface User {
    void sendMessage(String message);
    void receiveMessage(String message);
}

// Concrete mediator
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;
    
    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }
    
    @Override
    public void addUser(User user) {
        users.add(user);
    }
    
    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}

// Concrete user
public class ChatUser implements User {
    private String name;
    private ChatMediator mediator;
    
    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }
    
    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
} 