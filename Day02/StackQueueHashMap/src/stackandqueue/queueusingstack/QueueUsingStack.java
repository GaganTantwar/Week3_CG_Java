// Package declaration
package stackandqueue.queueusingstack;

import java.util.*;

// Class representing a queue using two stacks
public class QueueUsingStack {
    Stack<Integer> enqueue;
    Stack<Integer> dequeue;
    int count = 0;

    // Constructor to initialize the stacks
    public QueueUsingStack() {
        this.enqueue = new Stack<>();
        this.dequeue = new Stack<>();
    }

    // Method to insert an element into the queue
    public void insert(int x) {
        enqueue.push(x);
        count += 1;
    }

    // Method to perform queue operations
    public void queueOperation() {
        if (enqueue.isEmpty() || count == 0) {
            System.out.println("Please Enter Some Element: ");
            return;
        }
        int i = 0;
        while (i != count) {
            int value = enqueue.pop();
            System.out.println("Element in LIFO Order: " + value);
            dequeue.push(value);
            i += 1;
        }
    }

    // Method to display elements in FIFO order
    public void display() {
        int j = 0;
        while (j != count) {
            System.out.println("Element In FIFO Order: " + dequeue.pop());
            j += 1;
        }
    }

    // Main method to test the QueueUsingStack class
    public static void main(String args[]) {
        QueueUsingStack queue = new QueueUsingStack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values you want in queue");
        int number = sc.nextInt();
        while (number != 0) {
            System.out.println("Enter Value: ");
            int value = sc.nextInt();
            queue.insert(value);
            number -= 1;
        }
        queue.queueOperation();
        queue.display();
    }
}
