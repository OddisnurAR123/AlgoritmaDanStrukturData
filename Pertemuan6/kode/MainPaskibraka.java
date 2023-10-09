import java.util.Scanner;

public class MainPaskibraka {
    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);
        DaftarAnggotaPaskibraka dataPeserta = new DaftarAnggotaPaskibraka();
        int jumPeserta = 10;

        for (int i = 0; i < jumPeserta; i++) {
            System.out.print("Nama: ");
            String nama = ods.nextLine();
            System.out.print("Kelas: ");
            String kelas = ods.nextLine();
            System.out.print("Tinggi Badan (cm): ");
            int tinggi = ods.nextInt();
            ods.nextLine();

            System.out.println("=======================================================================");
            Paskibraka peserta = new Paskibraka(nama, kelas, tinggi);
            dataPeserta.tambah(peserta);
        }

        System.out.println("=======================================================================");
        System.out.println("Data anggota Paskibraka sebelum sorting:");
        System.out.println("=======================================================================");
        dataPeserta.tampil();

        System.out.println("=======================================================================");
        System.out.println("Data anggota Paskibraka setelah sorting DESC berdasarkan tinggi badan :");
        System.out.println("=======================================================================");
        dataPeserta.sorting();
        dataPeserta.tampil();

        System.out.println("=======================================================================");
        System.out.println("Data anggota Paskibraka yang di terima atau lolos seleksi: ");
        System.out.println("=======================================================================");
        dataPeserta.selectionSort();
    }
}
