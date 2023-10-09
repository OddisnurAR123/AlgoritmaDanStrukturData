import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);
        PengurutanBuku dataBuku = new PengurutanBuku();
        int jumBuku = 4;

        for (int i = 0; i < jumBuku; i++) {
            System.out.print("Judul Buku = ");
            String judul = ods.nextLine();
            System.out.print("Jumlah Halaman = ");
            int jumlahHalaman = ods.nextInt();
            ods.nextLine();
            System.out.print("ukuran Buku (cm) = ");
            double tinggiBuku = ods.nextDouble();
            ods.nextLine();

            System.out.println("==============================================================");
            Buku buku = new Buku(judul, jumlahHalaman, tinggiBuku);
            dataBuku.tambah(buku);
        }

        System.out.println("==============================================================");
        System.out.println("Data buku sebelum sorting:");
        System.out.println("==============================================================");
        dataBuku.tampil();

        System.out.println("==============================================================");
        System.out.println("Data buku setelah sorting ASC berdasarkan ukuran buku:");
        System.out.println("==============================================================");
        dataBuku.bubbleSort();
        dataBuku.tampil();

        System.out.println("==============================================================");
        System.out.println("Data buku setelah sorting ASC berdasarkan jumlah halaman:");
        System.out.println("==============================================================");
        dataBuku.selectionSort();
        dataBuku.tampil();
    }
}