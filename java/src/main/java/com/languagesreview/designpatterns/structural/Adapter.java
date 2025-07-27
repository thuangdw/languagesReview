package com.languagesreview.designpatterns.structural;

/**
 * Adapter Pattern - Allows incompatible interfaces to work together
 */

// Target interface (new system)
public interface NewSystem {
    String newMethod();
}

// Adaptee (old system)
public class OldSystem {
    public String legacyMethod() {
        return "Legacy system method";
    }
}

// Adapter
public class SystemAdapter implements NewSystem {
    private OldSystem oldSystem;
    
    public SystemAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }
    
    @Override
    public String newMethod() {
        return "Adapted: " + oldSystem.legacyMethod();
    }
}

// Concrete implementation of new system
public class NewSystemImpl implements NewSystem {
    @Override
    public String newMethod() {
        return "New system method";
    }
} 