package doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String args[]){
        // Movies variable
        MovieNode salaar=new MovieNode("Salaar Part 1","Prashant Neel","22-12-2023",7.5F);
        MovieNode animal=new MovieNode("Animal Part 1","Sandeep Vanga Reddy","03-12-2023",8.5F);
        MovieNode pushpa2=new MovieNode("Pushpa The Rule","Sukumar","03-12-2024",7.0F);
        MovieNode rrr=new MovieNode("Rise Roar Revolt","SS Rajamouli","26-03-2022",9.0F);
        rrr.next=animal;
        animal.prev=rrr;
        animal.next=salaar;
        salaar.prev=animal;
        salaar.next=pushpa2;
        pushpa2.prev=salaar;
        MovieNode start=rrr;
        MovieNode end=pushpa2;

        MovieNode bahubali2=new MovieNode("Bahubali Part 2","SS Rajamouli","05-05-2017",9.5F);
        MovieNode kgf=new MovieNode("KGF Chapter 2","Prashant Neel","22-04-2022",8.5F);
        MovieNode babyjhon=new MovieNode("Baby Jhon","Atlee Kumar","22-12-2024",6.5F);
        MovieNode start1=MovieNode.addFront(start,bahubali2);


        MovieNode start2=MovieNode.addBetween(start1,kgf,2);

        MovieNode end2=MovieNode.addBack(end,babyjhon);
        System.out.println("After adding ");
        MovieNode.display(start2,end2);

        MovieNode start4=MovieNode.deleteMovie(start2,"Bahubali Part 2");
        System.out.println("After Deletion");
        MovieNode.display(start4,end2);
        MovieNode.searchMovie(start4,"Salaar Part 1");
        MovieNode.updateRating(start4,"Salaar Part 1",8.5F);
        MovieNode.display(start4,end2);




    }
}
