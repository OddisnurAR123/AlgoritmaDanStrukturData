package Pertemuan7.kodeQueue;

import java.util.Scanner;

public class QueueMahasiswaMain {
    public static void menu() {
        System.out.println("=========================================");
        System.out.println("                 Pilihan menu              ");
        System.out.println("=========================================");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Semua Antrian");
        System.out.println("4. Cek Antrian terdepan");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("6. Cek Posisi Mahasiswa");
        System.out.println("7. Cek Mahasiswa pada Posisi Tertentu");
        System.out.println("8. Keluar");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int n = ods.nextInt();
        ods.nextLine();

        QueueMahasiswa antrianMahasiswa = new QueueMahasiswa(n);

        int pilih;
        do {
            menu();
            System.out.print("Pilih Menu: ");
            pilih = ods.nextInt();
            ods.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = ods.next();
                    ods.nextLine();
                    System.out.print("Nama: ");
                    String nama = ods.nextLine();
                    System.out.print("Absen: ");
                    int absen = ods.nextInt();
                    System.out.print("IPK: ");
                    double ipk = ods.nextDouble();
                    Mahasiswa mahasiswa = new Mahasiswa(nim, nama, absen, ipk);
                    antrianMahasiswa.enqueue(mahasiswa);
                    break;
                case 2:
                    Mahasiswa mahasiswaKeluar = antrianMahasiswa.dequeue();
                    if (!"".equals(mahasiswaKeluar.nim)) {
                        System.out.println("Mahasiswa yang keluar:");
                        System.out.println("NIM: " + mahasiswaKeluar.nim);
                        System.out.println("Nama: " + mahasiswaKeluar.nama);
                        System.out.println("Absen: " + mahasiswaKeluar.absen);
                        System.out.println("IPK: " + mahasiswaKeluar.ipk);
                    }
                    break;
                case 3:
                    antrianMahasiswa.print();
                    break;
                case 4:
                    antrianMahasiswa.peek();
                    break;
                case 5:
                    antrianMahasiswa.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String cariNIM = ods.next();
                    antrianMahasiswa.peekPosition(cariNIM);
                    break;
                case 7:
                    System.out.print("Posisi Mahasiswa yang ingin dilihat: ");
                    int posisi = ods.nextInt();
                    antrianMahasiswa.printMahasiswa(posisi);
                    break;
                case 8:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih != 8);
    }
}