public class Buku {
    String judul;
    int jumlahHalaman;
    double tinggiBuku;

    Buku(String jd, int jh, double tb) {
        judul = jd;
        jumlahHalaman = jh;
        tinggiBuku = tb;
    }

    void tampil() {
        System.out.println("Judul Buku = " + judul);
        System.out.println("Jumlah Halaman = " + jumlahHalaman);
        System.out.println("Tinggi Buku = " + tinggiBuku + " cm");
    }
}
