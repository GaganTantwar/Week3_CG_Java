package singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String args[]) {
        // Creating instances of ItemNode
        ItemNode item1 = new ItemNode("Shampoo", "ID786", 20, 5);
        ItemNode item2 = new ItemNode("Soap", "ID562", 5, 20);
        ItemNode item3 = new ItemNode("Face Wash", "ID987", 1, 100);
        ItemNode item4 = new ItemNode("Face Pack", "ID957", 1, 50);
        ItemNode item5 = new ItemNode("Face Cream", "ID987", 1, 200);
        ItemNode item6 = new ItemNode("Hair wax", "ID527", 1, 150);

        // Linking the item nodes
        item1.next = item2;
        item2.next = item3;

        // Adding items to the list
        ItemNode start1 = ItemNode.addFront(item1, item4);
        ItemNode start2 = ItemNode.addBetween(start1, item5, 2);
        ItemNode start3 = ItemNode.addBack(start2, item6);

        // Displaying the linked list after addition
        System.out.println("Linked List After Addition");
        ItemNode.display(start3);

        // Deleting an item from the list
        ItemNode start4 = ItemNode.deleteItem(start3, "ID527");
        System.out.println("Linked List After Deletion");
        ItemNode.display(start4);

        // Searching for items in the list
        ItemNode.searchItem1(start4, "ID857");
        ItemNode.searchItem2(start4, "Face Cream");

        // Sorting the items in ascending order by price
        ItemNode start5 = ItemNode.sortAssending(start4);
        System.out.println("After Sorting in Ascending Order by Price");
        ItemNode.display(start5);

        // Sorting the items in descending order by price
        ItemNode start6 = ItemNode.sortDecending(start5);
        System.out.println("After Sorting in Descending Order by Price");
        ItemNode.display(start6);

        // Calculating the total price of all items
        ItemNode.calculateTotal(start6);
    }

}
