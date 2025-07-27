package com.languagesreview.designpatterns.behavioral;

import java.util.HashMap;
import java.util.Map;

/**
 * Interpreter Pattern - Defines a representation for grammar and interpretation mechanism
 */

// Context
public class Context {
    private Map<String, Integer> variables;
    
    public Context() {
        this.variables = new HashMap<>();
    }
    
    public void setVariable(String name, int value) {
        variables.put(name, value);
    }
    
    public int getVariable(String name) {
        return variables.getOrDefault(name, 0);
    }
}

// Abstract expression
public interface Expression {
    int interpret(Context context);
}

// Terminal expressions
public class NumberExpression implements Expression {
    private int number;
    
    public NumberExpression(int number) {
        this.number = number;
    }
    
    @Override
    public int interpret(Context context) {
        return number;
    }
}

public class VariableExpression implements Expression {
    private String variable;
    
    public VariableExpression(String variable) {
        this.variable = variable;
    }
    
    @Override
    public int interpret(Context context) {
        return context.getVariable(variable);
    }
}

// Non-terminal expressions
public class AddExpression implements Expression {
    private Expression left;
    private Expression right;
    
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

public class SubtractExpression implements Expression {
    private Expression left;
    private Expression right;
    
    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}

public class MultiplyExpression implements Expression {
    private Expression left;
    private Expression right;
    
    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
} 