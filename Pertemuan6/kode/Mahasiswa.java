public class Mahasiswa {
    public static final String nim = null;
    public static String namaMahasiswa;
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama=n;
        thnMasuk=t;
        umur=u;
        ipk=i;
    }

    public Mahasiswa(String string, String string2, double d) {
    }

    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun Masuk = "+thnMasuk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }   
}