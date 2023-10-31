package Pertemuan10.Tugas.Tugas1;

public class Node {
    String nama;
    int tiket;
    Node next, prev;

    public Node(Node prev, String nama, int tiket, Node next) {
        this.prev = prev;
        this.nama = nama;
        this.tiket = tiket;
        this.next = next;
    }
}