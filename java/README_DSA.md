# Java Data Structures & Algorithms Package

A comprehensive collection of data structures and algorithms implemented in Java, designed for senior software engineers. This package covers all essential DSA concepts with complete implementations and practical examples.

## 🎯 Target Audience

This package is specifically designed for **senior software engineers** who need:
- Complete implementations of data structures
- Algorithm implementations with time/space complexity analysis
- Practical examples and use cases
- Interview preparation materials
- Reference implementations for production code

## 📁 Package Structure

```
java/src/main/java/com/languagesreview/datastructurealgorithm/
├── DataStructureAlgorithmDemo.java    # Main demonstration class (1000+ lines)
├── BinaryTree.java                    # Binary Tree implementation
├── BinarySearchTree.java              # BST with search operations
├── Graph.java                         # Graph with DFS/BFS
├── HashTable.java                     # Hash Table with chaining
├── MinHeap.java                       # Min Heap implementation
└── README_DSA.md                      # This documentation
```

## 🚀 Features Covered

### 1. **Arrays and Array Manipulation**
- Array reversal and manipulation
- Two-pointer technique
- Sliding window algorithm
- Maximum/minimum finding
- Subarray operations

### 2. **Linked Lists**
- Basic linked list operations
- Reversal algorithms
- Cycle detection
- Middle element finding
- Merge operations

### 3. **Stacks and Queues**
- Stack implementation and operations
- Queue implementations (FIFO, Priority Queue)
- Valid parentheses checking
- Stack-based algorithms

### 4. **Trees**
- **Binary Tree**: Complete implementation with all traversal methods
- **Binary Search Tree**: Search, insert, delete operations
- Tree traversal (Inorder, Preorder, Postorder, Level-order)
- Tree height calculation
- BST validation

### 5. **Graphs**
- **Adjacency List representation**
- **Depth-First Search (DFS)**
- **Breadth-First Search (BFS)**
- **Cycle detection**
- **Topological sorting**
- **Shortest path algorithms**

### 6. **Hash Tables**
- **Chaining for collision resolution**
- **Dynamic resizing**
- **Load factor management**
- **Complete CRUD operations**
- **Key-value pair handling**

### 7. **Heaps**
- **Min Heap implementation**
- **Heapify operations**
- **Insert and extract operations**
- **Heap sort algorithm**
- **Priority queue functionality**

### 8. **Sorting Algorithms**
- **Bubble Sort** - O(n²) time complexity
- **Selection Sort** - O(n²) time complexity
- **Insertion Sort** - O(n²) time complexity
- **Merge Sort** - O(n log n) time complexity
- **Quick Sort** - O(n log n) average, O(n²) worst case

### 9. **Searching Algorithms**
- **Linear Search** - O(n) time complexity
- **Binary Search** - O(log n) time complexity
- **Binary Search (Recursive)** - O(log n) time complexity

### 10. **Dynamic Programming**
- **Fibonacci sequence** (recursive vs DP)
- **Longest Common Subsequence (LCS)**
- **Coin Change problem**
- **Memoization techniques**
- **Bottom-up vs Top-down approaches**

### 11. **Recursion**
- **Factorial calculation**
- **Tower of Hanoi**
- **Greatest Common Divisor (GCD)**
- **Recursive tree traversals**
- **Backtracking algorithms**

### 12. **Greedy Algorithms**
- **Activity Selection problem**
- **Fractional Knapsack**
- **Greedy choice property**
- **Optimal substructure**

### 13. **Backtracking**
- **N-Queens problem**
- **Sudoku solver**
- **State space tree exploration**
- **Constraint satisfaction**

### 14. **Graph Algorithms**
- **Dijkstra's Shortest Path**
- **Graph traversal algorithms**
- **Path finding**
- **Weighted graph operations**

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

# Run the main DSA demo class
mvn exec:java -Dexec.mainClass="com.languagesreview.datastructurealgorithm.DataStructureAlgorithmDemo"

# Or run directly with Java
java -cp target/classes com.languagesreview.datastructurealgorithm.DataStructureAlgorithmDemo

# Create executable JAR
mvn package

# Run the JAR file
java -jar target/java-basic-syntax-1.0.0.jar
```

### Using IDE

1. Import the project as a Maven project
2. Run `DataStructureAlgorithmDemo.main()` method
3. View the comprehensive output in the console

## 📋 Expected Output

The program will demonstrate all DSA concepts with detailed output including:

```
=== Java Data Structures & Algorithms Examples ===

1. ARRAYS AND ARRAY MANIPULATION:
Original array: [64, 34, 25, 12, 22, 11, 90]
Reversed array: [90, 11, 22, 12, 25, 34, 64]
Max: 90, Min: 11
Two sum for target 9: [0, 7]
Max sum with window size 4: 24

2. LINKED LIST IMPLEMENTATION:
Original list: [1, 2, 3, 4, 5]
Reversed list: [5, 4, 3, 2, 1]
Has cycle: false
Middle element: 3

[... continues with all 16 sections ...]
```

## 🎓 Learning Path

For senior engineers, we recommend this learning sequence:

1. **Start with**: Arrays, Linked Lists, Stacks, Queues
2. **Core structures**: Trees, Graphs, Hash Tables, Heaps
3. **Algorithms**: Sorting, Searching, Dynamic Programming
4. **Advanced**: Recursion, Greedy, Backtracking, Graph Algorithms

## 📊 Time Complexity Analysis

### Data Structures
- **Array**: Access O(1), Search O(n), Insert/Delete O(n)
- **Linked List**: Access O(n), Search O(n), Insert/Delete O(1)
- **Stack/Queue**: All operations O(1)
- **Binary Tree**: Search/Insert/Delete O(h) where h is height
- **BST**: Search/Insert/Delete O(h), worst case O(n)
- **Hash Table**: Average O(1), worst case O(n)
- **Heap**: Insert/Delete O(log n), Get min/max O(1)

### Algorithms
- **Bubble Sort**: O(n²)
- **Selection Sort**: O(n²)
- **Insertion Sort**: O(n²)
- **Merge Sort**: O(n log n)
- **Quick Sort**: O(n log n) average, O(n²) worst
- **Linear Search**: O(n)
- **Binary Search**: O(log n)
- **DFS/BFS**: O(V + E) where V=vertices, E=edges

## 🔧 Customization

You can extend this package by:

1. **Adding new data structures** (Trie, AVL Tree, Red-Black Tree)
2. **Implementing more algorithms** (KMP, Boyer-Moore, etc.)
3. **Adding unit tests** for validation
4. **Including performance benchmarks**
5. **Adding visualization tools**
6. **Creating problem-specific solutions**

## 📚 Additional Resources

- [Introduction to Algorithms (CLRS)](https://mitpress.mit.edu/books/introduction-algorithms-third-edition)
- [Algorithms by Robert Sedgewick](https://algs4.cs.princeton.edu/)
- [LeetCode](https://leetcode.com/) - Practice problems
- [HackerRank](https://www.hackerrank.com/) - Algorithm challenges
- [GeeksforGeeks](https://www.geeksforgeeks.org/) - DSA tutorials

## 🎯 Interview Preparation

This package is excellent for:
- **Technical interviews** at top tech companies
- **System design discussions**
- **Algorithm optimization**
- **Code review scenarios**
- **Performance analysis**

## 🤝 Contributing

Feel free to:
- Add more data structures (Trie, Segment Tree, etc.)
- Implement additional algorithms
- Add unit tests and benchmarks
- Enhance documentation
- Suggest new features

## 📄 License

This project is open source and available under the MIT License.

---

**Happy Coding! 🚀** 