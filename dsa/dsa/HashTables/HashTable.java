package dsa.HashTables;

import java.util.ArrayList;
import java.util.List;

class Node {
    String key;
    int value;
    Node next;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class HashTable {
    Node[] dataMap;

    public HashTable(int size) {
        this.dataMap = new Node[size];
    }

    public void printHashTable() {
        for (int i = 0; i < this.dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = this.dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + " = " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public Node set(String key, int value) {
        int hash = this.hash(key);
        Node newNode = new Node(key, value);
        if (this.dataMap[hash] == null) {
            this.dataMap[hash] = newNode;
        } else {
            Node temp = this.dataMap[hash];
            while(temp.next !=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return newNode;
    }

    public boolean get(String key) {
        int hash = this.hash(key);
        if (this.dataMap[hash] == null){
            return false;
        } else {
            Node temp = this.dataMap[hash];
            while(temp != null) { // Only the while loop can be used to accomplish the get method
                if (temp.key == key) { // Everything else can be removed.
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public List<String> getKeys() {
        List<String> all_keys = new ArrayList<>();
        for (int i = 0; i < this.dataMap.length; i++) {
            if (this.dataMap[i] != null){ //This line can be eliminated
                Node temp = this.dataMap[i];
                while (temp != null) {
                    all_keys.add(temp.key);
                    temp = temp.next;
                }
            }
        }
        return all_keys;
    }
}
