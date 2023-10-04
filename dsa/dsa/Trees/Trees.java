package dsa.Trees;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class Trees {
    int value;
    Node root;

    public Trees(int value) {
        Node newNode = new Node(value);
        this.root = newNode;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        Node temp = this.root;
        if (value < temp.value) {
            while (temp.left != null) {
                temp = temp.left;
            }
            if (value < temp.value) {
                temp.left = newNode;
            } else {
                temp.right = newNode;
            }
        } else {
            while (temp.right != null) {
                temp = temp.right;
            }
            if (value > temp.value) {
                temp.right = newNode;
            } else {
                temp.left = newNode;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = this.root;
        if (value == temp.value) {
            return true;
        }
        while(temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }



}
