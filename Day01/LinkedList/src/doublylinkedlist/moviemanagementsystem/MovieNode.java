package doublylinkedlist.moviemanagementsystem;

public class MovieNode {
    private String movieTitle;
    private String director;
    private String dateOfRelease;
    private float rating;
    MovieNode next;
    MovieNode prev;
    // constructor for initializing movie details
    public MovieNode(String movieTitle,String director,String dateOfRelease,float rating){
        this.movieTitle=movieTitle;
        this.director=director;
        this.dateOfRelease=dateOfRelease;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
    // display method for movies details
    public static void display(MovieNode start,MovieNode end){
        MovieNode p=start;
        MovieNode q=end;
        System.out.println("In Forward Direction");
        while(p!=null){
            System.out.println("Title of the Movie: "+p.movieTitle);
            System.out.println("Director of the Movie: "+p.director);
            System.out.println("Date of  Release of the Movie: "+p.dateOfRelease);
            System.out.println("Rating of the Movie: "+p.rating);
            System.out.println(" ");
            p=p.next;
        }
        System.out.println("In Backward Direction");
        while(q!=null){
            System.out.println("Title of the Movie: "+q.movieTitle);
            System.out.println("Director of the Movie: "+q.director);
            System.out.println("Date of  Release of the Movie: "+q.dateOfRelease);
            System.out.println("Rating of the Movie: "+q.rating);
            System.out.println(" ");
            q=q.prev;
        }
    }
    // addFront method for adding node to begining

    public static MovieNode addFront(MovieNode start,MovieNode newNode){
        if(start==null){
            return null;
        }
        newNode.next=start;
        start.prev=newNode;
        start=newNode;
        return start;

    }
    // addBack method for adding node to end
    public static MovieNode addBack(MovieNode last,MovieNode newNode){
        last.next=newNode;
        newNode.prev=last;
        last=newNode;
        return last;
    }
    // addBetween method for adding element between
    public static MovieNode addBetween(MovieNode start,MovieNode newNode,int position){
        MovieNode p=start;
        MovieNode q=start.next;

        int i=0;
        while(i!=position-1) {
            p = p.next;
            q = q.next;
            i += 1;
        }
        newNode.prev=q.prev;
        newNode.next=p.next;
        p.next=newNode;
        q.prev=newNode;
        return  start;
    }
    //  deleteMovie method for deleting movie by movie title
    public static MovieNode deleteMovie(MovieNode start,String movieName){
        MovieNode p=start;
        MovieNode q=start.next;
        if(p.movieTitle.equals(movieName)){
            q.prev=null;
            start=q;
            return start;
        }
        while (q.next != null) {
            if (q.movieTitle.equals(movieName)) {
                System.out.println("Movie Found and deleted");
                p.next = q.next;
                q.next.prev=q.prev;
                return start;
            }
            p = p.next;
            q = q.next;
        }
        if(q.next==null && q.movieTitle.equals(movieName)){
            p.next=null;
        }
        else{
            System.out.println("Movie Not  Exist");
        }
        return start;
    }
    //searchMovie method for searching movie by title
    public static void searchMovie(MovieNode start, String movieName) {
        MovieNode p = start;
        while (p != null) {
            if (p.movieTitle.equals(movieName)) {
                System.out.println("Movie Found");
                return;
            }
            p = p.next;
        }
        System.out.println("Movie Not Exist");
    }
    //updateRating method for updating rating of the movie by title
    public static void updateRating(MovieNode start, String movieName, float r) {
        MovieNode p = start;
        while (p != null) {
            if (p.movieTitle.equals(movieName)) {
                System.out.println("Rating Updated");
                p.rating = r;
                return;
            }
            p = p.next;
        }
        System.out.println("Movie  Not Exist");
    }

}
