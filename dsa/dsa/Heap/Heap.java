package dsa.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heap {
     List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public Integer parent(int index) {
        return (index - 1) / 2;
    }

    public Integer leftChild(int index) {
        return (index * 2) + 1;
    }

    public Integer rightChild(int index) {
        return (index * 2) + 2;
    }

    public void swapItems(int index1, int index2) {
        Integer temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(Integer newElement) {
        heap.add(newElement);
        int newElemtInd =  heap.indexOf(newElement);
        while(newElemtInd >0) {
            if(newElement < heap.get(parent(newElemtInd))) {
                break;
            }
            swapItems(newElemtInd, parent(newElemtInd));
            newElemtInd = parent(newElemtInd);

        }
    }

    public void remove() {
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }
}
