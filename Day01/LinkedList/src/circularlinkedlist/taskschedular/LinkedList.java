package circularlinkedlist.taskschedular;

public class LinkedList {
    static Task head;
    static Task foot;

    // Constructor to initialize the linked list
    public LinkedList() {
        this.head = null;
        this.foot = null;
    }

    // Method to insert a new task at the end of the list
    public static void insertElement(String taskId, String taskName, int priority, String dueDate) {
        Task task = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = task;
            foot = task;
        }
        foot.next = task;
        task.next = head;
        foot = task;
    }

    // Method to add a new task at the front of the list
    public static void addFront(String taskId, String taskName, int priority, String dueDate) {
        Task task = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = task;
            foot = task;
        }
        if (head.next == null) {
            task.next = head;
            head = task;
            foot.next = head;
        }
        task.next = head;
        head = task;
        foot.next = head;
    }

    // Method to add a new task at the back of the list
    public static void addBack(String taskId, String taskName, int priority, String dueDate) {
        Task task = new Task(taskId, taskName, priority, dueDate);
        foot.next = task;
        task.next = head;
        foot = task;
    }

    // Method to add a new task at a specific position in the list
    public static void addBetween(String taskId, String taskName, int priority, String dueDate, int position) {
        Task task = new Task(taskId, taskName, priority, dueDate);
        Task p = head;
        Task q = head.next;
        if (position == 0) {
            return;
        }
        if (position == 1) {
            task.next = head;
            head = task;
            foot.next = head;
            return;
        }
        int i = 0;
        while (i != position - 1) {
            if (q.next == null) {
                foot.next = task;
                task.next = head;
                foot = task;
                return;
            }
            p = p.next;
            q = q.next;
            i += 1;
        }
        p.next = task;
        task.next = q;
    }

    // Method to delete a task node based on task ID
    public static void deleteNode(String taskId) {
        Task p = head;
        Task q = head.next;
        if (p.taskId.equals(taskId)) {
            System.out.println("Node Found and Deleted");
            foot.next = q;
            head = q;
            return;
        }
        if (q.next == null && q.taskId.equals(taskId)) {
            System.out.println("Node Found and Deleted");
            head = p;
            foot = p;
            p.next = p;
            return;
        }
        while (q.next != null) {
            if (q.taskId.equals(taskId)) {
                System.out.println("Node Found and Deleted");
                p.next = q.next;
                return;
            }
            p = p.next;
            q = q.next;
        }
        System.out.println("Node Not found");
    }

    // Method to search for a task node based on priority
    public static void searchNode(int priority) {
        Task p = head;
        do {
            if (p.priority == priority) {
                System.out.println("Node found");
                return;
            }
            p = p.next;
        } while (p != head);
        System.out.println("Node not found");
    }

    // Method to display the details of all task nodes
    public static void display() {
        Task curr = head;
        if (curr == null) {
            return;
        }
        if (curr.next == null) {
            return;
        }
        do {
            System.out.println("Current task Id: " + curr.taskId);
            System.out.println("Current task Name: " + curr.taskName);
            System.out.println("Current task Priority: " + curr.priority);
            System.out.println("Current task Due Date: " + curr.dueDate);

            curr = curr.next;
        } while (curr != head);
    }
}
