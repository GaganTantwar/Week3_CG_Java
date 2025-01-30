// Package declaration
package stackandqueue.stackusingrecursion;

import java.util.*;

// Class representing stack operations using recursion
public class StackUsingRecursion {

    // Method to insert an element into the sorted stack
    static void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    // Method to sort the stack using recursion
    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            sortedInsert(s, x);
        }
    }

    // Method to print the elements of the stack in sorted order
    static void printStack(Stack<Integer> s) {
        Stack<Integer> sorted = new Stack<>();
        while (!s.empty()) {
            sorted.push(s.pop());
        }
        while (!sorted.empty()) {
            System.out.println("Element in Sorted order: " + sorted.pop());
        }
    }

    // Main method to test the StackUsingRecursion class
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(9);
        stack.push(4);
        stack.push(7);
        sortStack(stack);
        printStack(stack);
    }
}
