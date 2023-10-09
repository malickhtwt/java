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

//    public void insert(int value) {
//        Node newNode = new Node(value);
//        Node temp = this.root;
//        if (value < temp.value) {
//            while (temp.left != null) {
//                temp = temp.left;
//            }
//            if (value < temp.value) {
//                temp.left = newNode;
//            } else {
//                temp.right = newNode;
//            }
//        } else {
//            while (temp.right != null) {
//                temp = temp.right;
//            }
//            if (value > temp.value) {
//                temp.right = newNode;
//            } else {
//                temp.left = newNode;
//            }
//        }
//    }
    private void insert(Node currentNode, int value) {
//        Node newNode = new Node(value);
//        if (currentNode == null) {
//            currentNode.value = value;
//        }
        if (value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = new Node(value);;
            } else {
                insert(currentNode.left, value);
            }
        }
        if (value > currentNode.value) {
            if (currentNode.right == null) {
                currentNode.right = new Node(value);;
            } else {
                insert(currentNode.right, value);
            }
        }
    }

    public void insert(int value) {
        insert(root, value);
    }

//    public boolean contains(int value) {
//        Node temp = this.root;
//        if (value == temp.value) {
//            return true;
//        }
//        while(temp != null) {
//            if (value < temp.value) {
//                temp = temp.left;
//            } else if (value > temp.value) {
//                temp = temp.right;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }

    private boolean contains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (value == currentNode.value) {
            return true;
        }
        if (value < currentNode.value) {
            return contains(currentNode.left, value);
        } else {
            return contains(currentNode.right, value);
        }
    }

    public boolean contains(int value) {
        return contains(root, value);
    }



}
