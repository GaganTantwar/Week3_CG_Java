package doublylinkedlist.libraraymanagementsystem;

public class LibrarayManagementSystem {
    public static void main(String arsg[]) {
        LinkedListOperation list = new LinkedListOperation();
        LinkedListOperation.insert("Half Girlfriend", "Chetan Bhagat", "Romance", 1253, true);
        LinkedListOperation.insert("Discovery of India", "Jawaharlal Nehru", "History", 1254, true);
        LinkedListOperation.insert("Dynamics of Social Change ", "Chandra Shekhar", "Social Life", 1542, false);
        LinkedListOperation.addFront("Essays on Gita","Sri Aurobindo Ghosh","Holy",1545,true);
        LinkedListOperation.addBack("Eternal Himalayas","Major H.P.S. Ahluwalia","Geographic",1452,false);
        LinkedListOperation.addBetween("Geet Govinda","Jayadeva","Romance",1789,3,true);
        System.out.println("After Insertion: ");
        LinkedListOperation.display();
        LinkedListOperation.deleteBook(1789);
        System.out.println("After Deletion: ");
        LinkedListOperation.display();
        LinkedListOperation.searchBook1("Discovery of India");
        LinkedListOperation.searchBook2("Chetan Bhagat");
        LinkedListOperation.updateStatus(false,"Half Girlfriend");
        LinkedListOperation.display();
        LinkedListOperation.countTotal();




    }

}
