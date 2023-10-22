package Pertemuan7.kodeQueue;

public class Tugas1 {
    int max;
    int size;
    int front;
    int rear;
    int[] Q;

    public Tugas1 (int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + Q[front]);
        }
        else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }
        else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
                System.out.println("");
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }
        else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
        
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (!IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else{
                    front++;
                }
            }
        }
        return data;
    }

    // Menambahkan 2 method
    public void peekPosition(int data) {
        if (!IsEmpty()) {
            int position = -1;
            for (int i = front; i != rear; i = (i + 1) % max) {
                position++;
                if (Q[i] == data) {
                    System.out.println("Data " + data + " berada pada posisi " + position);
                    return;
                }
            }
            if (Q[rear] == data) {
                position++;
                System.out.println("Data " + data + " berada pada posisi " + position);
            } else {
                System.out.println("Data " + data + " tidak ditemukan dalam antrian.");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekAt(int position) {
        if (!IsEmpty()) {
            if (position < 0 || position >= size) {
                System.out.println("Posisi tidak valid.");
            } else {
                int index = front;
                for (int i = 0; i <= position; i++) {
                    if (i != 0) {
                        index = (index + 1) % max;
                    }
                }
                System.out.println("Data pada posisi " + position + ": " + Q[index]);
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
}