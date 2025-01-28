package singlylinkedlist.inventorymanagementsystem;



public class ItemNode {
    private String itemName;
    private final String itemId;
    private double quantity;
    private int price;
    ItemNode next;
    private static double total;

    // Constructor to initialize ItemNode details
    public ItemNode(String itemName, String itemId, double quantity, int price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    // Method to add a new node at the front of the list
    public static ItemNode addFront(ItemNode start, ItemNode newNode) {
        newNode.next = start;
        start = newNode;
        return start;
    }

    // Method to add a new node at the back of the list
    public static ItemNode addBack(ItemNode start, ItemNode newNode) {
        ItemNode p = start;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        return start;
    }

    // Method to add a new node at a specific position in the list
    public static ItemNode addBetween(ItemNode start, ItemNode newNode, int position) {
        ItemNode p = start;
        ItemNode q = start.next;
        if (position == 0) {
            return start;
        }
        if (position == 1) {
            newNode.next = start;
            start = newNode;
            return start;
        }
        int i = 0;
        while (i != position - 1) {
            if (q.next == null) {
                q.next = newNode;
                return start;
            }
            p = p.next;
            q = q.next;
            i += 1;
        }
        newNode.next = p.next;
        p.next = newNode;
        return start;
    }

    // Method to delete an item node based on item ID
    public static ItemNode deleteItem(ItemNode start, String inputId) {
        if (start == null) {
            System.out.println("Item Not Exist");
            return null;
        }
        ItemNode p = start;
        ItemNode q = start.next;
        if (p.itemId.equals(inputId)) {
            System.out.println("Item Found and deleted");
            start = q;
            return start;
        }
        if (q.next == null && q.itemId.equals(inputId)) {
            System.out.println("Item Found and Deleted");
            p.next = null;
            return start;
        }

        while (q.next != null) {
            if (q.itemId.equals(inputId)) {
                System.out.println("Item Found and deleted");
                p.next = q.next;
                return start;
            }

            p = p.next;
            q = q.next;
        }
        if (q.next == null && q.itemId.equals(inputId)) {
            System.out.println("Item Found and Deleted");
            p.next = null;
            return start;
        }

        System.out.println("Item Not Exist");
        return start;
    }

    // Method to search for an item node based on item ID
    public static void searchItem1(ItemNode start, String inputId) {
        ItemNode p = start;
        while (p != null) {
            if (p.itemId.equals(inputId)) {
                System.out.println("Item Found");
                return;
            }
            p = p.next;
        }
        System.out.println("Item Not Exist");
    }

    // Method to search for an item node based on item name
    public static void searchItem2(ItemNode start, String inputName) {
        ItemNode p = start;
        while (p != null) {
            if (p.itemName.equals(inputName)) {
                System.out.println("Item Found");
                return;
            }
            p = p.next;
        }
        System.out.println("Item Not Exist");
    }

    // Method to calculate the total price of all items
    public static void calculateTotal(ItemNode start) {
        ItemNode count = start;
        while (count != null) {
            total += (count.price * count.quantity);
            count = count.next;
        }
        System.out.println("Total Price: " + total);
    }

    // Method to sort the items in ascending order by price
    public static ItemNode sortAssending(ItemNode start) {
        if (start == null || start.next == null) {
            return start;
        }
        boolean isSwapped;
        do {
            isSwapped = false;
            ItemNode curr = start;
            ItemNode prev = null;
            while (curr != null && curr.next != null) {
                if (curr.price > curr.next.price) {
                    ItemNode temp = curr.next;
                    curr.next = temp.next;
                    temp.next = curr;
                    if (prev == null) {
                        start = temp;
                    } else {
                        prev.next = temp;
                    }
                    isSwapped = true;
                } else {
                    curr = curr.next;
                }
                prev = (prev == null) ? start : prev.next;
            }
        } while (isSwapped);
        return start;
    }

    // Method to sort the items in descending order by price
    public static ItemNode sortDecending(ItemNode start) {
        if (start == null || start.next == null) {
            return start;
        }
        boolean isSwapped;
        do {
            isSwapped = false;
            ItemNode curr = start;
            ItemNode prev = null;
            while (curr != null && curr.next != null) {
                if (curr.price < curr.next.price) {
                    ItemNode temp = curr.next;
                    curr.next = temp.next;
                    temp.next = curr;
                    if (prev == null) {
                        start = temp;
                    } else {
                        prev.next = temp;
                    }
                    isSwapped = true;
                } else {
                    curr = curr.next;
                }
                prev = (prev == null) ? start : prev.next;
            }
        } while (isSwapped);
        return start;
    }

    // Method to display the details of all item nodes
    public static void display(ItemNode start) {
        ItemNode item = start;
        while (item != null) {
            System.out.println("Name of the Item: " + item.itemName);
            System.out.println("Item Id of the Item: " + item.itemId);
            System.out.println("Quantity of the Item: " + item.quantity);
            System.out.println("Price of the Item: " + item.price);
            System.out.println(" ");
            item = item.next;
        }
    }
}
