package singlylinkedlist.studentrecordmanagement;

    // Package declaration


    // Class representing a student node in a linked list
public class StudentNode{
        private String rollNumber;
        private String name;
        private int age;
        private char grade;
        StudentNode next;

        // Constructor to initialize StudentNode details
        public StudentNode(String rollNumber, String name, int age, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
        // adding front
        public static StudentNode addFront(StudentNode start, StudentNode newNode){
            newNode.next=start;
            start=newNode;
            return start;

        }
        // adding back
        public static StudentNode addBack(StudentNode start, StudentNode newNode){
            StudentNode p=start;
            while(p.next!=null){
                p=p.next;
            }
            p.next=newNode;
            return start;
        }
        // adding between
        public static StudentNode addBetween(StudentNode start, StudentNode newNode, int position){
            StudentNode p=start;
            StudentNode q=start.next;
            if(position==0){
                return start;
            }
            if(position==1){
                newNode.next=start;
                start=newNode;
                return start;

            }
            int i=0;
            while(i!=position-1) {
                if(q.next==null){
                    q.next=newNode;
                    return start;
                }
                p = p.next;
                q = q.next;
                i += 1;
            }
            newNode.next=p.next;
            p.next=newNode;
            return  start;
        }
        // Method to delete a student node based on roll number
        public static StudentNode deleteNode(StudentNode start, String input) {
            StudentNode p = start;
            StudentNode q = start.next;
            if (p.rollNumber.equals(input)) {
                System.out.println("Student Found and deleted");
                start = q;
                return start;
            }
            if (q.next == null && q.rollNumber.equals(input)) {
                System.out.println("Student Found and Deleted");
                p.next = null;
            }
            while (q.next != null) {
                if (q.rollNumber.equals(input)) {
                    System.out.println("Student Found and deleted");
                    p.next = q.next;
                    return start;
                }

                p = p.next;
                q = q.next;
            }
            if (q.next == null && q.rollNumber.equals(input)) {
                System.out.println("Student Found and Deleted");
                p.next = null;
            }
            else {
                System.out.println("Student Not Exist");
            }
            return start;
        }

        // Method to search for a student node based on roll number
        public static void searchStudent(StudentNode start, String input) {
            StudentNode p = start;
            while (p != null) {
                if (p.rollNumber.equals(input)) {
                    System.out.println("Student Found");
                    return;
                }
                p = p.next;
            }

            System.out.println("Student Not Exist");
        }

        // Method to update the grade of a student node based on roll number
        public static void updateStudent(StudentNode start, String input, char g) {
            StudentNode p = start;
            while (p != null) {
                if (p.rollNumber.equals(input)) {
                    System.out.println("Grade Updated");
                    p.grade = g;
                    return;
                }
                p = p.next;
            }
            System.out.println("Student Not Exist");
        }


        // Method to display the details of all student nodes
        public static void display(StudentNode start) {
            StudentNode p = start;
            while (p != null) {
                System.out.println("Name of the Student: " + p.name);
                System.out.println("Roll Number of the Student: " + p.rollNumber);
                System.out.println("Age of the Student: " + p.age);
                System.out.println("Grade of the Student: " + p.grade);
                System.out.println(" ");
                p = p.next;
            }
        }
}


