package hashmap.customehashmap;
import java.util.*;

public class CustomeHashMap<K, V> {
    private static final int SIZE = 16; // Default bucket size
    private LinkedList<Node<K, V>>[] table;

    // Node class to store key-value pairs
    static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the hash table
    @SuppressWarnings("unchecked")
    public CustomeHashMap() {
        table = (LinkedList<Node<K, V>>[]) new LinkedList[SIZE]; // Type casting fix
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to calculate index
    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // Update existing key
                return;
            }
        }
        bucket.add(new Node<>(key, value)); // Insert new key-value pair
    }

    // Retrieve value by key
    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value; // Return value if key found
            }
        }
        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        Node<K, V> toRemove = null;
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }

        if (toRemove != null) {
            bucket.remove(toRemove);
        }
    }

    // Check if key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Main method for testing
    public static void main(String[] args) {
        CustomeHashMap<String, Integer> map = new CustomeHashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println(map.get("Alice")); // Output: 25
        System.out.println(map.get("Bob"));   // Output: 30
        map.remove("Alice");
        System.out.println(map.get("Alice")); // Output: null
    }
}
