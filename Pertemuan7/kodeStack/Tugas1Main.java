package Pertemuan7.kodeStack;

import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = ods.nextLine();
        
        Tugas1 tugas1 = new Tugas1(kalimat.length());
        String hasilBalik = tugas1.reverseSentence(kalimat);

        System.out.println("Hasil:");
        System.out.println(hasilBalik);
    }
}
