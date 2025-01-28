package singlylinkedlist.socialmediafriendconnections;

public class UserNode {
    int userID;
    String name;
    int age;
    FriendNode friendsHead;
    UserNode next;

    UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }
}
