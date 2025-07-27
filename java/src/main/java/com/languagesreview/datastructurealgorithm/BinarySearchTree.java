package com.languagesreview.datastructurealgorithm;

import java.util.*;

/**
 * Binary Search Tree implementation with search operations
 */
public class BinarySearchTree {
    private Node root;
    
    private static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    public void insert(int data) {
        root = insertRec(root, data);
    }
    
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        
        return root;
    }
    
    public boolean search(int data) {
        return searchRec(root, data);
    }
    
    private boolean searchRec(Node root, int data) {
        if (root == null || root.data == data) {
            return root != null;
        }
        
        if (data < root.data) {
            return searchRec(root.left, data);
        }
        
        return searchRec(root.right, data);
    }
    
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMinRec(root);
    }
    
    private int findMinRec(Node root) {
        if (root.left == null) {
            return root.data;
        }
        return findMinRec(root.left);
    }
    
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaxRec(root);
    }
    
    private int findMaxRec(Node root) {
        if (root.right == null) {
            return root.data;
        }
        return findMaxRec(root.right);
    }
    
    public void delete(int data) {
        root = deleteRec(root, data);
    }
    
    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }
        
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // Node with two children: Get the inorder successor (smallest in right subtree)
            root.data = findMinRec(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        
        return root;
    }
    
    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderRec(root, result);
        return result;
    }
    
    private void inorderRec(Node root, List<Integer> result) {
        if (root != null) {
            inorderRec(root.left, result);
            result.add(root.data);
            inorderRec(root.right, result);
        }
    }
    
    public boolean isValidBST() {
        return isValidBSTRec(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBSTRec(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        
        if (root.data <= min || root.data >= max) {
            return false;
        }
        
        return isValidBSTRec(root.left, min, root.data) && 
               isValidBSTRec(root.right, root.data, max);
    }
} 