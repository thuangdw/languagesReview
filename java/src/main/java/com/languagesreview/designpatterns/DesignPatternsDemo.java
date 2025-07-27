package com.languagesreview.designpatterns;

import com.languagesreview.designpatterns.creational.*;
import com.languagesreview.designpatterns.structural.*;
import com.languagesreview.designpatterns.behavioral.*;

/**
 * Comprehensive demonstration of all 23 Gang of Four Design Patterns
 * Organized into three categories: Creational, Structural, and Behavioral
 */
public class DesignPatternsDemo {
    
    public static void main(String[] args) {
        DesignPatternsDemo demo = new DesignPatternsDemo();
        demo.runAllPatterns();
    }
    
    public void runAllPatterns() {
        System.out.println("=== Gang of Four Design Patterns Demo ===\n");
        
        demonstrateCreationalPatterns();
        demonstrateStructuralPatterns();
        demonstrateBehavioralPatterns();
    }
    
    // ==================== CREATIONAL PATTERNS ====================
    private void demonstrateCreationalPatterns() {
        System.out.println("🎯 CREATIONAL PATTERNS (5 patterns):\n");
        
        demonstrateSingleton();
        demonstrateFactoryMethod();
        demonstrateAbstractFactory();
        demonstrateBuilder();
        demonstratePrototype();
    }
    
    // 1. Singleton Pattern
    private void demonstrateSingleton() {
        System.out.println("1. SINGLETON PATTERN:");
        
        // Get singleton instances
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println("Singleton 1: " + singleton1);
        System.out.println("Singleton 2: " + singleton2);
        System.out.println("Are they the same instance? " + (singleton1 == singleton2));
        
        // Thread-safe singleton
        ThreadSafeSingleton tsSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton tsSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Thread-safe singletons are same: " + (tsSingleton1 == tsSingleton2));
        System.out.println();
    }
    
    // 2. Factory Method Pattern
    private void demonstrateFactoryMethod() {
        System.out.println("2. FACTORY METHOD PATTERN:");
        
        // Create different types of vehicles using factory
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        
        Vehicle car = carFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        
        System.out.println("Car: " + car.getType());
        System.out.println("Motorcycle: " + motorcycle.getType());
        car.start();
        motorcycle.start();
        System.out.println();
    }
    
    // 3. Abstract Factory Pattern
    private void demonstrateAbstractFactory() {
        System.out.println("3. ABSTRACT FACTORY PATTERN:");
        
        // Create modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        
        System.out.println("Modern Chair: " + modernChair.getStyle());
        System.out.println("Modern Table: " + modernTable.getStyle());
        modernChair.sit();
        modernTable.eat();
        
        // Create vintage furniture
        FurnitureFactory vintageFactory = new VintageFurnitureFactory();
        Chair vintageChair = vintageFactory.createChair();
        Table vintageTable = vintageFactory.createTable();
        
        System.out.println("Vintage Chair: " + vintageChair.getStyle());
        System.out.println("Vintage Table: " + vintageTable.getStyle());
        vintageChair.sit();
        vintageTable.eat();
        System.out.println();
    }
    
    // 4. Builder Pattern
    private void demonstrateBuilder() {
        System.out.println("4. BUILDER PATTERN:");
        
        // Build a computer step by step
        ComputerBuilder builder = new ComputerBuilder();
        Computer computer = builder
            .setCpu("Intel i7")
            .setRam("16GB")
            .setStorage("512GB SSD")
            .setGpu("NVIDIA RTX 3080")
            .build();
        
        System.out.println("Built Computer: " + computer);
        
        // Build another computer with different specs
        Computer gamingComputer = new ComputerBuilder()
            .setCpu("AMD Ryzen 9")
            .setRam("32GB")
            .setStorage("1TB NVMe")
            .setGpu("NVIDIA RTX 4090")
            .build();
        
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println();
    }
    
    // 5. Prototype Pattern
    private void demonstratePrototype() {
        System.out.println("5. PROTOTYPE PATTERN:");
        
        // Create prototype shapes
        Shape circle = new Circle(10, "Red");
        Shape rectangle = new Rectangle(20, 30, "Blue");
        
        // Clone shapes
        Shape circleClone = circle.clone();
        Shape rectangleClone = rectangle.clone();
        
        System.out.println("Original Circle: " + circle);
        System.out.println("Cloned Circle: " + circleClone);
        System.out.println("Are they the same object? " + (circle == circleClone));
        System.out.println("Are they equal? " + circle.equals(circleClone));
        
        System.out.println("Original Rectangle: " + rectangle);
        System.out.println("Cloned Rectangle: " + rectangleClone);
        System.out.println();
    }
    
    // ==================== STRUCTURAL PATTERNS ====================
    private void demonstrateStructuralPatterns() {
        System.out.println("🏗️ STRUCTURAL PATTERNS (7 patterns):\n");
        
        demonstrateAdapter();
        demonstrateBridge();
        demonstrateComposite();
        demonstrateDecorator();
        demonstrateFacade();
        demonstrateFlyweight();
        demonstrateProxy();
    }
    
    // 6. Adapter Pattern
    private void demonstrateAdapter() {
        System.out.println("6. ADAPTER PATTERN:");
        
        // Old system interface
        OldSystem oldSystem = new OldSystem();
        
        // New system interface
        NewSystem newSystem = new NewSystem();
        
        // Adapter to make old system work with new interface
        SystemAdapter adapter = new SystemAdapter(oldSystem);
        
        System.out.println("Old System: " + oldSystem.legacyMethod());
        System.out.println("New System: " + newSystem.newMethod());
        System.out.println("Adapted Old System: " + adapter.newMethod());
        System.out.println();
    }
    
    // 7. Bridge Pattern
    private void demonstrateBridge() {
        System.out.println("7. BRIDGE PATTERN:");
        
        // Create different shapes with different drawing APIs
        DrawingAPI rasterAPI = new RasterDrawingAPI();
        DrawingAPI vectorAPI = new VectorDrawingAPI();
        
        Shape circle = new CircleShape(rasterAPI, 10, 10, 5);
        Shape rectangle = new RectangleShape(vectorAPI, 20, 20, 10, 15);
        
        circle.draw();
        rectangle.draw();
        
        // Switch implementation
        circle = new CircleShape(vectorAPI, 10, 10, 5);
        circle.draw();
        System.out.println();
    }
    
    // 8. Composite Pattern
    private void demonstrateComposite() {
        System.out.println("8. COMPOSITE PATTERN:");
        
        // Create file system structure
        FileSystemComponent file1 = new File("document.txt", 1024);
        FileSystemComponent file2 = new File("image.jpg", 2048);
        FileSystemComponent file3 = new File("video.mp4", 10240);
        
        Directory documents = new Directory("Documents");
        documents.add(file1);
        documents.add(file2);
        
        Directory media = new Directory("Media");
        media.add(file3);
        
        Directory root = new Directory("Root");
        root.add(documents);
        root.add(media);
        
        System.out.println("File System Structure:");
        root.display(0);
        System.out.println("Total size: " + root.getSize() + " bytes");
        System.out.println();
    }
    
    // 9. Decorator Pattern
    private void demonstrateDecorator() {
        System.out.println("9. DECORATOR PATTERN:");
        
        // Basic coffee
        Coffee basicCoffee = new BasicCoffee();
        System.out.println("Basic Coffee: " + basicCoffee.getDescription() + " - $" + basicCoffee.cost());
        
        // Add milk
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println("Milk Coffee: " + milkCoffee.getDescription() + " - $" + milkCoffee.cost());
        
        // Add sugar
        Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Sweet Milk Coffee: " + sweetMilkCoffee.getDescription() + " - $" + sweetMilkCoffee.cost());
        
        // Add whipped cream
        Coffee whippedSweetMilkCoffee = new WhippedCreamDecorator(sweetMilkCoffee);
        System.out.println("Whipped Sweet Milk Coffee: " + whippedSweetMilkCoffee.getDescription() + " - $" + whippedSweetMilkCoffee.cost());
        System.out.println();
    }
    
    // 10. Facade Pattern
    private void demonstrateFacade() {
        System.out.println("10. FACADE PATTERN:");
        
        // Complex subsystem
        SubsystemA subsystemA = new SubsystemA();
        SubsystemB subsystemB = new SubsystemB();
        SubsystemC subsystemC = new SubsystemC();
        
        // Facade provides simple interface
        Facade facade = new Facade(subsystemA, subsystemB, subsystemC);
        
        System.out.println("Client using Facade:");
        facade.operation1();
        facade.operation2();
        System.out.println();
    }
    
    // 11. Flyweight Pattern
    private void demonstrateFlyweight() {
        System.out.println("11. FLYWEIGHT PATTERN:");
        
        // Create flyweight factory
        CharacterFactory factory = new CharacterFactory();
        
        // Create characters (shared intrinsic state)
        Character a = factory.getCharacter('A');
        Character b = factory.getCharacter('B');
        Character a2 = factory.getCharacter('A'); // Same instance as 'a'
        
        System.out.println("Character 'A' instance: " + a);
        System.out.println("Character 'B' instance: " + b);
        System.out.println("Character 'A' instance 2: " + a2);
        System.out.println("Are 'A' instances the same? " + (a == a2));
        
        // Display with extrinsic state
        a.display(10, 20);
        b.display(15, 25);
        a2.display(30, 40);
        System.out.println();
    }
    
    // 12. Proxy Pattern
    private void demonstrateProxy() {
        System.out.println("12. PROXY PATTERN:");
        
        // Use proxy instead of real subject
        Image proxyImage = new ProxyImage("large_image.jpg");
        
        System.out.println("First time loading:");
        proxyImage.display(); // Will load from disk
        
        System.out.println("Second time loading:");
        proxyImage.display(); // Will load from cache
        System.out.println();
    }
    
    // ==================== BEHAVIORAL PATTERNS ====================
    private void demonstrateBehavioralPatterns() {
        System.out.println("🧠 BEHAVIORAL PATTERNS (11 patterns):\n");
        
        demonstrateChainOfResponsibility();
        demonstrateCommand();
        demonstrateIterator();
        demonstrateMediator();
        demonstrateMemento();
        demonstrateObserver();
        demonstrateState();
        demonstrateStrategy();
        demonstrateTemplateMethod();
        demonstrateVisitor();
        demonstrateInterpreter();
    }
    
    // 13. Chain of Responsibility Pattern
    private void demonstrateChainOfResponsibility() {
        System.out.println("13. CHAIN OF RESPONSIBILITY PATTERN:");
        
        // Create chain of handlers
        Handler errorHandler = new ErrorHandler();
        Handler warningHandler = new WarningHandler();
        Handler infoHandler = new InfoHandler();
        
        errorHandler.setNext(warningHandler);
        warningHandler.setNext(infoHandler);
        
        // Process different log levels
        LogRequest errorRequest = new LogRequest(LogLevel.ERROR, "System error occurred");
        LogRequest warningRequest = new LogRequest(LogLevel.WARNING, "Warning message");
        LogRequest infoRequest = new LogRequest(LogLevel.INFO, "Info message");
        
        errorHandler.handle(errorRequest);
        errorHandler.handle(warningRequest);
        errorHandler.handle(infoRequest);
        System.out.println();
    }
    
    // 14. Command Pattern
    private void demonstrateCommand() {
        System.out.println("14. COMMAND PATTERN:");
        
        // Create receiver
        Light light = new Light();
        
        // Create commands
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);
        Command dimCommand = new DimCommand(light);
        
        // Create invoker
        RemoteControl remote = new RemoteControl();
        
        // Execute commands
        remote.setCommand(turnOnCommand);
        remote.pressButton();
        
        remote.setCommand(dimCommand);
        remote.pressButton();
        
        remote.setCommand(turnOffCommand);
        remote.pressButton();
        System.out.println();
    }
    
    // 15. Iterator Pattern
    private void demonstrateIterator() {
        System.out.println("15. ITERATOR PATTERN:");
        
        // Create collection
        BookCollection books = new BookCollection();
        books.addBook(new IteratorBook("Design Patterns", "Gang of Four"));
        books.addBook(new IteratorBook("Clean Code", "Robert Martin"));
        books.addBook(new IteratorBook("Refactoring", "Martin Fowler"));
        
        // Use iterator
        Iterator<IteratorBook> iterator = books.createIterator();
        System.out.println("Books in collection:");
        while (iterator.hasNext()) {
            IteratorBook book = iterator.next();
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
        System.out.println();
    }
    
    // 16. Mediator Pattern
    private void demonstrateMediator() {
        System.out.println("16. MEDIATOR PATTERN:");
        
        // Create mediator
        ChatMediator mediator = new ChatMediator();
        
        // Create users
        User user1 = new ChatUser("Alice", mediator);
        User user2 = new ChatUser("Bob", mediator);
        User user3 = new ChatUser("Charlie", mediator);
        
        // Add users to mediator
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        
        // Send messages
        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hi Alice!");
        user3.sendMessage("Good morning!");
        System.out.println();
    }
    
    // 17. Memento Pattern
    private void demonstrateMemento() {
        System.out.println("17. MEMENTO PATTERN:");
        
        // Create originator
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();
        
        // Make changes and save states
        editor.setContent("First version");
        caretaker.save(editor.save());
        
        editor.setContent("Second version");
        caretaker.save(editor.save());
        
        editor.setContent("Third version");
        System.out.println("Current content: " + editor.getContent());
        
        // Undo to previous state
        editor.restore(caretaker.undo());
        System.out.println("After undo: " + editor.getContent());
        
        editor.restore(caretaker.undo());
        System.out.println("After second undo: " + editor.getContent());
        System.out.println();
    }
    
    // 18. Observer Pattern
    private void demonstrateObserver() {
        System.out.println("18. OBSERVER PATTERN:");
        
        // Create subject
        NewsAgency newsAgency = new NewsAgency();
        
        // Create observers
        NewsChannel channel1 = new NewsChannel("CNN");
        NewsChannel channel2 = new NewsChannel("BBC");
        NewsChannel channel3 = new NewsChannel("Fox News");
        
        // Register observers
        newsAgency.register(channel1);
        newsAgency.register(channel2);
        newsAgency.register(channel3);
        
        // Publish news
        newsAgency.publishNews("Breaking: New design patterns discovered!");
        
        // Unregister one observer
        newsAgency.unregister(channel2);
        
        // Publish more news
        newsAgency.publishNews("Update: Patterns are now implemented!");
        System.out.println();
    }
    
    // 19. State Pattern
    private void demonstrateState() {
        System.out.println("19. STATE PATTERN:");
        
        // Create context
        VendingMachine machine = new VendingMachine();
        
        // Simulate vending machine operations
        System.out.println("Initial state: " + machine.getState());
        
        machine.insertCoin();
        System.out.println("After inserting coin: " + machine.getState());
        
        machine.selectProduct();
        System.out.println("After selecting product: " + machine.getState());
        
        machine.dispense();
        System.out.println("After dispensing: " + machine.getState());
        
        machine.insertCoin();
        machine.selectProduct();
        machine.dispense();
        System.out.println();
    }
    
    // 20. Strategy Pattern
    private void demonstrateStrategy() {
        System.out.println("20. STRATEGY PATTERN:");
        
        // Create context
        ShoppingCart cart = new ShoppingCart();
        
        // Add items
        cart.addItem(new Item("Book", 20.0));
        cart.addItem(new Item("CD", 15.0));
        
        // Use different payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        
        cart.pay(creditCard);
        cart.pay(paypal);
        cart.pay(bitcoin);
        System.out.println();
    }
    
    // 21. Template Method Pattern
    private void demonstrateTemplateMethod() {
        System.out.println("21. TEMPLATE METHOD PATTERN:");
        
        // Create different game implementations
        Game cricket = new Cricket();
        Game football = new Football();
        
        // Play games (template method)
        System.out.println("Playing Cricket:");
        cricket.play();
        
        System.out.println("\nPlaying Football:");
        football.play();
        System.out.println();
    }
    
    // 22. Visitor Pattern
    private void demonstrateVisitor() {
        System.out.println("22. VISITOR PATTERN:");
        
        // Create elements
        Element[] elements = {
            new Book(20.0, 2),
            new Fruit(5.0, 3),
            new Electronics(100.0, 1)
        };
        
        // Create visitors
        ShoppingCartVisitor priceVisitor = new PriceVisitor();
        ShoppingCartVisitor weightVisitor = new WeightVisitor();
        
        // Apply visitors
        System.out.println("Calculating total price:");
        double totalPrice = 0;
        for (Element element : elements) {
            totalPrice += element.accept(priceVisitor);
        }
        System.out.println("Total price: $" + totalPrice);
        
        System.out.println("Calculating total weight:");
        double totalWeight = 0;
        for (Element element : elements) {
            totalWeight += element.accept(weightVisitor);
        }
        System.out.println("Total weight: " + totalWeight + " kg");
        System.out.println();
    }
    
    // 23. Interpreter Pattern
    private void demonstrateInterpreter() {
        System.out.println("23. INTERPRETER PATTERN:");
        
        // Create context
        Context context = new Context();
        context.setVariable("x", 10);
        context.setVariable("y", 5);
        
        // Create expressions
        Expression expression1 = new AddExpression(
            new NumberExpression(5),
            new VariableExpression("x")
        );
        
        Expression expression2 = new SubtractExpression(
            new VariableExpression("x"),
            new VariableExpression("y")
        );
        
        Expression expression3 = new MultiplyExpression(
            expression1,
            expression2
        );
        
        // Interpret expressions
        System.out.println("Expression 1 (5 + x): " + expression1.interpret(context));
        System.out.println("Expression 2 (x - y): " + expression2.interpret(context));
        System.out.println("Expression 3 ((5 + x) * (x - y)): " + expression3.interpret(context));
        System.out.println();
    }
} 