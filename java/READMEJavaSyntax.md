# Java Basic Syntax Package

A comprehensive collection of Java basic syntax examples designed for senior software engineers. This package covers all essential Java syntax concepts from fundamentals to modern Java features.

## 🎯 Target Audience

This package is specifically designed for **senior software engineers** who need a comprehensive reference for Java syntax, including:
- Core Java concepts
- Modern Java features (Java 8+)
- Best practices and patterns
- Advanced language constructs

## 📁 Package Structure

```
java/
├── src/main/java/com/languagesreview/basicsyntax/
│   ├── BasicSyntaxDemo.java          # Main demonstration class
│   ├── Box.java                      # Generic class example
│   ├── NumberBox.java                # Bounded generic class
│   ├── MathOperation.java            # Functional interface
│   ├── InvalidAgeException.java      # Custom exception
│   ├── AutoCloseableResource.java    # Resource management
│   ├── records/                      # Record examples (Java 14+)
│   │   ├── Person.java
│   │   ├── Point.java
│   │   └── Circle.java
│   └── sealed/                       # Sealed classes (Java 17+)
│       ├── Shape.java
│       ├── Circle.java
│       ├── Rectangle.java
│       └── Triangle.java
├── pom.xml                           # Maven configuration
└── README.md                         # This file
```

## 🚀 Features Covered

### 1. **Variables and Data Types**
- Primitive types (byte, short, int, long, float, double, char, boolean)
- Reference types and wrapper classes
- Type inference with `var` keyword
- Final variables and constants

### 2. **Control Structures**
- If-else statements
- Traditional switch statements
- Modern switch expressions (Java 14+)
- For loops (traditional and enhanced)
- While and do-while loops

### 3. **Arrays**
- Single and multi-dimensional arrays
- Array initialization and manipulation
- Array iteration techniques

### 4. **Collections Framework**
- List implementations (ArrayList, LinkedList, Vector)
- Set implementations (HashSet, LinkedHashSet, TreeSet)
- Map implementations (HashMap, LinkedHashMap, TreeMap)
- Queue and Deque implementations
- Collection iteration patterns

### 5. **Generics**
- Generic classes and methods
- Bounded type parameters
- Wildcards (extends, super)
- Type erasure concepts

### 6. **Streams API (Java 8+)**
- Stream creation and operations
- Filter, map, reduce operations
- Collectors and grouping
- Parallel streams
- Optional integration

### 7. **Exception Handling**
- Try-catch blocks
- Try-with-resources (Java 7+)
- Custom exceptions
- Exception hierarchy

### 8. **Annotations**
- Built-in annotations (@Override, @Deprecated, @SuppressWarnings)
- Custom annotation usage
- Annotation processing

### 9. **Lambda Expressions (Java 8+)**
- Lambda syntax and usage
- Functional interfaces
- Method references
- Built-in functional interfaces

### 10. **Optional (Java 8+)**
- Optional creation and usage
- Optional chaining
- Default value handling
- Stream integration

### 11. **Records (Java 14+)**
- Record declaration and usage
- Immutable data classes
- Custom methods in records
- Record patterns

### 12. **Sealed Classes (Java 17+)**
- Sealed class hierarchy
- Pattern matching with sealed classes
- Exhaustive switch expressions

### 13. **Pattern Matching (Java 16+)**
- Pattern matching instanceof
- Pattern matching in switch
- Type patterns and binding

### 14. **Text Blocks (Java 15+)**
- Multi-line string literals
- JSON and SQL examples
- String formatting

### 15. **Switch Expressions (Java 14+)**
- Arrow syntax
- Yield statements
- Exhaustive matching

## 🛠️ Prerequisites

- **Java 21 or higher** (for all features including pattern matching in switch)
- **Maven 3.6+** (for building)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code recommended)

## 📦 Building and Running

### Using Maven

```bash
# Navigate to the java directory
cd java

# Compile the project
mvn compile

# Run the main class (if exec plugin is available)
mvn exec:java -Dexec.mainClass="com.languagesreview.basicsyntax.BasicSyntaxDemo"

# Or run directly with Java
java -cp target/classes com.languagesreview.basicsyntax.BasicSyntaxDemo

# Create executable JAR
mvn package

# Run the JAR file
java -jar target/java-basic-syntax-1.0.0.jar
```

### Using IDE

1. Import the project as a Maven project
2. Run `BasicSyntaxDemo.main()` method
3. View the comprehensive output in the console

## 📋 Expected Output

The program will demonstrate all syntax concepts with detailed output including:

```
=== Java Basic Syntax Examples ===

1. VARIABLES AND DATA TYPES:
Primitives: 127, 32767, 2147483647
Wrappers: 42, 3.14
Var inference: Type inferred as String
Final variables: 100, [Can modify content]

2. CONTROL STRUCTURES:
Grade: B
Wednesday
Day name: Wednesday
For loop: 0 1 2
Enhanced for loop: Apple Banana Cherry
While loop: 0 1 2
Do-while loop: 0 1 2

[... continues with all 16 sections ...]
```

## 🎓 Learning Path

For senior engineers, we recommend this learning sequence:

1. **Start with**: Variables, Control Structures, Arrays
2. **Core concepts**: Collections, Generics, Exception Handling
3. **Modern Java**: Streams, Lambda Expressions, Optional
4. **Advanced features**: Records, Sealed Classes, Pattern Matching
5. **Latest features**: Text Blocks, Switch Expressions

## 🔧 Customization

You can extend this package by:

1. **Adding new examples** to `BasicSyntaxDemo.java`
2. **Creating new classes** for specific concepts
3. **Adding unit tests** for validation
4. **Including performance benchmarks**
5. **Adding real-world use cases**

## 📚 Additional Resources

- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- [Effective Java by Joshua Bloch](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997)
- [Modern Java in Action](https://www.manning.com/books/modern-java-in-action)

## 🤝 Contributing

Feel free to:
- Add more examples
- Improve existing code
- Add unit tests
- Enhance documentation
- Suggest new features

## 📄 License

This project is open source and available under the MIT License.

---

**Happy Coding! 🚀** 