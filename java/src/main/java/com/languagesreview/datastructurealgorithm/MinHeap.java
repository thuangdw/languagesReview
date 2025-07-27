package com.languagesreview.datastructurealgorithm;

import java.util.*;

/**
 * Min Heap implementation using array
 */
public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;
    
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }
    
    public void insert(int value) {
        if (size >= capacity) {
            throw new IllegalStateException("Heap is full");
        }
        
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }
    
    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        
        return min;
    }
    
    public int getMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }
    
    public void delete(int value) {
        int index = findIndex(value);
        if (index == -1) {
            return;
        }
        
        heap[index] = Integer.MIN_VALUE;
        heapifyUp(index);
        extractMin();
    }
    
    public void decreaseKey(int index, int newValue) {
        if (index >= size) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        
        if (newValue > heap[index]) {
            throw new IllegalArgumentException("New value is greater than current value");
        }
        
        heap[index] = newValue;
        heapifyUp(index);
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;
        
        while (index > 0 && heap[parent] > heap[index]) {
            swap(parent, index);
            index = parent;
            parent = (index - 1) / 2;
        }
    }
    
    private void heapifyDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        
        if (leftChild < size && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }
        
        if (rightChild < size && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }
        
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }
    
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    private int findIndex(int value) {
        for (int i = 0; i < size; i++) {
            if (heap[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    public void buildHeap(int[] array) {
        if (array.length > capacity) {
            throw new IllegalArgumentException("Array size exceeds heap capacity");
        }
        
        size = array.length;
        System.arraycopy(array, 0, heap, 0, size);
        
        // Heapify from the last non-leaf node
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }
    
    public void heapSort(int[] array) {
        buildHeap(array);
        
        for (int i = size - 1; i > 0; i--) {
            swap(0, i);
            size--;
            heapifyDown(0);
        }
        
        // Restore size
        size = array.length;
    }
    
    public boolean isMinHeap() {
        return isMinHeapUtil(0);
    }
    
    private boolean isMinHeapUtil(int index) {
        if (index >= size) {
            return true;
        }
        
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        
        if (leftChild < size && heap[leftChild] < heap[index]) {
            return false;
        }
        
        if (rightChild < size && heap[rightChild] < heap[index]) {
            return false;
        }
        
        return isMinHeapUtil(leftChild) && isMinHeapUtil(rightChild);
    }
    
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        for (int i = 0; i < size; i++) {
            sb.append(heap[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        
        sb.append("]");
        return sb.toString();
    }
    
    // Utility method to print heap as a tree
    public void printHeap() {
        if (size == 0) {
            System.out.println("Empty heap");
            return;
        }
        
        int levels = (int) Math.ceil(Math.log(size + 1) / Math.log(2));
        int maxWidth = (int) Math.pow(2, levels - 1) * 3;
        
        for (int level = 0; level < levels; level++) {
            int start = (int) Math.pow(2, level) - 1;
            int end = Math.min((int) Math.pow(2, level + 1) - 1, size);
            
            int spaces = maxWidth / ((int) Math.pow(2, level) + 1);
            
            for (int i = start; i < end; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print(heap[i]);
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 