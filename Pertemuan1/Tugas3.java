package Pertemuan1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int bilangan = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(bilangan+" ");
            bilangan += 4;
        }
    }
}
