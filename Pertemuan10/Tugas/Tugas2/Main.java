package Pertemuan10.Tugas.Tugas2;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("==========================================");
        System.out.println("         PROGRAM DAFTAR FILM             ");
        System.out.println("==========================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data pada Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak Daftar Film");
        System.out.println("8. Cari Film by ID");
        System.out.println("9. Urutkan Film by Rating (Descending)");
        System.out.println("10. Keluar");
        System.out.println("==========================================");
        System.out.print("Pilih Menu: ");
    }

    public static void main(String[] args) {
        DoublyLinkedList filmList = new DoublyLinkedList();
        Scanner oddis = new Scanner(System.in);

        while (true) {
            menu();
            int choice = oddis.nextInt();
            oddis.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("       Masukkan data film     ");
                    System.out.println("------------------------------");
                    System.out.print("ID Film: ");
                    int id = oddis.nextInt();
                    oddis.nextLine();
                    System.out.print("Judul: ");
                    String judul = oddis.nextLine();
                    System.out.print("Rating: ");
                    double rating = oddis.nextDouble();
                    filmList.addFilm(id, judul, rating);
                    System.out.println("Film berhasil ditambahkan di awal.");
                    break;
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("       Masukkan data film     ");
                    System.out.println("------------------------------");
                    System.out.print("ID Film: ");
                    int id2 = oddis.nextInt();
                    oddis.nextLine();
                    System.out.print("Judul: ");
                    String judul2 = oddis.nextLine();
                    System.out.print("Rating: ");
                    double rating2 = oddis.nextDouble();
                    filmList.addFilmAtIndex(filmList.size(), id2, judul2, rating2);
                    System.out.println("Film berhasil ditambahkan di akhir.");
                    break;
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("       Masukkan data film     ");
                    System.out.println("------------------------------");
                    System.out.print("ID Film: ");
                    int id3 = oddis.nextInt();
                    oddis.nextLine();
                    System.out.print("Judul: ");
                    String judul3 = oddis.nextLine();
                    System.out.print("Rating: ");
                    double rating3 = oddis.nextDouble();
                    System.out.print("Data film ini akan masuk di urutan ke -: ");
                    int index = oddis.nextInt();
                    filmList.addFilmAtIndex(index, id3, judul3, rating3);
                    System.out.println("Film berhasil ditambahkan pada index tertentu.");
                    break;
                case 4:
                    filmList.removeFirstFilm();
                    break;
                case 5:
                    filmList.removeLastFilm();
                    break;
                case 6:
                    System.out.print("Masukkan ID Film yang akan dihapus: ");
                    int id6 = oddis.nextInt();
                    filmList.removeFilmById(id6);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    filmList.printFilms();
                    break;
                case 8:
                    System.out.println("Cari Data Film");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int searchId = oddis.nextInt();
                    DoublyLinkedList.SearchResult searchResult = filmList.searchFilmByIdWithIndex(searchId);
                    if (searchResult.film != null) {
                        System.out.println("Data ditemukan pada node ke-" + searchResult.index);
                        System.out.println("IDENTITAS:");
                        System.out.println("ID Film: " + searchResult.film.id);
                        System.out.println("Judul Film: " + searchResult.film.judul);
                        System.out.println("Rating: " + searchResult.film.rating);
                    } else {
                        System.out.println("Data dengan ID Film " + searchId + " tidak ditemukan.");
                    }
                    break;

                case 9:
                    filmList.sortFilmsByRatingDescending();
                    filmList.printFilms();
                    break;
                case 10:
                    System.out.println("Program Selesai.");
                    oddis.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        }
    }
}