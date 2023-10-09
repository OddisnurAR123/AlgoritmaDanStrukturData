public class Paskibraka {
    String nama;
    String kelas;
    int tinggi;

    Paskibraka(String nm, String kls, int tb) {
        nama = nm;
        kelas = kls;
        tinggi = tb;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Tinggi Badan: " + tinggi + " cm");
    }
}