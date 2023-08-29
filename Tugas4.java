import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
    Scanner oddis = new Scanner(System.in);
    System.out.println("=================Menu=================");
    System.out.println("1.Hitung Luas Segitiga");
    System.out.println("2.Hitung Luas Persegi Panjang");
    System.out.println("3.Hitung Luas Lingkaran");
    System.out.println("======================================");
    System.out.print("Masukkan Pilihan : ");
    int pilih = oddis.nextInt();System.out.println("======================================");

    
    switch (pilih) {
        case 1:
        LuasSegitiga();
        break;
        case 2:
        LuasPersegiPanjang();
        break;
        case 3:
        LuasLingkaran();
        break;
    }

  }

  public static void LuasSegitiga() {
    Scanner oddis = new Scanner(System.in);
    System.out.print("Masukkan alas : ");
    double alas = oddis.nextDouble();
    System.out.print("Masukkan tinggi :");
    double tinggi = oddis.nextDouble();
    double luas = 0.5 * alas * tinggi;
    System.out.println("Luas Segitiga tersebut adalah : " + luas);

  }

  public static void LuasPersegiPanjang() {
    Scanner oddis = new Scanner(System.in);
    System.out.print("Masukkan panjang : ");
    int panjang = oddis.nextInt();
    System.out.print("Masukkan lebar : ");
    int lebar = oddis.nextInt();
    int luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang tersebut adalah : " + luas);
  }
  
  public static void LuasLingkaran() {
    Scanner oddis = new Scanner(System.in);
    System.out.print("Masukkan Jari - jari : ");
    double jariJari = oddis.nextDouble();
    double luas = 3.14 * jariJari * jariJari;
    System.out.println("Luas Lingkaran tersebut adalah :" + luas);
  }
}