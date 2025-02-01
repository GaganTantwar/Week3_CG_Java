package circularlinkedlist.taskschedular;

public class Task {
    String taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    // Constructor to initialize Task details
    public Task(String taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = this;
    }
}
