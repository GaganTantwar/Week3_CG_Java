package doublylinkedlist.libraraymanagementsystem;

public class Book {
    String  bookTitle;
    String author;
    String genre;
    int  bookId;
    boolean availability;
    Book next;
    Book prev;
    public Book(String bookTitle,String author,String genre,int bookId,boolean availability){
        this.bookTitle=bookTitle;
        this.author=author;
        this.genre=genre;
        this.bookId=bookId;
        this.availability=availability;
        this.next=null;
        this.prev=null;
    }

}
