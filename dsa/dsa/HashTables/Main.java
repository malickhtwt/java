package dsa.HashTables;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashTable myHashtable = new HashTable(7);
        Node paint = myHashtable.set("paint", 5);
        Node paint2 = myHashtable.set("paint", 7);
        Node nails = myHashtable.set("nails", 12);
        Node screws = myHashtable.set("screws", 120);
        myHashtable.printHashTable();
        System.out.println(myHashtable.get("paint"));
        System.out.println(myHashtable.getKeys());
    }
}
