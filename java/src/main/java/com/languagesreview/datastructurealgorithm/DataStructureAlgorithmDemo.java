package com.languagesreview.datastructurealgorithm;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Comprehensive demonstration of Data Structures and Algorithms in Java
 * Covers: Arrays, Linked Lists, Stacks, Queues, Trees, Graphs, 
 * Sorting, Searching, Dynamic Programming, and more
 */
public class DataStructureAlgorithmDemo {
    
    public static void main(String[] args) {
        DataStructureAlgorithmDemo demo = new DataStructureAlgorithmDemo();
        demo.runAllExamples();
    }
    
    public void runAllExamples() {
        System.out.println("=== Java Data Structures & Algorithms Examples ===\n");
        
        demonstrateArrays();
        demonstrateLinkedList();
        demonstrateStack();
        demonstrateQueue();
        demonstrateBinaryTree();
        demonstrateBinarySearchTree();
        demonstrateGraph();
        demonstrateHashTable();
        demonstrateHeap();
        demonstrateSortingAlgorithms();
        demonstrateSearchingAlgorithms();
        demonstrateDynamicProgramming();
        demonstrateRecursion();
        demonstrateGreedyAlgorithms();
        demonstrateBacktracking();
        demonstrateGraphAlgorithms();
    }
    
    // 1. Arrays and Array Manipulation
    private void demonstrateArrays() {
        System.out.println("1. ARRAYS AND ARRAY MANIPULATION:");
        
        // Basic array operations
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Array reversal
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        
        // Find maximum and minimum
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Max: " + max + ", Min: " + min);
        
        // Two pointer technique
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Two sum for target 9: " + Arrays.toString(twoSum(sortedArr, 9)));
        
        // Sliding window
        int[] windowArr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        System.out.println("Max sum with window size 4: " + maxSumSubarray(windowArr, 4));
        System.out.println();
    }
    
    // 2. Linked List Implementation
    private void demonstrateLinkedList() {
        System.out.println("2. LINKED LIST IMPLEMENTATION:");
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("Original list: " + list);
        
        // Reverse linked list
        reverseLinkedList(list);
        System.out.println("Reversed list: " + list);
        
        // Detect cycle
        System.out.println("Has cycle: " + hasCycle(list));
        
        // Find middle element
        System.out.println("Middle element: " + findMiddle(list));
        System.out.println();
    }
    
    // 3. Stack Implementation
    private void demonstrateStack() {
        System.out.println("3. STACK IMPLEMENTATION:");
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        
        // Valid parentheses
        String parentheses = "({[]})";
        System.out.println("Valid parentheses '" + parentheses + "': " + isValidParentheses(parentheses));
        System.out.println();
    }
    
    // 4. Queue Implementation
    private void demonstrateQueue() {
        System.out.println("4. QUEUE IMPLEMENTATION:");
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        
        // Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        
        System.out.println("Priority Queue: " + pq);
        System.out.println("Min element: " + pq.peek());
        System.out.println();
    }
    
    // 5. Binary Tree Implementation
    private void demonstrateBinaryTree() {
        System.out.println("5. BINARY TREE IMPLEMENTATION:");
        
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);
        
        System.out.println("Inorder traversal: " + tree.inorderTraversal());
        System.out.println("Preorder traversal: " + tree.preorderTraversal());
        System.out.println("Postorder traversal: " + tree.postorderTraversal());
        System.out.println("Level order traversal: " + tree.levelOrderTraversal());
        System.out.println("Tree height: " + tree.height());
        System.out.println();
    }
    
    // 6. Binary Search Tree Implementation
    private void demonstrateBinarySearchTree() {
        System.out.println("6. BINARY SEARCH TREE IMPLEMENTATION:");
        
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        System.out.println("BST inorder: " + bst.inorderTraversal());
        System.out.println("Search for 40: " + bst.search(40));
        System.out.println("Search for 100: " + bst.search(100));
        System.out.println("Min value: " + bst.findMin());
        System.out.println("Max value: " + bst.findMax());
        System.out.println();
    }
    
    // 7. Graph Implementation
    private void demonstrateGraph() {
        System.out.println("7. GRAPH IMPLEMENTATION:");
        
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        
        System.out.println("Graph adjacency list:");
        graph.printGraph();
        
        System.out.println("DFS starting from vertex 0: " + graph.dfs(0));
        System.out.println("BFS starting from vertex 0: " + graph.bfs(0));
        System.out.println();
    }
    
    // 8. Hash Table Implementation
    private void demonstrateHashTable() {
        System.out.println("8. HASH TABLE IMPLEMENTATION:");
        
        HashTable<String, Integer> ht = new HashTable<>();
        ht.put("apple", 1);
        ht.put("banana", 2);
        ht.put("cherry", 3);
        ht.put("date", 4);
        
        System.out.println("Hash table: " + ht);
        System.out.println("Get 'banana': " + ht.get("banana"));
        System.out.println("Contains 'apple': " + ht.containsKey("apple"));
        ht.remove("banana");
        System.out.println("After removing 'banana': " + ht);
        System.out.println();
    }
    
    // 9. Heap Implementation
    private void demonstrateHeap() {
        System.out.println("9. HEAP IMPLEMENTATION:");
        
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(4);
        minHeap.insert(10);
        minHeap.insert(8);
        minHeap.insert(5);
        minHeap.insert(1);
        minHeap.insert(7);
        
        System.out.println("Min heap: " + minHeap);
        System.out.println("Extract min: " + minHeap.extractMin());
        System.out.println("Min heap after extraction: " + minHeap);
        System.out.println();
    }
    
    // 10. Sorting Algorithms
    private void demonstrateSortingAlgorithms() {
        System.out.println("10. SORTING ALGORITHMS:");
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Bubble Sort
        int[] bubbleArr = arr.clone();
        bubbleSort(bubbleArr);
        System.out.println("Bubble sort: " + Arrays.toString(bubbleArr));
        
        // Selection Sort
        int[] selectionArr = arr.clone();
        selectionSort(selectionArr);
        System.out.println("Selection sort: " + Arrays.toString(selectionArr));
        
        // Insertion Sort
        int[] insertionArr = arr.clone();
        insertionSort(insertionArr);
        System.out.println("Insertion sort: " + Arrays.toString(insertionArr));
        
        // Merge Sort
        int[] mergeArr = arr.clone();
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        System.out.println("Merge sort: " + Arrays.toString(mergeArr));
        
        // Quick Sort
        int[] quickArr = arr.clone();
        quickSort(quickArr, 0, quickArr.length - 1);
        System.out.println("Quick sort: " + Arrays.toString(quickArr));
        System.out.println();
    }
    
    // 11. Searching Algorithms
    private void demonstrateSearchingAlgorithms() {
        System.out.println("11. SEARCHING ALGORITHMS:");
        
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        
        // Linear Search
        int linearResult = linearSearch(arr, target);
        System.out.println("Linear search for " + target + ": index " + linearResult);
        
        // Binary Search
        int binaryResult = binarySearch(arr, target);
        System.out.println("Binary search for " + target + ": index " + binaryResult);
        
        // Binary Search (Recursive)
        int binaryRecursiveResult = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("Binary search (recursive) for " + target + ": index " + binaryRecursiveResult);
        System.out.println();
    }
    
    // 12. Dynamic Programming
    private void demonstrateDynamicProgramming() {
        System.out.println("12. DYNAMIC PROGRAMMING:");
        
        // Fibonacci
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        System.out.println("Fibonacci with DP(" + n + ") = " + fibonacciDP(n));
        
        // Longest Common Subsequence
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println("LCS of '" + s1 + "' and '" + s2 + "': " + longestCommonSubsequence(s1, s2));
        
        // Coin Change
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Minimum coins for amount " + amount + ": " + coinChange(coins, amount));
        System.out.println();
    }
    
    // 13. Recursion
    private void demonstrateRecursion() {
        System.out.println("13. RECURSION:");
        
        // Factorial
        int n = 5;
        System.out.println("Factorial(" + n + ") = " + factorial(n));
        
        // Tower of Hanoi
        System.out.println("Tower of Hanoi for 3 disks:");
        towerOfHanoi(3, 'A', 'C', 'B');
        
        // GCD
        int a = 48, b = 18;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        System.out.println();
    }
    
    // 14. Greedy Algorithms
    private void demonstrateGreedyAlgorithms() {
        System.out.println("14. GREEDY ALGORITHMS:");
        
        // Activity Selection
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        System.out.println("Maximum activities: " + activitySelection(start, finish));
        
        // Fractional Knapsack
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        System.out.println("Fractional knapsack value: " + fractionalKnapsack(weights, values, capacity));
        System.out.println();
    }
    
    // 15. Backtracking
    private void demonstrateBacktracking() {
        System.out.println("15. BACKTRACKING:");
        
        // N-Queens
        int n = 4;
        System.out.println("Solutions for " + n + "-Queens:");
        solveNQueens(n);
        
        // Sudoku
        int[][] sudoku = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        System.out.println("Sudoku solution:");
        if (solveSudoku(sudoku)) {
            printSudoku(sudoku);
        }
        System.out.println();
    }
    
    // 16. Graph Algorithms
    private void demonstrateGraphAlgorithms() {
        System.out.println("16. GRAPH ALGORITHMS:");
        
        // Dijkstra's Shortest Path
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        
        System.out.println("Dijkstra's shortest path from vertex 0:");
        dijkstra(graph, 0);
        System.out.println();
    }
    
    // Array manipulation methods
    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    private int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    
    private int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    
    private int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    
    private int maxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        
        int windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    
    // Linked List methods
    private void reverseLinkedList(LinkedList<Integer> list) {
        // Implementation would go here
        Collections.reverse(list);
    }
    
    private boolean hasCycle(LinkedList<Integer> list) {
        // Implementation would go here
        return false;
    }
    
    private Integer findMiddle(LinkedList<Integer> list) {
        if (list.isEmpty()) return null;
        return list.get(list.size() / 2);
    }
    
    // Stack methods
    private boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    // Sorting algorithms
    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    private void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    private void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    // Searching algorithms
    private int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    private int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    private int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }
    
    // Dynamic Programming
    private int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    private int fibonacciDP(int n) {
        if (n <= 1) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
    
    private int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[m][n];
    }
    
    private int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
    
    // Recursion
    private int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    private void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    // Greedy algorithms
    private int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        int count = 1;
        int lastFinish = finish[0];
        
        for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinish) {
                count++;
                lastFinish = finish[i];
            }
        }
        
        return count;
    }
    
    private double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        double[][] items = new double[n][2];
        
        for (int i = 0; i < n; i++) {
            items[i][0] = weights[i];
            items[i][1] = values[i];
        }
        
        Arrays.sort(items, (a, b) -> Double.compare(b[1] / b[0], a[1] / a[0]));
        
        double totalValue = 0;
        for (int i = 0; i < n && capacity > 0; i++) {
            if (items[i][0] <= capacity) {
                totalValue += items[i][1];
                capacity -= items[i][0];
            } else {
                totalValue += (items[i][1] * capacity) / items[i][0];
                capacity = 0;
            }
        }
        
        return totalValue;
    }
    
    // Backtracking
    private void solveNQueens(int n) {
        int[] queens = new int[n];
        solveNQueensUtil(queens, 0, n);
    }
    
    private void solveNQueensUtil(int[] queens, int row, int n) {
        if (row == n) {
            printQueens(queens);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col;
                solveNQueensUtil(queens, row + 1, n);
            }
        }
    }
    
    private boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    
    private void printQueens(int[] queens) {
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValidSudoku(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board)) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValidSudoku(int[][] board, int row, int col, int num) {
        // Check row
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num) return false;
        }
        
        // Check column
        for (int x = 0; x < 9; x++) {
            if (board[x][col] == num) return false;
        }
        
        // Check 3x3 box
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) return false;
            }
        }
        
        return true;
    }
    
    private void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if (j == 2 || j == 5) System.out.print("| ");
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("------+-------+------");
            }
        }
    }
    
    // Graph algorithms
    private void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && 
                    dist[u] != Integer.MAX_VALUE && 
                    dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        
        for (int i = 0; i < V; i++) {
            System.out.println("Distance from " + src + " to " + i + ": " + dist[i]);
        }
    }
    
    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
} 