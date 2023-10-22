package Pertemuan7.kodeStack;

import java.util.Scanner;

public class StackBukuMain {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        StackBuku st = new StackBuku(8);

        /*char pilih;
        do {
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang: ");
            String nama = sc.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = sc.nextInt();
            System.out.print("Jumlah Halaman: ");
            int jml = sc.nextInt();
            System.out.print("Harga: ");
            int hrg = sc.nextInt();
            
            Buku bk = new Buku(judul, nama, tahun, jml, hrg);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/t)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
                   
        } while (pilih == 'y');
        
        st.print();
        st.pop();
        st.peek();
        st.print();
    }*/

        //Modifikasi agar dapat memilih operasioperasi pada stack (push, pop, peek, atau print) melalui pilihan menu program
        char pilih;
        do {
            System.out.println("=======================================================");
            System.out.println("                            Menu                       ");
            System.out.println("=======================================================");
            System.out.println("1. Push (Tambah Buku)");
            System.out.println("2. Pop (Hapus Buku Teratas)");
            System.out.println("3. Peek (Lihat Buku Teratas)");
            System.out.println("4. Print (Tampilkan Isi Stack)");
            System.out.println("5. Keluar");

            System.out.print("Pilih Menu: ");
            pilih = sc.next().charAt(0);
            sc.nextLine();

            switch (pilih) {
                case '1':
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Nama Pengarang: ");
                    String nama = sc.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahun = sc.nextInt();
                    System.out.print("Jumlah Halaman: ");
                    int jml = sc.nextInt();
                    System.out.print("Harga: ");
                    int hrg = sc.nextInt();
                    Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                    st.push(bk);
                    break;

                case '2':
                    st.pop();
                    break;

                case '3':
                    st.peek();
                    break;

                case '4':
                    st.print();
                    break;

                case '5':
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != '5');
    }
}