package Pertemuan16.Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for(int i = 0; i < mahasiswas.size(); i++) {
            if(nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
    
        return -1;
    }

    // Mengganti fungsi linearSearch() di atas, dengan fungsi binarySearch() dari collection soal No.2
    int binarySearch(String nim) {
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, null, null), new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2) {
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    
    // Menambahkan fungsi sorting baik secara ascending ataupun descending
    // Secara ASC
    void ascSort() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2) {
                return o1.nim.compareTo(o2.nim);
            }
        });
    }

    // Secara DESC
    void descSort() {
        Collections.reverse(mahasiswas);
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);

        // menambahkan list mahasiswa
        System.out.println("\n====================================================================================");
        System.out.println("                                         Data Awal                                  ");
        System.out.println("====================================================================================");
        lm.tampil();

        // update mahasiswa
        System.out.println("\n====================================================================================");
        System.out.println("                             Menggunakan Linear Search                              ");
        System.out.println("====================================================================================");
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // Mengganti juga update mahasiswanya
        System.out.println("\n=====================================================================================");
        System.out.println("                              Menggunakan Binary Search                             ");
        System.out.println("====================================================================================");
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // Menguji untuk soal No.3
        System.out.println("\n=====================================================================================");
        System.out.println("                                          ASCENDING                                 ");
        System.out.println("====================================================================================");
        lm.ascSort();
        System.out.println("");
        lm.tampil();

        System.out.println("\n=====================================================================================");
        System.out.println("                                          DESCENDING                                 ");
        System.out.println("====================================================================================");
        lm.descSort();
        System.out.println("");
        lm.tampil();
    }
}