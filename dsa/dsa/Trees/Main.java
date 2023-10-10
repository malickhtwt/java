package dsa.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Trees tree = new Trees(5);
        tree.insert(6);
        tree.insert(3);
        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
//        tree.insert(2);
//        tree.insert(3);
        System.out.println(tree.delete(6));
        System.out.println(tree.root.value);
        System.out.println(tree.root.right.value);
        System.out.println(tree.root.left.value);
//        System.out.println(tree.root.left.right.value);
        System.out.println(tree.root.right.right.value);
//        System.out.println(tree.root.right.left.value);
//        System.out.println(tree.contains(7));
    }
}
