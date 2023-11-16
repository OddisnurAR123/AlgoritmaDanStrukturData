package Pertemuan1;

public class Tugas1 {
    public static void main(String[] args) {
        String[] pelanggan = {"Ani", "Budi", "Bina", "Cita"};
        int[] beratPakaian = {4, 15, 6, 11};
        int totalPendapatan = 0;
        
        for (int i = 0; i < pelanggan.length; i++) {
            int biaya = beratPakaian[i] * 4500;
            
            if (beratPakaian[i] > 10) {
                biaya -= biaya * 0.05;
            }
            
            totalPendapatan += biaya;
            
            System.out.println("======================================");
            System.out.println("Pelanggan: " + pelanggan[i]);
            System.out.println("Berat Pakaian: " + beratPakaian[i] + " kg");
            System.out.println("Biaya: Rp. " + biaya);
            System.out.println("======================================");
        }
        
        System.out.println("Total Pendapatan Hari Ini: Rp. " + totalPendapatan);
        System.out.println("======================================");
    }
}