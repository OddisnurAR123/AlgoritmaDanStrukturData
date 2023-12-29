import java.util.Scanner;

public class BomGameMain {
    public static void main(String[] args) {
        // Membuat dan menginisialisasi objek scanner untuk membaca input dari pengguna, dan akan secara otomatis menutup 
        try (Scanner oddis = new Scanner(System.in)) {
            System.out.println("==================================================================");
            // Membaca lokasi jatuhnya bom
            System.out.println("Masukkan koordinat lokasi jatuhnya bom: ");
            int xc = oddis.nextInt(); // Membaca input koordinat x bom.
            int yc = oddis.nextInt(); // Membaca input koordinat y bom.
            System.out.println("==================================================================");

            // Membaca jumlah karakter musuh
            System.out.println(" ");
            System.out.println("==================================================================");
            System.out.println("Masukkan jumlah karakter musuh: ");
            int N = oddis.nextInt(); // Membaca input jumlah karakter musuh.
            System.out.println("==================================================================");

            // Membaca koordinat karakter musuh
            System.out.println(" ");
            System.out.println("==================================================================");
            System.out.println("Masukkan koordinat karakter musuh: ");
            // Membaca input koordinat karakter musuh sejumlah N kali.
            int[][] musuh = new int[N][2];
            for (int i = 0; i < N; i++) {
                musuh[i][0] = oddis.nextInt(); // Membaca input koordinat x karakter musuh.
                musuh[i][1] = oddis.nextInt(); // Membaca input koordinat y karakter musuh.
            }
            System.out.println("==================================================================");

            // Membuat objek BomGame dengan informasi yang telah dimasukkan pengguna
            BomGame game = new BomGame(xc, yc, musuh);

            // Membaca jumlah jenis bom
            System.out.println(" ");
            System.out.println("==================================================================");
            System.out.println("Masukkan jumlah jenis bom: ");
            int Q = oddis.nextInt(); // Membaca input jumlah jenis bom.
            System.out.println("==================================================================");

            // Membaca jari-jari lingkaran jangkauan bom
            System.out.println(" ");
            System.out.println("==================================================================");
            int[] jangkauanBom = new int[Q];
            // Membaca input jari-jari bom sejumlah Q kali.
            for (int j = 0; j < Q; j++) {
                System.out.println("Masukkan jari-jari lingkaran jangkauan bom ke-" + (j + 1) + ": ");
                jangkauanBom[j] = oddis.nextInt(); // Membaca input jari-jari lingkaran bom.
                System.out.println("==================================================================");
            }

            // Mencetak keluaran dengan judul
            System.out.println(" ");
            System.out.println("==================================================================");
            for (int j = 0; j < Q; j++) {
                // Memanggil fungsi hitungKarakterMati untuk menghitung jumlah karakter musuh yang mati atau terkena ledakan bom.
                int mati = game.hitungKarakterMati(jangkauanBom[j]);
                // Menampilkan hasil jumlah musuh yang mati atau terkena ledakan bom.
                System.out.println("Jumlah musuh yang mati atau terkena ledakan bom " + (j + 1) + ": " + mati);
            }
            System.out.println("==================================================================");
        }
    }
}
