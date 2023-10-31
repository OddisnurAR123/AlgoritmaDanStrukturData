package Pertemuan10.Tugas.Tugas1;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("==========================================");
        System.out.println("        PENGANTRI VAKSIN EXTRAVAGANZA      ");
        System.out.println("==========================================");
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data penerima vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Keluar");
        System.out.println("==========================================");
        System.out.print("Pilih Menu: ");
    }

    public static void main(String[] args) throws Exception {
        DoublyLinkedList antrianVaksinasi = new DoublyLinkedList();
        Scanner oddis = new Scanner(System.in);

        while (true) {
            menu();
            int pilih = oddis.nextInt();

            switch (pilih) {
                case 1:
                    oddis.nextLine();
                    System.out.println("------------------------------");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("------------------------------");
                    System.out.print("Nomor antrian: ");
                    int nomorAntrian = oddis.nextInt();
                    oddis.nextLine();
                    System.out.print("Nama penerima: ");
                    String nama = oddis.nextLine();
                    antrianVaksinasi.addLast(nama, nomorAntrian);
                    break;
                case 2:
                    antrianVaksinasi.removeFirst();
                    break;
                case 3:
                    antrianVaksinasi.print();
                    break;
                case 4:
                    System.out.println("Program Selesai.");
                    oddis.close();
                    System.exit(4);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        }
    }
}