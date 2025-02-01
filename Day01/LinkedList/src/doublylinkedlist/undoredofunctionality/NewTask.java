// Package declaration
package doublylinkedlist.undoredofunctionality;

// Class representing a new task in a doubly linked list
public class NewTask {
    String content;
    NewTask prev;
    NewTask next;

    // Constructor to initialize NewTask details
    NewTask(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

