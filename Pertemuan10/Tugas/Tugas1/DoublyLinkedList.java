package Pertemuan10.Tugas.Tugas1;

public class DoublyLinkedList {
    Node head;
    int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addFirst(String nama, int tiket) {
        if (isEmpty()) {
            head = new Node(null, nama, tiket, null);
        } else {
            Node newNode = new Node(null, nama, tiket, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    

    public void addLast(String nama, int tiket) {
        if (isEmpty()) {
            head = new Node(null, nama, tiket, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nama, tiket, null);
            current.next = newNode;
        }
        size++;
    }

    
    public void print() {
        if (!isEmpty()) {
            Node current = head;
            System.out.println("------------------------");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("------------------------");
    
            System.out.println("| No.  |     Nama        |");
    
            while (current != null) {
                System.out.printf("| %-4d | %-15s |\n", current.tiket, current.nama);
                current = current.next;
            }
    
            System.out.println("------------------------");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Antrian Vaksin Kosong");
        }
    }    
    
    
    public String removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else if (size == 1) {
            String removedNama = head.nama;
            head = null;
            size--;
            System.out.println(removedNama + " telah selesai divaksinasi.");
            return removedNama;
        } else {
            String removedNama = head.nama;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(removedNama + " telah selesai divaksinasi.");
            return removedNama;
        }
    }
    

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }
        return head.nama;
    }

    public int getFirstTiket() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }
        return head.tiket;
    }
}   