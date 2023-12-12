package Pertemuan16.Tugas;

public class Mahasiswa {
    String nim; 
    String nama; 
    String notelp;
    
    Mahasiswa(){    
    }

    Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString(){
        return String.format("%-13s %-15s %-10s", nim, nama, notelp);
    }
}