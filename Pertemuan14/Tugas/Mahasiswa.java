package Pertemuan14.Tugas;

public class Mahasiswa {
    String nim;
    String namaLengkap;
    String jurusan;
    String programStudi;

    public Mahasiswa(String nim, String namaLengkap, String jurusan, String programStudi) {
        this.nim = nim;
        this.namaLengkap = namaLengkap;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }    
}