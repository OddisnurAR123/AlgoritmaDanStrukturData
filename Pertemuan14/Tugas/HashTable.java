package Pertemuan14.Tugas;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        Mahasiswa value;
        Node next;
        
        Node(String key, Mahasiswa value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        this.dataMap = new Node[this.size];
    }  

    public int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.dataMap.length;
        }
        return hash;
    }

    public void set(Mahasiswa mahasiswa) {
        String key = mahasiswa.getNim();
        int hash = this.hash(key);
        Node newNode = new Node(key, mahasiswa);
        if (this.dataMap[hash] == null) {
            this.dataMap[hash] = newNode;
        } else {
            Node current = this.dataMap[hash];
            if(current.key.equals(key)) {
                current.value = mahasiswa;
                return;
            }
            while (current.next != null) {
                current = current.next;
                if(current.key.equals(key)) {
                    current.value = mahasiswa;
                    return;
                }
            }
            current.next = newNode;
        }
    }

    public Mahasiswa get(String key) {
        int hash = this.hash(key);
        Node current = this.dataMap[hash];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public boolean remove(String key) {
        int hash = this.hash(key);
        Node current = this.dataMap[hash];
        Node previous = null;
        
        while (current != null && !current.key.equals(key)) {
            previous = current;
            current = current.next;
        }    
        if (current != null) {
            if (previous == null) {
                this.dataMap[hash] = current.next;
            } else {
                previous.next = current.next;
            }
            return true;
        }
        return false;
    }

    public ArrayList<String> getAllNIM() {
        ArrayList<String> nim = new ArrayList<>();
        for (int i = 0; i < this.dataMap.length; i++) {
            Node current = this.dataMap[i];
            while (current != null) {
                nim.add(current.key);
                current = current.next;
            }
        }
        return nim;
    }

    public void printTable() {
        for (int i = 0; i < this.dataMap.length; i++) {
            System.out.println(i + ":");
            Node current = this.dataMap[i];
            while (current != null) {
                System.out.println("Key: " + current.key + ", Value: ");
                System.out.println("  NIM: " + current.value.nim);
                System.out.println("  Nama Lengkap: " + current.value.namaLengkap);
                System.out.println("  Jurusan: " + current.value.jurusan);
                System.out.println("  Program Studi: " + current.value.programStudi);
                current = current.next;
            }
        }
    }    
}