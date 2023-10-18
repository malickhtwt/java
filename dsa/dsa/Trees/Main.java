package dsa.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Trees tree = new Trees(47);
        tree.insert(21);
        tree.insert(76);
        tree.insert(18);
        tree.insert(27);
        tree.insert(52);
        tree.insert(82);
        tree.insert(25);
        tree.insert(28);
        tree.insert(24);

        tree.delete(18);

        System.out.println(tree.root.value);
//        System.out.println(tree.root.left.value);
//        System.out.println(tree.root.left.right.value);
//        System.out.println(tree.root.left.right.left.value);
//        System.out.println(tree.root.left.right.left.left.value);
//        System.out.println(tree.contains(7));
    }
}
