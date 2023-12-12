package Pertemuan16.Praktikum4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeap implements Heap {
    final PriorityQueue<Integer> pq;

    public MaxHeap() {
    this.pq = new PriorityQueue<>(Comparator.reverseOrder());
    }

    @Override
    public int getSize() {
        return pq.size();
    }

    @Override
    public boolean isEmpty() {
        return pq.isEmpty();
    }

    @Override
    public void insert(int element) {
        pq.add(element);
    }
    @Override
    public int extractRoot() {
        return pq.remove();
    }
}