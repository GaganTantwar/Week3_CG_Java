package doublylinkedlist.undoredofunctionality;

// Class representing the UndoRedo functionality
public class UndoRedo {
    private NewTask head;
    private NewTask tail;
    private NewTask current;
    private int maxHistorySize;
    private int currentSize;

    // Constructor to initialize the UndoRedo functionality with a maximum history size
    UndoRedo(int maxHistorySize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.maxHistorySize = maxHistorySize;
        this.currentSize = 0;
    }

    // Method to add a new state to the history
    public void addState(String content) {
        NewTask newState = new NewTask(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;

        if (head == null) {
            head = tail = current;
        } else if (tail.next == current) {
            tail = current;
        }

        if (currentSize == maxHistorySize) {
            head = head.next;
            head.prev = null;
        } else {
            currentSize++;
        }
    }

    // Method to undo the last action
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Method to redo the last undone action
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Method to get the current task content
    public String getCurrentTask() {
        return current != null ? current.content : "";
    }

    // Method to display the current task content
    public void displayCurrentTask() {
        System.out.println("Current State: " + getCurrentTask());
    }
}
