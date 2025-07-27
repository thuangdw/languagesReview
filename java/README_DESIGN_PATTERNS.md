# Java Design Patterns Package

A comprehensive implementation of all 23 Gang of Four (GoF) design patterns in Java, organized into three categories: Creational, Structural, and Behavioral. This package provides complete, working examples of each pattern with practical use cases.

## 🎯 Target Audience

This package is designed for **senior software engineers** who need:
- Complete implementations of all GoF design patterns
- Practical examples and real-world use cases
- Interview preparation materials
- Reference implementations for production code
- Understanding of when and how to apply each pattern

## 📁 Package Structure

```
java/src/main/java/com/languagesreview/designpatterns/
├── DesignPatternsDemo.java                    # Main demonstration class (1000+ lines)
├── creational/                                # Creational Patterns (5 patterns)
│   ├── Singleton.java                         # Singleton pattern
│   ├── FactoryMethod.java                     # Factory Method pattern
│   ├── AbstractFactory.java                   # Abstract Factory pattern
│   ├── Builder.java                           # Builder pattern
│   └── Prototype.java                         # Prototype pattern
├── structural/                                # Structural Patterns (7 patterns)
│   ├── Adapter.java                           # Adapter pattern
│   ├── Bridge.java                            # Bridge pattern
│   ├── Composite.java                         # Composite pattern
│   ├── Decorator.java                         # Decorator pattern
│   ├── Facade.java                            # Facade pattern
│   ├── Flyweight.java                         # Flyweight pattern
│   └── Proxy.java                             # Proxy pattern
└── behavioral/                                # Behavioral Patterns (11 patterns)
    ├── ChainOfResponsibility.java             # Chain of Responsibility pattern
    ├── Command.java                           # Command pattern
    ├── Iterator.java                          # Iterator pattern
    ├── Mediator.java                          # Mediator pattern
    ├── Memento.java                           # Memento pattern
    ├── Observer.java                          # Observer pattern
    ├── State.java                             # State pattern
    ├── Strategy.java                          # Strategy pattern
    ├── TemplateMethod.java                    # Template Method pattern
    ├── Visitor.java                           # Visitor pattern
    └── Interpreter.java                       # Interpreter pattern
```

## 🚀 Patterns Covered

### 🎯 **CREATIONAL PATTERNS (5 patterns)**

#### 1. **Singleton Pattern**
- **Purpose**: Ensures a class has only one instance and provides global access
- **Implementation**: Basic singleton + thread-safe singleton with double-checked locking
- **Use Cases**: Database connections, logging, configuration management
- **Key Features**: Lazy initialization, thread safety, global access point

#### 2. **Factory Method Pattern**
- **Purpose**: Defines an interface for creating objects but lets subclasses decide which class to instantiate
- **Implementation**: Vehicle factory creating cars and motorcycles
- **Use Cases**: Framework development, plugin architectures, object creation delegation
- **Key Features**: Encapsulation, inheritance, polymorphism

#### 3. **Abstract Factory Pattern**
- **Purpose**: Provides an interface for creating families of related objects
- **Implementation**: Furniture factory creating modern and vintage furniture families
- **Use Cases**: UI frameworks, cross-platform development, product families
- **Key Features**: Family creation, consistency, extensibility

#### 4. **Builder Pattern**
- **Purpose**: Constructs complex objects step by step
- **Implementation**: Computer builder with fluent interface
- **Use Cases**: Complex object construction, configuration objects, immutable objects
- **Key Features**: Step-by-step construction, fluent interface, validation

#### 5. **Prototype Pattern**
- **Purpose**: Creates new objects by cloning an existing object
- **Implementation**: Shape cloning (Circle, Rectangle)
- **Use Cases**: Object copying, expensive object creation, default configurations
- **Key Features**: Cloning, performance optimization, default states

### 🏗️ **STRUCTURAL PATTERNS (7 patterns)**

#### 6. **Adapter Pattern**
- **Purpose**: Allows incompatible interfaces to work together
- **Implementation**: System adapter bridging old and new interfaces
- **Use Cases**: Legacy system integration, third-party library integration
- **Key Features**: Interface compatibility, legacy support, minimal changes

#### 7. **Bridge Pattern**
- **Purpose**: Separates abstraction from implementation
- **Implementation**: Drawing shapes with different APIs (Raster/Vector)
- **Use Cases**: Platform independence, multiple implementations, abstraction layers
- **Key Features**: Decoupling, extensibility, platform independence

#### 8. **Composite Pattern**
- **Purpose**: Composes objects into tree structures
- **Implementation**: File system with files and directories
- **Use Cases**: File systems, UI components, organizational structures
- **Key Features**: Tree structures, uniform treatment, recursive composition

#### 9. **Decorator Pattern**
- **Purpose**: Adds behavior to objects dynamically
- **Implementation**: Coffee with various add-ons (milk, sugar, whipped cream)
- **Use Cases**: I/O streams, UI components, middleware
- **Key Features**: Dynamic behavior, composition over inheritance, flexibility

#### 10. **Facade Pattern**
- **Purpose**: Provides a simplified interface to a complex subsystem
- **Implementation**: Facade simplifying complex subsystem operations
- **Use Cases**: API simplification, legacy system wrapping, complex workflows
- **Key Features**: Simplified interface, subsystem encapsulation, ease of use

#### 11. **Flyweight Pattern**
- **Purpose**: Reduces memory usage by sharing common parts of state
- **Implementation**: Character factory sharing character instances
- **Use Cases**: Text editors, game development, memory optimization
- **Key Features**: Memory efficiency, shared state, intrinsic/extrinsic state

#### 12. **Proxy Pattern**
- **Purpose**: Provides a surrogate or placeholder for another object
- **Implementation**: Image proxy with lazy loading
- **Use Cases**: Lazy loading, access control, caching, remote objects
- **Key Features**: Controlled access, lazy initialization, caching

### 🧠 **BEHAVIORAL PATTERNS (11 patterns)**

#### 13. **Chain of Responsibility Pattern**
- **Purpose**: Passes requests along a chain of handlers
- **Implementation**: Log level handlers (Error, Warning, Info)
- **Use Cases**: Exception handling, event processing, middleware chains
- **Key Features**: Request chaining, handler flexibility, loose coupling

#### 14. **Command Pattern**
- **Purpose**: Encapsulates a request as an object
- **Implementation**: Light control commands (turn on, off, dim)
- **Use Cases**: Undo/redo, queuing, logging, remote execution
- **Key Features**: Request encapsulation, undo capability, queuing

#### 15. **Iterator Pattern**
- **Purpose**: Provides a way to access elements of a collection without exposing its underlying representation
- **Implementation**: Book collection iterator
- **Use Cases**: Collection traversal, custom iteration logic, encapsulation
- **Key Features**: Collection abstraction, traversal control, encapsulation

#### 16. **Mediator Pattern**
- **Purpose**: Defines an object that encapsulates how a set of objects interact
- **Implementation**: Chat mediator coordinating user communication
- **Use Cases**: UI components, workflow coordination, object communication
- **Key Features**: Centralized control, reduced coupling, coordination

#### 17. **Memento Pattern**
- **Purpose**: Captures and externalizes an object's internal state
- **Implementation**: Text editor with undo functionality
- **Use Cases**: Undo/redo, state restoration, checkpoints
- **Key Features**: State preservation, undo capability, encapsulation

#### 18. **Observer Pattern**
- **Purpose**: Defines a one-to-many dependency between objects
- **Implementation**: News agency with multiple news channels
- **Use Cases**: Event handling, model-view separation, notifications
- **Key Features**: Loose coupling, event-driven, notification system

#### 19. **State Pattern**
- **Purpose**: Allows an object to alter its behavior when its internal state changes
- **Implementation**: Vending machine with different states
- **Use Cases**: State machines, workflow management, behavior changes
- **Key Features**: State encapsulation, behavior changes, state transitions

#### 20. **Strategy Pattern**
- **Purpose**: Defines a family of algorithms and makes them interchangeable
- **Implementation**: Payment strategies (Credit Card, PayPal, Bitcoin)
- **Use Cases**: Algorithm selection, payment processing, sorting strategies
- **Key Features**: Algorithm encapsulation, runtime selection, extensibility

#### 21. **Template Method Pattern**
- **Purpose**: Defines the skeleton of an algorithm in a method
- **Implementation**: Game template with initialize, play, end methods
- **Use Cases**: Framework development, algorithm skeletons, code reuse
- **Key Features**: Algorithm structure, code reuse, customization points

#### 22. **Visitor Pattern**
- **Purpose**: Separates an algorithm from the object structure on which it operates
- **Implementation**: Shopping cart visitor calculating price and weight
- **Use Cases**: Object structure operations, algorithm separation, extensibility
- **Key Features**: Algorithm separation, structure independence, extensibility

#### 23. **Interpreter Pattern**
- **Purpose**: Defines a representation for grammar and interpretation mechanism
- **Implementation**: Mathematical expression interpreter
- **Use Cases**: Language parsing, expression evaluation, DSLs
- **Key Features**: Grammar representation, interpretation, expression trees

## 🛠️ Prerequisites

- **Java 21 or higher** (for all features)
- **Maven 3.6+** (for building)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code recommended)

## 📦 Building and Running

### Using Maven

```bash
# Navigate to the java directory
cd java

# Compile the project
mvn compile

# Run the main design patterns demo class
mvn exec:java -Dexec.mainClass="com.languagesreview.designpatterns.DesignPatternsDemo"

# Or run directly with Java
java -cp target/classes com.languagesreview.designpatterns.DesignPatternsDemo

# Create executable JAR
mvn package

# Run the JAR file
java -jar target/java-basic-syntax-1.0.0.jar
```

### Using IDE

1. Import the project as a Maven project
2. Run `DesignPatternsDemo.main()` method
3. View the comprehensive output in the console

## 📋 Expected Output

The program will demonstrate all 23 design patterns with detailed output including:

```
=== Gang of Four Design Patterns Demo ===

🎯 CREATIONAL PATTERNS (5 patterns):

1. SINGLETON PATTERN:
Singleton 1: Singleton{data='Singleton data'}
Singleton 2: Singleton{data='Singleton data'}
Are they the same instance? true
Thread-safe singletons are same: true

2. FACTORY METHOD PATTERN:
Car: Car
Motorcycle: Motorcycle
Car engine started
Motorcycle engine started

[... continues with all 23 patterns ...]
```

## 🎓 Learning Path

For senior engineers, we recommend this learning sequence:

### **Phase 1: Foundation (Start Here)**
1. **Singleton** - Basic object creation control
2. **Factory Method** - Object creation delegation
3. **Observer** - Event handling and notifications
4. **Strategy** - Algorithm selection and flexibility

### **Phase 2: Structure and Behavior**
5. **Adapter** - Interface compatibility
6. **Decorator** - Dynamic behavior addition
7. **Command** - Request encapsulation
8. **State** - Behavior state management

### **Phase 3: Advanced Patterns**
9. **Abstract Factory** - Family creation
10. **Composite** - Tree structures
11. **Visitor** - Algorithm separation
12. **Template Method** - Algorithm skeletons

### **Phase 4: Specialized Patterns**
13. **Builder** - Complex object construction
14. **Bridge** - Abstraction separation
15. **Chain of Responsibility** - Request chaining
16. **Mediator** - Object coordination

### **Phase 5: Advanced Concepts**
17. **Prototype** - Object cloning
18. **Facade** - Interface simplification
19. **Flyweight** - Memory optimization
20. **Proxy** - Controlled access
21. **Iterator** - Collection traversal
22. **Memento** - State preservation
23. **Interpreter** - Language interpretation

## 📊 Pattern Categories Summary

### **Creational Patterns (5)**
- **Focus**: Object creation mechanisms
- **Problem**: How to create objects flexibly
- **Solution**: Delegate object creation to specialized classes

### **Structural Patterns (7)**
- **Focus**: Object composition and relationships
- **Problem**: How to compose objects into larger structures
- **Solution**: Define ways to compose objects to obtain new functionality

### **Behavioral Patterns (11)**
- **Focus**: Communication between objects
- **Problem**: How to handle communication between objects
- **Solution**: Define communication patterns between objects

## 🔧 When to Use Each Pattern

### **Creational Patterns**
- **Singleton**: When you need exactly one instance of a class
- **Factory Method**: When you want to delegate object creation to subclasses
- **Abstract Factory**: When you need to create families of related objects
- **Builder**: When you need to construct complex objects step by step
- **Prototype**: When object creation is expensive or complex

### **Structural Patterns**
- **Adapter**: When you need to make incompatible interfaces work together
- **Bridge**: When you want to separate abstraction from implementation
- **Composite**: When you need to treat individual objects and compositions uniformly
- **Decorator**: When you need to add behavior to objects dynamically
- **Facade**: When you want to provide a simple interface to a complex subsystem
- **Flyweight**: When you need to reduce memory usage by sharing common state
- **Proxy**: When you need to control access to an object

### **Behavioral Patterns**
- **Chain of Responsibility**: When you want to pass requests along a chain of handlers
- **Command**: When you want to encapsulate a request as an object
- **Iterator**: When you want to access collection elements without exposing structure
- **Mediator**: When you want to reduce coupling between communicating objects
- **Memento**: When you want to capture and restore object state
- **Observer**: When you want to notify objects about state changes
- **State**: When an object's behavior depends on its state
- **Strategy**: When you want to define a family of algorithms
- **Template Method**: When you want to define an algorithm skeleton
- **Visitor**: When you want to separate algorithms from object structure
- **Interpreter**: When you want to interpret a language or grammar

## 📚 Additional Resources

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) - The original Gang of Four book
- [Head First Design Patterns](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124) - Beginner-friendly introduction
- [Refactoring Guru](https://refactoring.guru/design-patterns) - Online design patterns reference
- [Java Design Patterns](https://java-design-patterns.com/) - Java-specific examples

## 🎯 Interview Preparation

This package is excellent for:
- **Technical interviews** at top tech companies
- **System design discussions**
- **Code review scenarios**
- **Architecture discussions**
- **Design pattern recognition**

## 🤝 Contributing

Feel free to:
- Add more examples for each pattern
- Implement additional design patterns
- Add unit tests for validation
- Enhance documentation
- Suggest new use cases

## 📄 License

This project is open source and available under the MIT License.

---

**Happy Pattern Learning! 🚀** 