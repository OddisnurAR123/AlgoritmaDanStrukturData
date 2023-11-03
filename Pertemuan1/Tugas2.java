public class Tugas2 {
    public static void main(String[] args) {
        double saldoAwal = 1000000; 
        double saldoTarget = 1500000; 
        double bungaPerBulan = 0.02; 
        
        int bulan;
        for (bulan = 0; saldoAwal < saldoTarget; bulan++) {
            saldoAwal += saldoAwal * bungaPerBulan;
        }
        
        System.out.println("Pada bulan ke: " + bulan );

    }
}
