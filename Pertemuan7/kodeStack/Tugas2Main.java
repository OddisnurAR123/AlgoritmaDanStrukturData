package Pertemuan7.kodeStack;

import java.util.Scanner;

public class Tugas2Main {
    public static void main(String[] args) {
        Tugas2 tugas2 = new Tugas2(8);
        Scanner ods = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {
            System.out.println("==================================================");
            System.out.println("Masukkan informasi Struk Belanja ke-" + i + ":");
            System.out.print("Nomor Transaksi: ");
            String nomorTransaksi = ods.nextLine();
            System.out.print("Tanggal Pembelian: ");
            String tanggalPembelian = ods.nextLine();
            System.out.print("Jumlah Barang: ");
            int jumlahBarang = ods.nextInt();
            System.out.print("Total Harga Bayar: ");
            double totalHargaBayar = ods.nextDouble();
            ods.nextLine();
            System.out.println("==================================================");

            String strukInfo = "Nomor Transaksi: " + nomorTransaksi +
                              "\nTanggal Pembelian: " + tanggalPembelian +
                              "\nJumlah Barang: " + jumlahBarang +
                              "\nTotal Harga Bayar: " + totalHargaBayar;

            tugas2.push(strukInfo);
        }

        System.out.println("\n==================================================");
        System.out.println("Daftar Struk Belanja Dewi:");
        System.out.println("==================================================");
        tugas2.print();


        System.out.println("\n==================================================");
        System.out.println("\nStruk Belanja yang Diambil untuk Voucher Belanja:");
        System.out.println("==================================================");
        for (int i = 0; i < 5; i++) {
            String struk = tugas2.pop();
            if (struk != null) {
                System.out.println(struk);
            } else {
                System.out.println("Stack struk belanja sudah kosong.");
                break;
            }
        }
        

        System.out.println("\n==================================================");
        System.out.println("Sisa Struk Belanja Dewi:");
        System.out.println("==================================================");
        tugas2.print();
        System.out.println("==================================================");
    }
}