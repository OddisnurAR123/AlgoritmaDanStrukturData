public class BomGame {
    private int xc; // Koordinat x lokasi bom
    private int yc; // Koordinat y lokasi bom
    private int[][] musuh; // Array untuk menyimpan koordinat musuh

    // Konstruktor untuk menginisialisasi nilai koordinat bom dan array koordinat musuh
    public BomGame(int xc, int yc, int[][] musuh) {
        this.xc = xc;
        this.yc = yc;
        this.musuh = musuh;
    }

    // Metode untuk menghitung jumlah karakter musuh yang terkena ledakan bom dengan jangkauan tertentu
    public int hitungKarakterMati(int jangkauan) {
        int mati = 0; // Inisialisasi variabel untuk jumlah karakter musuh yang terkena ledakan bom
        // Iterasi untuk setiap musuh dan menghitung jarak antara bom dan musuh
        for (int i = 0; i < musuh.length; i++) {
            int xMusuh = musuh[i][0]; // Koordinat x musuh ke-i
            int yMusuh = musuh[i][1]; // Koordinat y musuh ke-i

            // Menggunakan rumus jarak Euclidean untuk menghitung jarak antara lokasi jatuhnya bom dan karakter musuh (dapat menghitung jarak antara dua titik)
            // Math.pow((xMusuh - xc), 2) menghitung kuadrat dari selisih antara koordinat x musuh dan koordinat x bom.
            // Math.pow((yMusuh - yc), 2) menghitung kuadrat dari selisih antara koordinat y musuh dan koordinat y bom.
            double jarak = Math.sqrt(Math.pow((xMusuh - xc), 2) + Math.pow((yMusuh - yc), 2));
            
             // Jika jarak kurang dari atau sama dengan jangkauan bom, karakter musuh mati atau terkena ledakan bom
            if (jarak <= jangkauan) {
                mati++; // Menambah jumlah musuh yang terkena ledakan
            }
        }
        return mati; // Mengembalikan jumlah total karakter musuh yang terkena ledakan bom
    }
}