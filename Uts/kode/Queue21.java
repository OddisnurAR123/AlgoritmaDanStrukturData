package Uts.kode;

public class Queue21 {
    final Pembeli21[] antrian;
    int front;
    int rear;
    int size;
    int capacity;

    public Queue21(int capacity) {
        this.capacity = capacity;
        this.antrian = new Pembeli21[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Pembeli21 pembeli) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            antrian[rear] = pembeli;
            size++;
        } else {
            System.out.println("Antrian penuh.");
        }
    }

    public Pembeli21 dequeue() {
        if (!isEmpty()) {
            Pembeli21 dequeuedPembeli = antrian[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedPembeli;
        } else {
            System.out.println("Antrian kosong.");
            return null;
        }
    }
}