package Pertemuan8.kode;

public class NasabahBank {
    String nama;
    String alamat;
    String nomorRekening;
    NasabahBank next;

    public NasabahBank(String nama, String alamat, String nomorRekening) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorRekening = nomorRekening;
        this.next = null;
    }

    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Rekening: " + nomorRekening);
    }
}