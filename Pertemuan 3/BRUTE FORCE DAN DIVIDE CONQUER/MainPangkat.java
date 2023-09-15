import java.util.Scanner;
public class MainPangkat {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + ":");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("=============================================================");
        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan Anda: ");
        int metode = sc.nextInt();

        System.out.println("=============================================================");
        if (metode == 1) {
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println(
                    "Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                );
            }
        } else if (metode == 2) {
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println(
                    "Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                );
            }
        } else {
            System.out.println("Pilihan metode tidak valid.");
        }

        System.out.println("=============================================================");
        
    }
}