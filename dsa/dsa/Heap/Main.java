package dsa.Heap;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Heap heap = new Heap();

//        heap.insert(44);
//        heap.insert(30);
//        heap.insert(10);
//        heap.insert(50);
//        heap.insert(5);
//        heap.insert(12);
//        heap.insert(3);
        heap.insert(80);
        heap.insert(75);
        heap.insert(65);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(72);

        System.out.println(heap);

        heap.remove();

        System.out.println(heap);
    }
}
