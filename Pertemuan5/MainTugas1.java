package Pertemuan5;

import java.util.Scanner;
public class MainTugas1 {
    public static void main (String[] args) {
        Scanner ods = new Scanner (System.in);

        double[] angka = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};

        System.out.println("=========================================================================");
        OrderedSearch Tugas1 = new OrderedSearch(angka);
        System.out.println("Elemen array :    ");
        Tugas1.tampilkan();

        System.out.println("=========================================================================");
        System.out.print ("Masukkan nilai yang ingin dicari : ");
        double key = ods.nextDouble();
        System.out.println("=========================================================================");

        int index = Tugas1.cari(key);

        if (index!= -1) {
            System.out.print("Nilai " + key + " ditemukan pada Index " + index);
        }else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
    }
}