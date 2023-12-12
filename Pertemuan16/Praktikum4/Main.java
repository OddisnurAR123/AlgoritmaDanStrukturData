package Pertemuan16.Praktikum4;

public class Main {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        MaxHeap maxHeap = new MaxHeap();
        minHeap.insert(10);
        minHeap.insert(5);
        minHeap.insert(20);
        System.out.println("Ukuran heap-min: " + minHeap.getSize());
        System.out.println("Elemen minimum: " + minHeap.extractRoot());
        System.out.println("Elemen tersisa: " + minHeap.pq);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(20);
        System.out.println("Ukuran heap-max: " + maxHeap.getSize());
        System.out.println("Elemen max: " + maxHeap.extractRoot());
        System.out.println("Elemen tersisa: " + maxHeap.pq);
    }
}