package singlylinkedlist.socialmediafriendconnections;

public class SocialMediaFriendConnection {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 35);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);

        sm.displayFriends(1);  // Output: Friends of Alice: Bob, Charlie
        sm.displayFriends(2);  // Output: Friends of Bob: Alice

        sm.searchUserByNameOrID("Charlie", null);  // Output: User ID: 3, Name: Charlie, Age: 35
        sm.countFriends(1);  // Output: User ID: 1, Name: Alice has 2 friends

        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);  // Output: Friends of Alice: Charlie
        sm.countFriends(1);  // Output: User ID: 1, Name: Alice has 1 friend
    }
}
