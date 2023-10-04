package dsa.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
//        myList.prepend(0);
//        myList.removeFirst();
//        myList.removeLast();
        myList.printList();
//        System.out.println(myList.get(2));
//        myList.set(2,4);
//        myList.printList();
//        myList.remove(1);
//        myList.printList();
//        myList.insert(0, 9);
//        myList.printList();
        myList.reverse();
        myList.printList();
    }
}
