package Pertemuan5;

import java.util.Scanner;

public class MainTugas4 {
    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);

        System.out.print("Masukkan jumlah penduduk: ");
        int jumlahPenduduk = ods.nextInt();
        ods.nextLine();

        Tugas4[] penduduk = new Tugas4[jumlahPenduduk];

        for (int i = 0; i < jumlahPenduduk; i++) {

            System.out.println("Data Penduduk ke - " + (i + 1));
            System.out.print("NIK: ");
            String NIK = ods.nextLine();
            System.out.print("Nama: ");
            String nama = ods.nextLine();
            System.out.print("Alamat: ");
            String alamat = ods.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = ods.nextLine();

            penduduk[i] = new Tugas4(NIK, nama, alamat, jenisKelamin);
        }

        
        System.out.println("================================================================================================");
        System.out.println("\t\t\t\t\t -- DATA PENDUDUK --\t\t\t\t\t");
        System.out.println("================================================================================================");
        System.out.printf("|%-5s | %-12s | %-20s | %-30s | %-15s%n", "No", "NIK", "NAMA", "ALAMAT", "JENIS KELAMIN");
        System.out.println("================================================================================================");
        for (int i = 0; i < penduduk.length; i++) {
            System.out.printf("|%-5d | %-12s | %-20s | %-30s | %-15s%n", i + 1, penduduk[i].NIK, penduduk[i].nama,
                    penduduk[i].alamat, penduduk[i].jenisKelamin);
        }
        System.out.println("================================================================================================");

        System.out.println("================================================================================================");
        System.out.println("\t\t\t\t\t -- CARI DATA PENDUDUK --\t\t\t\t\t");
        System.out.println("================================================================================================");
        System.out.print("Masukkan NIK yang ingin dicari: ");
        String cari = ods.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahPenduduk; i++) {
            if (penduduk[i].NIK.equals(cari)) {
                ditemukan = true;
                System.out.println("================================================================================================");
                System.out.printf("|%-5s | %-12s | %-20s | %-30s | %-15s%n", "No", "NIK", "NAMA", "ALAMAT", "JENIS KELAMIN");
                System.out.printf("|%-5d | %-12s | %-20s | %-30s | %-15s%n", i + 1, penduduk[i].NIK, penduduk[i].nama,
                        penduduk[i].alamat, penduduk[i].jenisKelamin);
                System.out.println("================================================================================================");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan NIK " + cari + " tidak ditemukan.");
        }

        ods.close();
    }
}