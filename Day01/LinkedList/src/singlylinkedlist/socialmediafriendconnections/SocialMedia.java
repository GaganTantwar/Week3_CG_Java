package singlylinkedlist.socialmediafriendconnections;

public class SocialMedia {
    private UserNode head;

    SocialMedia() {
        this.head = null;
    }

    public void addUser(int userID, String name, int age) {
        UserNode newUser = new UserNode(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    public void addFriendConnection(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 != null && user2 != null && user1 != user2 && !isFriend(user1, userID2)) {
            addFriend(user1, userID2);
            addFriend(user2, userID1);
        }
    }

    private void addFriend(UserNode user, int friendID) {
        FriendNode newFriend = new FriendNode(friendID);
        if (user.friendsHead == null) {
            user.friendsHead = newFriend;
        } else {
            FriendNode current = user.friendsHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newFriend;
        }
    }

    public void removeFriendConnection(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 != null && user2 != null && isFriend(user1, userID2)) {
            removeFriend(user1, userID2);
            removeFriend(user2, userID1);
        }
    }

    private void removeFriend(UserNode user, int friendID) {
        FriendNode current = user.friendsHead;
        FriendNode prev = null;
        while (current != null) {
            if (current.friendID == friendID) {
                if (prev == null) {
                    user.friendsHead = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    private boolean isFriend(UserNode user, int friendID) {
        FriendNode current = user.friendsHead;
        while (current != null) {
            if (current.friendID == friendID) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void displayFriends(int userID) {
        UserNode user = findUserByID(userID);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            FriendNode current = user.friendsHead;
            while (current != null) {
                UserNode friend = findUserByID(current.friendID);
                if (friend != null) {
                    System.out.println("User ID: " + friend.userID + ", Name: " + friend.name);
                }
                current = current.next;
            }
        } else {
            System.out.println("User not found.");
        }
    }

    public void searchUserByNameOrID(String name, Integer userID) {
        UserNode current = head;
        while (current != null) {
            if ((name != null && current.name.equals(name)) || (userID != null && current.userID == userID)) {
                System.out.println("User ID: " + current.userID + ", Name: " + current.name + ", Age: " + current.age);
                return;
            }
            current = current.next;
        }
        System.out.println("User not found.");
    }

    public void countFriends(int userID) {
        UserNode user = findUserByID(userID);
        if (user != null) {
            int count = 0;
            FriendNode current = user.friendsHead;
            while (current != null) {
                count++;
                current = current.next;
            }
            System.out.println("User ID: " + user.userID + ", Name: " + user.name + " has " + count + " friends.");
        } else {
            System.out.println("User not found.");
        }
    }

    private UserNode findUserByID(int userID) {
        UserNode current = head;
        while (current != null) {
            if (current.userID == userID) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
