package Pertemuan8.kode;

public class LinkedListNasabah {
    NasabahBank head;
    int size; // Untuk melacak jumlah nasabah dalam antrian
    int maxSize; // Kapasitas maksimum dari antrian

    // Sebelum Mengimplementasikan QUEUE, hanya mengimplementasikan program Nasabah Bank menggunakan LinkedList dengan data berupa nama, alamat dan nomor rekening nasabah
    /*public void tambahNasabah(String nama, String alamat, String nomorRekening) {
        NasabahBank nasabahBaru = new NasabahBank(nama, alamat, nomorRekening);
        nasabahBaru.next = head;
        head = nasabahBaru;
    }*/

    // Kemudian Mengimplementasikan Queue pada antrian Nasabah
    public LinkedListNasabah(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String nama, String alamat, String nomorRekening) {
        if (!isFull()) {
            NasabahBank nasabahBaru = new NasabahBank(nama, alamat, nomorRekening);
            nasabahBaru.next = null;

            if (isEmpty()) {
                head = nasabahBaru;
            } else {
                NasabahBank current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = nasabahBaru;
            }

            size++;
            System.out.println("Nasabah " + nama + " telah ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh. Tidak dapat menambahkan lebih banyak nasabah.");
        }
    }

    public NasabahBank dequeue() {
        if (!isEmpty()) {
            NasabahBank nasabah = head;
            head = head.next;
            size--;
            System.out.println("Nasabah " + nasabah.nama + " telah dikeluarkan dari antrian.");
            return nasabah;
        } else {
            System.out.println("Antrian kosong. Tidak ada nasabah yang dapat dikeluarkan.");
            return null;
        }
    }

    public void displayList() {
        NasabahBank current = head;
        while (current != null) {
            current.display();
            System.out.println("===================================================");
            current = current.next;
        }
    }
}