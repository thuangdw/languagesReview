package com.languagesreview.datastructurealgorithm;

import java.util.*;

/**
 * Binary Tree implementation with traversal methods
 */
public class BinaryTree {
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
    
    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorderRec(root, result);
        return result;
    }
    
    private void preorderRec(Node root, List<Integer> result) {
        if (root != null) {
            result.add(root.data);
            preorderRec(root.left, result);
            preorderRec(root.right, result);
        }
    }
    
    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        postorderRec(root, result);
        return result;
    }
    
    private void postorderRec(Node root, List<Integer> result) {
        if (root != null) {
            postorderRec(root.left, result);
            postorderRec(root.right, result);
            result.add(root.data);
        }
    }
    
    public List<Integer> levelOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);
            
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        
        return result;
    }
    
    public int height() {
        return heightRec(root);
    }
    
    private int heightRec(Node root) {
        if (root == null) return 0;
        
        int leftHeight = heightRec(root.left);
        int rightHeight = heightRec(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
} 