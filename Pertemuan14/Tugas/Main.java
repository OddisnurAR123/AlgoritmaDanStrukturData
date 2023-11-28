package Pertemuan14.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashTable mahasiswaTable = new HashTable();
        Scanner oddis = new Scanner(System.in);

        boolean Menu = true;
        while (Menu) {
            System.out.println("=====================================");
            System.out.println("                Menu                 ");
            System.out.println("=====================================");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cari Mahasiswa berdasarkan NIM");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Tampilkan Seluruh NIM Mahasiswa");
            System.out.println("5. Keluar");
            System.out.println("=====================================");
            System.out.print("Pilih menu (1-5): ");

            int menuChoice = oddis.nextInt();
            oddis.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println("         Tambah Mahasiswa            ");
                    System.out.println("=====================================");
                    System.out.print("NIM: ");
                    String nim = oddis.nextLine();
                    System.out.print("Nama Lengkap: ");
                    String namaLengkap = oddis.nextLine();
                    System.out.print("Jurusan: ");
                    String jurusan = oddis.nextLine();
                    System.out.print("Program Studi: ");
                    String programStudi = oddis.nextLine();

                    Mahasiswa newMahasiswa = new Mahasiswa(nim, namaLengkap, jurusan, programStudi);
                    mahasiswaTable.set(newMahasiswa);
                    System.out.println("=====================================");
                    System.out.println("Mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("    Cari Mahasiswa berdasarkan NIM   ");
                    System.out.println("=====================================");
                    System.out.print("Masukkan NIM mahasiswa yang ingin dicari: ");
                    String searchNim = oddis.nextLine();

                    Mahasiswa foundMahasiswa = mahasiswaTable.get(searchNim);
                    if (foundMahasiswa != null) {
                        System.out.println("=====================================");
                        System.out.println("Mahasiswa ditemukan.");
                        System.out.println("=====================================");
                        System.out.println("NIM: " + foundMahasiswa.nim);
                        System.out.println("Nama Lengkap: " + foundMahasiswa.namaLengkap);
                        System.out.println("Jurusan: " + foundMahasiswa.jurusan);
                        System.out.println("Program Studi: " + foundMahasiswa.programStudi);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + searchNim + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.println("\nHapus Mahasiswa:");
                    System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
                    String hapusNim = oddis.nextLine();
                
                    if (mahasiswaTable.remove(hapusNim)) {
                        System.out.println("Mahasiswa dengan NIM " + hapusNim + " berhasil dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + hapusNim + " tidak ditemukan.");
                    }
                    break;
                
                case 4:
                    System.out.println("=========================================");
                    System.out.println("  Seluruh Data Mahasiswa yang Tersimpan  ");
                    System.out.println("=========================================");
                    mahasiswaTable.printTable();
                break;
                case 5:
                    Menu = false;
                    break;
                default:
                    System.out.println("Masukkan pilihan yang valid (1-5).");
                    break;
            }
        }
        oddis.close();
        System.out.println("Program selesai.");
    }
}