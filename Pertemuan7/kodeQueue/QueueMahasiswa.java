package Pertemuan7.kodeQueue;

public class QueueMahasiswa{
    int max;
    int front;
    int rear;
    int size;
    Mahasiswa[] antrian;

    public QueueMahasiswa(int n) {
        max = n;
        create();
    }

    public void create() {
        antrian = new Mahasiswa[max];
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

    public void enqueue(Mahasiswa data) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
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
            antrian[rear] = data;
            size++;
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0.0);
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("NIM: " + antrian[i].nim);
                System.out.println("Nama: " + antrian[i].nama);
                System.out.println("Absen: " + antrian[i].absen);
                System.out.println("IPK: " + antrian[i].ipk);
                System.out.println("-------------------------");
                i = (i + 1) % max;
            }
            System.out.println("NIM: " + antrian[i].nim);
            System.out.println("Nama: " + antrian[i].nama);
            System.out.println("Absen: " + antrian[i].absen);
            System.out.println("IPK: " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    public void peek() {
        if (!IsEmpty()) {
            Mahasiswa mahasiswa = antrian[front];
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("Absen: " + mahasiswa.absen);
            System.out.println("IPK: " + mahasiswa.ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            Mahasiswa mahasiswa = antrian[rear];
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("Absen: " + mahasiswa.absen);
            System.out.println("IPK: " + mahasiswa.ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nim) {
        for (int i = 0; i < size; i++) {
            if (antrian[i].nim.equals(nim)) {
                System.out.println("Mahasiswa dengan NIM " + nim + " berada di posisi antrian ke-" + i);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
    }

    public void printMahasiswa(int posisi) {
        if (!IsEmpty()) {
            if (posisi < 0 || posisi >= size) {
                System.out.println("Posisi tidak valid.");
            } else {
                int index = front;
                for (int i = 0; i < posisi; i++) {
                    index = (index + 1) % max;
                }
                Mahasiswa mahasiswa = antrian[index];
                System.out.println("Data pada posisi " + posisi);
                System.out.println("NIM: " + mahasiswa.nim);
                System.out.println("Nama: " + mahasiswa.nama);
                System.out.println("Absen: " + mahasiswa.absen);
                System.out.println("IPK: " + mahasiswa.ipk);
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}