package circularlinkedlist.taskschedular;

// Main class to manage the task scheduler
public class TaskSchedular {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        LinkedList.insertElement("TID1", "Assignment 1", 1, "28-01-2025");
        LinkedList.insertElement("TID2", "Assignment 2", 2, "29-01-2025");
        LinkedList.insertElement("TID3", "Assignment 3", 3, "30-01-2025");
        LinkedList.insertElement("TID4", "Assignment 4", 4, "31-01-2025");
        LinkedList.addFront("TID5", "Assignment 5", 5, "01-02-2025");
        LinkedList.addBack("TID6", "Assignment 6", 6, "02-02-2025");
        LinkedList.addBetween("TID7", "Assignment 7", 7, "03-02-2025", 3);
        System.out.println("Linked List Before deletion");
        LinkedList.display();
        LinkedList.deleteNode("TID5");
        System.out.println("Linked List After deletion");
        LinkedList.display();
        LinkedList.searchNode(4);
        LinkedList.display();
    }
}
