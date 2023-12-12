package Pertemuan16.Praktikum4;

import java.util.PriorityQueue;
public class MinHeap implements Heap {
    final PriorityQueue<Integer> pq;

    public MinHeap() {
        this.pq = new PriorityQueue<>();
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