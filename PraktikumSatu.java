import java.util.Scanner;
public class PraktikumSatu {
    public static void main(String[] args) {
        Scanner oddis = new Scanner (System.in);
        double nilaiTugas, nilaiUts, nilaiUas;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = oddis.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts = oddis.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas = oddis.nextDouble();

        double nilaiAkhir = nilaiTugas*20/100 + nilaiUts*35/100 + nilaiUas*45/100;

        String nilaiHuruf;
        if (nilaiAkhir >80  && nilaiAkhir <=100){
            nilaiHuruf = "A";
        }else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiHuruf = "B+";
        }else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
        }else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiHuruf = "C+";
        }else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            nilaiHuruf = "C";
        }else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        
        System.out.println("=================================");
        System.out.println("=================================");
        
        String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "SELAMAT LULUS";
        
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("=================================");
        System.out.println(keterangan);

    }
}