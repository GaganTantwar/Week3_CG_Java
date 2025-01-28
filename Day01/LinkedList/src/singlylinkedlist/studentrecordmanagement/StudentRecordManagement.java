package singlylinkedlist.studentrecordmanagement;


public class StudentRecordManagement {
    public static void main(String args[]) {
        // Creating instances of StudentNode
        StudentNode ram = new StudentNode("0199AL211017", "Ram Sharma", 21, 'A');
        StudentNode simran = new StudentNode("0199AL211055", "Simran Singh", 20, 'A');
        StudentNode sumit = new StudentNode("0199AL211037", "Sumit Rao", 21, 'B');
        StudentNode faiz = new StudentNode("0199AL211027", "Fiaz Ali", 22, 'C');

        // Linking the student nodes
        ram.next = simran;
        simran.next = sumit;
        sumit.next = faiz;
        StudentNode saif = new  StudentNode("0199AL211025", "Saif Khan", 21, 'B');
        StudentNode fateh = new StudentNode("0199AL211047", "Fateh Singh", 22, 'C');
        StudentNode shubham= new  StudentNode("0199AL211056", "Shubham Rajput", 23, 'B');


        StudentNode start1=  StudentNode.addFront(ram,saif);
        StudentNode start2= StudentNode.addBack(start1,fateh);
        StudentNode start3=  StudentNode.addBetween(start2,shubham,3);
        // Displaying the student records
        StudentNode.display(start3);

        // Updating a student's grade
        StudentNode.updateStudent(ram, "0199AL211037", 'C');
        StudentNode.display(start3);

        // Deleting a student record
        StudentNode start4= StudentNode.deleteNode(start3, "0199AL211027");
        StudentNode.display(start4);
    }
}
