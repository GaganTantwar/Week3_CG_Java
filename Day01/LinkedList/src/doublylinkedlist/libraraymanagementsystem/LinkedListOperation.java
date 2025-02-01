package doublylinkedlist.libraraymanagementsystem;



public class LinkedListOperation {
    static Book head;
    static Book foot;
    public LinkedListOperation(){
        this.head=null;
        this.foot=null;
    }
    public static void insert(String bookTitle,String author,String genre,int bookId ,boolean availability){
        Book newBook =new Book(bookTitle,author,genre,bookId,availability);
        if(head==null && foot==null){
            head=newBook;
            foot=newBook;
            return;
        }

        foot.next=newBook;
        newBook.prev=foot;
        foot=newBook;

    }
    public static void addFront(String bookTitle,String author,String genre,int bookId, boolean availability){
        Book newBook =new Book(bookTitle,author,genre,bookId,availability);
        if(head==null && foot==null){
            head=newBook;
            foot=newBook;
            return ;
        }
        newBook.next=head;
        head.prev=newBook;
        head=newBook;

    }
    public static void addBack(String bookTitle,String author,String genre,int bookId,boolean availability){
        Book newBook =new Book(bookTitle,author,genre,bookId,availability);
        if(head==null && foot==null){
            head=newBook;
            foot=newBook;
            return;
        }
        foot.next=newBook;
        newBook.prev=foot;
        foot=newBook;
    }
    public static void addBetween(String bookTitle,String author,String genre,int bookId,int position,boolean availability){
        Book newBook =new Book(bookTitle,author,genre,bookId,availability);
        if(head==null && foot==null){
            head=newBook;
            foot=newBook;
            return;
        }
        if(position==0){
            return ;
        }
        if(position==1){
            newBook.next=head;
            head.prev=newBook;
            head=newBook;
            return;
        }
        Book p=head;
        Book q=head.next;
        int i=0;
        while(i!=position-1){
            if(q.next==null){
                q.next=newBook;
                newBook.prev=q;
                foot=newBook;
            }
            p=p.next;
            q=q.next;
            i+=1;
        }
        newBook.prev=q.prev;
        newBook.next=p.next;
        p.next=newBook;
        q.prev=newBook;
    }
    public static void display(){
        Book p=head;
        Book q=foot;
        System.out.println("In Forward Direction");
        while(p!=null){
            System.out.println("Title of the Book: "+p.bookTitle);
            System.out.println("Author of the Book: "+p.author);
            System.out.println("Id of the Book:  "+p.bookId);
            System.out.println("Genre of the Book "+p.genre);
            System.out.println("Availability Of the Book: "+p.availability);
            System.out.println(" ");
            p=p.next;
        }
        System.out.println("In Backward Direction");
        while(q!=null){
            System.out.println("Title of the Movie: "+q.bookTitle);
            System.out.println("Director of the Movie: "+q.author);
            System.out.println("Id of the Book:  "+q.bookId);
            System.out.println("Genre of the Book "+q.genre);
            System.out.println("Availability Of the Book: "+q.availability);
            System.out.println(" ");
            q=q.prev;
        }
    }
    public static void deleteBook(int inputId){
        Book p=head;
        Book q=head.next;
        if(p.bookId==inputId){
            q.prev=null;
            head=q;
            return ;
        }
        while (q.next != null) {
            if (q.bookId==inputId) {
                System.out.println("Book Found and deleted");
                p.next = q.next;
                q.next.prev=q.prev;
                return ;
            }
            p = p.next;
            q = q.next;
        }
        if(q.next==null && q.bookId==inputId){
            p.next=null;
        }
        else{
            System.out.println("Book Not  Exist");
        }
    }
    public static void searchBook1(String bookName) {
        Book p = head;
        while (p != null) {
            if (p.bookTitle.equals(bookName)) {
                System.out.println("Book Found");
                return;
            }
            p = p.next;
        }
        System.out.println("Book Not Exist");
    }
    public static void searchBook2(String bookAuthore) {
        Book p = head;
        while (p != null) {
            if (p.author.equals(bookAuthore)) {
                System.out.println("Book Found");
                return;
            }
            p = p.next;
        }
        System.out.println("Book Not Exist");
    }
    public static void updateStatus(boolean status,String bookName) {
        Book p =head;
        while (p != null) {
            if (p.bookTitle.equals(bookName)) {
                System.out.println("Status Updated");
                p.availability = status;
                return;
            }
            p = p.next;
        }
        System.out.println("Book  Not Exist");
    }
    public static void countTotal(){
        int count=0;
        Book p=head;
        while(p!=null){
            count+=1;
            p=p.next;
        }
        System.out.println("Total Number of Book: "+count);
    }
}

