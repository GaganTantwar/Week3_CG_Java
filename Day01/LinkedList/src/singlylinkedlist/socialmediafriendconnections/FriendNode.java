package singlylinkedlist.socialmediafriendconnections;

public class FriendNode {
    int friendID;
    FriendNode next;

    FriendNode(int friendID) {
        this.friendID = friendID;
        this.next = null;
    }
}
