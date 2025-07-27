package com.languagesreview.designpatterns.structural;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Pattern - Reduces memory usage by sharing common parts of state
 */

// Flyweight interface
public interface Character {
    void display(int x, int y);
}

// Concrete flyweight
public class CharacterImpl implements Character {
    private char symbol;
    
    public CharacterImpl(char symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public void display(int x, int y) {
        System.out.println("Character '" + symbol + "' displayed at position (" + x + ", " + y + ")");
    }
    
    @Override
    public String toString() {
        return "Character{symbol='" + symbol + "'}";
    }
}

// Flyweight factory
public class CharacterFactory {
    private Map<Character, Character> characters;
    
    public CharacterFactory() {
        this.characters = new HashMap<>();
    }
    
    public Character getCharacter(char key) {
        Character character = characters.get(key);
        
        if (character == null) {
            character = new CharacterImpl(key);
            characters.put(key, character);
            System.out.println("Creating new character: " + key);
        } else {
            System.out.println("Reusing existing character: " + key);
        }
        
        return character;
    }
    
    public int getCharacterCount() {
        return characters.size();
    }
} 