package Pertemuan1;

import java.util.Scanner;
public class PraktikumDua {
    public static void main(String[] args) {
        Scanner oddis = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = oddis.nextLong();
        System.out.println("=================================");

        long n = nim % 100;

        if (n < 10) {
            n += 10;
        }
        System.out.println("n:"+n);

        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

        for (int i = 0; i < n; i++) {
            System.out.print(hari[i % 7] + " ");
        }
    }
}