package Uts.kode;

import java.util.Scanner;

public class MainQueue21 {
    public static void main(String[] args) {
         System.out.println("========================= UTS PRAKTIKUM ASD SIB 2C ==========================");
        System.out.println("Dibuat oleh : Oddis Nur Alifathur Razaaq");
        System.out.println("NIM : 2241760015");
        System.out.println("Absen : 21");
        System.out.println("=============================================================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        int maxAntrian = 100;
        Queue21 antrian = new Queue21(maxAntrian);
        int nomorAntrian = 1;

        Scanner oddis = new Scanner(System.in);

        while (true) {
            System.out.println("=============================================================================");
            System.out.println("                                          Menu                               ");
            System.out.println("=============================================================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("=============================================================================");

            System.out.print("Pilih menu (1-6): ");
            int menu = oddis.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("=============================================================================");
                    System.out.println("                                Masukkan Data Pembeli                        ");
                    System.out.println("=============================================================================");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrianInput = oddis.nextInt();
                    System.out.print("Nama Customer: ");
                    String namaPembeli = oddis.next();
                    oddis.nextLine(); 
                    System.out.print("Nomor HP: ");
                    String noHp = oddis.next();
                    oddis.nextLine(); 
                    System.out.println("=============================================================================");
                    System.out.print("Makanan Yang di Pesan: ");
                    String namaMakanan = oddis.nextLine();
                    System.out.print("Harga Makanan: ");
                    int hargaMakanan = oddis.nextInt();
                    System.out.println("=============================================================================");

                    Pesanan21 pesanan9 = new Pesanan21(1, namaMakanan, hargaMakanan);
                    Pembeli21 pembeli = new Pembeli21(namaPembeli, noHp, nomorAntrian, pesanan9);
                    antrian.enqueue(pembeli);
                    nomorAntrian++;
                    break;
                case 2:
                    System.out.println("=============================================================================");
                    System.out.println("                          Daftar Antrian Resto Royal Delish                  ");
                    System.out.println("=============================================================================");
                    System.out.printf("%-5s%-25s%-15s%n", "| No.", "| Nama Customer", "| No hp");
                    int currentSize = antrian.size;
                    while (currentSize > 0) {
                        Pembeli21 p = antrian.dequeue();
                        System.out.printf("%-5d%-25s%-15s%n", p.nomorAntrian, p.namaPembeli, p.NoHp);
                        antrian.enqueue(p);
                        currentSize--;
                    }
                    break;
                case 3:
                    if (antrian.size > 0) {
                        Pembeli21 p = antrian.dequeue();
                        System.out.println(p.namaPembeli + " telah memesan Menu.");
                         System.out.println("=============================================================================");
                        System.out.println("                         Transaksi Input Pesanan                              ");
                        System.out.println("=============================================================================");
                        System.out.print("Nomor Pesanan: ");
                        int noPesanan = oddis.nextInt();
                        oddis.nextLine();
                        System.out.print("Pesanan: ");
                        String namaPesanan = oddis.nextLine();
                        System.out.print("Harga: ");
                        int harga = oddis.nextInt();
                        oddis.nextLine();
                        
                        p.pesanan = new Pesanan21(noPesanan, namaPesanan, harga);
                        
                        System.out.println("Pesanan " + p.namaPembeli + " berhasil diupdate.");
                        
                        antrian.enqueue(p);
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 4:
                    if (antrian.size > 0) {
                        Pembeli21[] pembeliArray = new Pembeli21[antrian.size];
                        int currentSize4 = antrian.size;
                        for (int i = 0; i < currentSize4; i++) {
                            pembeliArray[i] = antrian.dequeue();
                        }
                
                        for (int i = 0; i < currentSize4 - 1; i++) {
                            for (int j = 0; j < currentSize4 - i - 1; j++) {
                                if (pembeliArray[j].pesanan.namaPesanan.compareTo(pembeliArray[j + 1].pesanan.namaPesanan) > 0) {
                                    Pembeli21 temp = pembeliArray[j];
                                    pembeliArray[j] = pembeliArray[j + 1];
                                    pembeliArray[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("=============================================================================");
                        System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                        System.out.println("=============================================================================");
                        System.out.println("| No.\t| Nama Makanan\t| Harga");
                        for (int i = 0; i < currentSize4; i++) {
                            antrian.enqueue(pembeliArray[i]);
                            System.out.println("| " + pembeliArray[i].nomorAntrian + "\t| " + pembeliArray[i].pesanan.namaPesanan + "\t| " + pembeliArray[i].pesanan.harga);
                        }
                    } else {
                        System.out.println("Belum ada pesanan.");
                    }
                    break;
                
                case 5:
                    int totalPendapatan = 0;
                    int currentSize5 = antrian.size;
                    for (int i = 0; i < currentSize5; i++) {
                        Pembeli21 p = antrian.dequeue();
                        totalPendapatan += p.pesanan.harga;
                        antrian.enqueue(p);
                    }
                    System.out.println("Total Pendapatan: " + totalPendapatan);
                    break;
                
                case 6:
                    System.out.println("Terima kasih. Keluar dari Program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu (1-6).");
            }
        }
    }
}