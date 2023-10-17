package Pertemuan8.kode;

public class Node{
    /*int data;*/

    // Tipe data saya ubah menjadi String
    String data;
    Node next;

    /*public Node(int nilai, Node berikutnya){*/
    public Node(String nilai, Node berikutnya){ // otomatis parameternya juga saya ubah
        this.data = nilai;
        this.next = berikutnya;
    }
}