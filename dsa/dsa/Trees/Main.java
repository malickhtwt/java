package dsa.Trees;

public class Main {
    public static void main(String[] args) {
        Trees tree = new Trees(1);
        tree.insert(5);
        tree.insert(0);
        tree.insert(3);
//        System.out.println(tree.root.left.value);
//        System.out.println(tree.root.right.value);
//        System.out.println(tree.root.right.left.value);
        System.out.println(tree.contains(3));
    }
}
