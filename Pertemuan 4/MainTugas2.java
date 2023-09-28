import java.util.Scanner;

public class MainTugas2 {
    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);

        String[][] dataMahasiswa = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };

        System.out.println("Daftar Kelompok Mahasiswa:");
        System.out.println("=======================================");
        int i = 0;
        while (i < dataMahasiswa.length) {
            System.out.print("Kelompok " + (i + 1) + ": ");
            int j = 0;
            while (j < dataMahasiswa[i].length) {
                System.out.print(dataMahasiswa[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("=======================================");
        System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
        String namaCari = ods.nextLine();

        System.out.println("=======================================");
        Tugas2 tugas2 = new Tugas2(dataMahasiswa);
        tugas2.cariMahasiswa(namaCari);
    }
}