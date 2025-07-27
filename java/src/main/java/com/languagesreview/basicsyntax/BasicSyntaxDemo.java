package com.languagesreview.basicsyntax;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import com.languagesreview.basicsyntax.records.*;
import com.languagesreview.basicsyntax.sealed.*;

/**
 * Comprehensive demonstration of Java basic syntax for senior software engineers
 * Covers: variables, control structures, OOP, generics, collections, streams, 
 * exceptions, annotations, and modern Java features
 */
public class BasicSyntaxDemo {
    
    // Static variables
    private static final String CONSTANT_VALUE = "IMMUTABLE";
    private static int staticCounter = 0;
    
    // Instance variables
    private String instanceVariable;
    private final List<String> finalList = new ArrayList<>();
    
    // Constructor
    public BasicSyntaxDemo() {
        this.instanceVariable = "default";
        staticCounter++;
    }
    
    public BasicSyntaxDemo(String value) {
        this.instanceVariable = value;
        staticCounter++;
    }
    
    public static void main(String[] args) {
        BasicSyntaxDemo demo = new BasicSyntaxDemo();
        demo.runAllExamples();
    }
    
    public void runAllExamples() {
        System.out.println("=== Java Basic Syntax Examples ===\n");
        
        demonstrateVariables();
        demonstrateControlStructures();
        demonstrateArrays();
        demonstrateCollections();
        demonstrateGenerics();
        demonstrateStreams();
        demonstrateExceptionHandling();
        demonstrateAnnotations();
        demonstrateLambdaExpressions();
        demonstrateMethodReferences();
        demonstrateOptional();
        demonstrateRecords();
        demonstrateSealedClasses();
        demonstratePatternMatching();
        demonstrateTextBlocks();
        demonstrateSwitchExpressions();
    }
    
    // 1. Variables and Data Types
    private void demonstrateVariables() {
        System.out.println("1. VARIABLES AND DATA TYPES:");
        
        // Primitive types
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159265359;
        char charValue = 'A';
        boolean booleanValue = true;
        
        // Reference types
        String stringValue = "Hello, Java!";
        Integer wrapperInt = Integer.valueOf(42);
        Double wrapperDouble = Double.valueOf(3.14);
        
        // Var keyword (type inference)
        var inferredString = "Type inferred as String";
        var inferredList = new ArrayList<String>();
        
        // Final variables
        final int finalInt = 100;
        final List<String> finalMutableList = new ArrayList<>();
        finalMutableList.add("Can modify content");
        
        System.out.println("Primitives: " + byteValue + ", " + shortValue + ", " + intValue);
        System.out.println("Wrappers: " + wrapperInt + ", " + wrapperDouble);
        System.out.println("Var inference: " + inferredString);
        System.out.println("Final variables: " + finalInt + ", " + finalMutableList);
        System.out.println();
    }
    
    // 2. Control Structures
    private void demonstrateControlStructures() {
        System.out.println("2. CONTROL STRUCTURES:");
        
        // If-else
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Switch statement (traditional)
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
        
        // Switch expression (modern)
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };
        System.out.println("Day name: " + dayName);
        
        // Loops
        System.out.println("For loop:");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Enhanced for loop:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        System.out.println("While loop:");
        int count = 0;
        while (count < 3) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        System.out.println("Do-while loop:");
        int doCount = 0;
        do {
            System.out.print(doCount + " ");
            doCount++;
        } while (doCount < 3);
        System.out.println("\n");
    }
    
    // 3. Arrays
    private void demonstrateArrays() {
        System.out.println("3. ARRAYS:");
        
        // Array declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        
        // Multi-dimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Array operations
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
        // Array iteration
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // Matrix iteration
        System.out.println("Matrix elements:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // 4. Collections Framework
    private void demonstrateCollections() {
        System.out.println("4. COLLECTIONS FRAMEWORK:");
        
        // List implementations
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        
        // Adding elements
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        
        // Set implementations
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate ignored
        
        // Map implementations
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        
        // Queue implementations
        Queue<String> priorityQueue = new PriorityQueue<>();
        Deque<String> arrayDeque = new ArrayDeque<>();
        
        priorityQueue.offer("High");
        priorityQueue.offer("Medium");
        priorityQueue.offer("Low");
        
        // Collection operations
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashMap: " + hashMap);
        System.out.println("PriorityQueue: " + priorityQueue);
        
        // Collection iteration
        System.out.println("HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
    
    // 5. Generics
    private void demonstrateGenerics() {
        System.out.println("5. GENERICS:");
        
        // Generic class usage
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(42);
        
        System.out.println("String box: " + stringBox.getContent());
        System.out.println("Integer box: " + intBox.getContent());
        
        // Generic methods
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        
        System.out.println("First string: " + getFirstElement(stringArray));
        System.out.println("First integer: " + getFirstElement(intArray));
        
        // Bounded generics
        NumberBox<Integer> numberBox = new NumberBox<>(100);
        System.out.println("Number box: " + numberBox.getContent());
        
        // Wildcards
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        
        printNumbers(integers);
        printNumbers(doubles);
        System.out.println();
    }
    
    // Generic method
    public static <T> T getFirstElement(T[] array) {
        return array[0];
    }
    
    // Wildcard method
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
    // 6. Streams API
    private void demonstrateStreams() {
        System.out.println("6. STREAMS API:");
        
        List<String> words = Arrays.asList("Java", "Streams", "API", "Programming", "Language");
        
        // Basic stream operations
        System.out.println("Original list: " + words);
        
        // Filter
        List<String> filtered = words.stream()
            .filter(word -> word.length() > 4)
            .collect(Collectors.toList());
        System.out.println("Filtered (length > 4): " + filtered);
        
        // Map
        List<Integer> lengths = words.stream()
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println("Word lengths: " + lengths);
        
        // Reduce
        int totalLength = words.stream()
            .mapToInt(String::length)
            .sum();
        System.out.println("Total length: " + totalLength);
        
        // Collectors
        Map<Integer, List<String>> groupedByLength = words.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);
        
        // Parallel streams
        List<String> parallelProcessed = words.parallelStream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Parallel processed: " + parallelProcessed);
        
        // Optional with streams
        Optional<String> longest = words.stream()
            .max(Comparator.comparing(String::length));
        longest.ifPresent(word -> System.out.println("Longest word: " + word));
        System.out.println();
    }
    
    // 7. Exception Handling
    private void demonstrateExceptionHandling() {
        System.out.println("7. EXCEPTION HANDLING:");
        
        // Try-catch
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general exception: " + e.getMessage());
        }
        
        // Try-with-resources
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Resource exception: " + e.getMessage());
        }
        
        // Custom exception
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
        
        // Finally block
        try {
            System.out.println("In try block");
        } catch (Exception e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block");
        }
        System.out.println();
    }
    
    private int divide(int a, int b) {
        return a / b;
    }
    
    private void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
    }
    
    // 8. Annotations
    private void demonstrateAnnotations() {
        System.out.println("8. ANNOTATIONS:");
        
        // Using custom annotation
        @SuppressWarnings("unused")
        String unusedVariable = "This variable is unused";
        
        // Method with annotations
        System.out.println("Demonstrating @Deprecated annotation");
        
        // Override annotation
        System.out.println("Demonstrating @Override annotation");
        
        System.out.println("Annotations demonstrated");
        System.out.println();
    }
    
    // Method with annotations
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
    
    // Override annotation
    @Override
    public String toString() {
        return "BasicSyntaxDemo{instanceVariable='" + instanceVariable + "'}";
    }
    
    // 9. Lambda Expressions
    private void demonstrateLambdaExpressions() {
        System.out.println("9. LAMBDA EXPRESSIONS:");
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Lambda with forEach
        System.out.println("Names with lambda:");
        names.forEach(name -> System.out.print(name + " "));
        System.out.println();
        
        // Lambda with filter and map
        List<String> filteredNames = names.stream()
            .filter(name -> name.length() > 4)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Filtered and mapped: " + filteredNames);
        
        // Functional interfaces
        Predicate<String> isLong = name -> name.length() > 4;
        Function<String, String> toUpper = String::toUpperCase;
        Consumer<String> printer = System.out::println;
        
        System.out.println("Using functional interfaces:");
        names.stream()
            .filter(isLong)
            .map(toUpper)
            .forEach(printer);
        
        // Custom functional interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;
        
        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
        System.out.println();
    }
    
    // 10. Method References
    private void demonstrateMethodReferences() {
        System.out.println("10. METHOD REFERENCES:");
        
        List<String> words = Arrays.asList("hello", "world", "java");
        
        // Static method reference
        words.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
        
        // Instance method reference
        words.stream()
            .map(String::length)
            .forEach(System.out::println);
        
        // Constructor reference
        List<String> stringList = Arrays.asList("1", "2", "3");
        List<Integer> intList = stringList.stream()
            .map(Integer::valueOf)
            .collect(Collectors.toList());
        System.out.println("Converted to integers: " + intList);
        System.out.println();
    }
    
    // 11. Optional
    private void demonstrateOptional() {
        System.out.println("11. OPTIONAL:");
        
        // Creating Optionals
        Optional<String> present = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);
        
        // Checking if present
        System.out.println("Present optional: " + present.isPresent());
        System.out.println("Empty optional: " + empty.isPresent());
        
        // Getting values
        present.ifPresent(value -> System.out.println("Value: " + value));
        empty.ifPresent(value -> System.out.println("This won't print"));
        
        // Default values
        String result1 = present.orElse("Default");
        String result2 = empty.orElse("Default");
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        
        // Chaining
        Optional<String> chained = present
            .map(String::toUpperCase)
            .filter(s -> s.length() > 3);
        System.out.println("Chained: " + chained.orElse("Not found"));
        
        // FlatMap
        Optional<String> flatMapped = present
            .flatMap(s -> Optional.of(s + " World"));
        System.out.println("FlatMapped: " + flatMapped.orElse("Empty"));
        System.out.println();
    }
    
    // 12. Records (Java 14+)
    private void demonstrateRecords() {
        System.out.println("12. RECORDS:");
        
        // Creating records
        Person person = new Person("John", 30);
        Point point = new Point(10, 20);
        
        // Accessing record components
        System.out.println("Person: " + person.name() + ", " + person.age());
        System.out.println("Point: " + point.x() + ", " + point.y());
        
        // Records are immutable
        System.out.println("Person toString: " + person);
        System.out.println("Point toString: " + point);
        
        // Record with custom methods
        com.languagesreview.basicsyntax.records.Circle circle = new com.languagesreview.basicsyntax.records.Circle(5.0);
        System.out.println("Circle area: " + circle.area());
        System.out.println();
    }
    
    // 13. Sealed Classes (Java 17+)
    private void demonstrateSealedClasses() {
        System.out.println("13. SEALED CLASSES:");
        
        Shape circle = new com.languagesreview.basicsyntax.sealed.Circle(3.0);
        Shape rectangle = new Rectangle(4.0, 5.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        
        // Pattern matching with sealed classes
        System.out.println("Circle area: " + getArea(circle));
        System.out.println("Rectangle area: " + getArea(rectangle));
        System.out.println("Triangle area: " + getArea(triangle));
        System.out.println();
    }
    
    private double getArea(Shape shape) {
        return switch (shape) {
            case com.languagesreview.basicsyntax.sealed.Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
            case Triangle t -> {
                double s = (t.a() + t.b() + t.c()) / 2.0;
                yield Math.sqrt(s * (s - t.a()) * (s - t.b()) * (s - t.c()));
            }
        };
    }
    
    // 14. Pattern Matching
    private void demonstratePatternMatching() {
        System.out.println("14. PATTERN MATCHING:");
        
        Object obj1 = "Hello";
        Object obj2 = 42;
        Object obj3 = Arrays.asList(1, 2, 3);
        
        // Pattern matching instanceof
        if (obj1 instanceof String s) {
            System.out.println("String length: " + s.length());
        }
        
        if (obj2 instanceof Integer i) {
            System.out.println("Integer value: " + i);
        }
        
        if (obj3 instanceof List<?> list) {
            System.out.println("List size: " + list.size());
        }
        
        // Pattern matching in switch
        String result = switch (obj1) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            case List<?> list -> "List with " + list.size() + " elements";
            default -> "Unknown type";
        };
        System.out.println("Switch result: " + result);
        System.out.println();
    }
    
    // 15. Text Blocks (Java 15+)
    private void demonstrateTextBlocks() {
        System.out.println("15. TEXT BLOCKS:");
        
        // Traditional string concatenation
        String traditional = "SELECT id, name, email\n" +
                           "FROM users\n" +
                           "WHERE active = true\n" +
                           "ORDER BY name";
        
        // Text block
        String textBlock = """
            SELECT id, name, email
            FROM users
            WHERE active = true
            ORDER BY name
            """;
        
        // JSON example
        String json = """
            {
                "name": "John Doe",
                "age": 30,
                "email": "john@example.com"
            }
            """;
        
        System.out.println("Traditional:\n" + traditional);
        System.out.println("Text block:\n" + textBlock);
        System.out.println("JSON:\n" + json);
        System.out.println();
    }
    
    // 16. Switch Expressions
    private void demonstrateSwitchExpressions() {
        System.out.println("16. SWITCH EXPRESSIONS:");
        
        String day = "MONDAY";
        
        // Switch expression with arrow syntax
        int dayNumber = switch (day) {
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY", "SUNDAY" -> 6;
            default -> 0;
        };
        
        // Switch expression with yield
        String dayType = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                yield "Weekday";
            }
            case "SATURDAY", "SUNDAY" -> {
                yield "Weekend";
            }
            default -> {
                yield "Unknown";
            }
        };
        
        System.out.println("Day: " + day + ", Number: " + dayNumber + ", Type: " + dayType);
        System.out.println();
    }
} 