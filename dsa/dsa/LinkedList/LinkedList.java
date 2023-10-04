package dsa.LinkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("length is: " + this.length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;

        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.append(value);
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.head;
        this.head = temp.next;
        temp = null;
        this.length--;
        return temp;
    }

    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.head;
        Node prev = this.head;
        while(temp.next != null) {
            prev = prev;
            temp = temp.next;
            if (temp.next == null) {
                this.tail = prev;
                prev.next = null;
            }
        }
        this.length--;
        return temp;
    }

    public Node remove(int index) {
        if (index >= this.length || index < 0) {
            return null;
        } else if (index == 0) {
            return this.removeFirst();
        } else {
            Node prevInd = this.get(index - 1);
            Node currInd = this.get(index);
            prevInd.next = currInd.next;
            currInd = null;
            this.length--;
            return currInd;
        }
    }

    public Node get(int index) {
        if (index >= this.length || index < 0) {
            return null;
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.length - 1 ; i++) {
                if (index == i) {
                    return temp;
                }
                temp = temp.next;
            }
            return temp;
        }
    }

    public Node set(int index, int value) {
        if (index >= this.length || index < 0 ) {
            return null;
        }
        Node temp = this.get(index);
        temp.value = value;
        return temp;
    }

    public Node insert(int index, int value) {
        if (index >= this.length || index < 0 ) {
            return null;
        }
        Node temp = this.get(index);
        temp.value = value;
        return temp;
    }

    public void reverse() {
        Node before = null;
        Node after = this.head;
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        while(temp != null) {
            after = temp;
            temp = temp.next;
            after.next = before;
            before = after;
        }
    }
}

