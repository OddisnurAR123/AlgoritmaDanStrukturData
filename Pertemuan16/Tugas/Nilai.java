package Pertemuan16.Tugas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Nilai {
    String kode;
    double nilai;
    Mahasiswa mhs;
    MataKuliah mk;
    
    public Nilai(String kode, double nilai, Mahasiswa mhs, MataKuliah mk){
        this.kode = kode;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }

    public Nilai() {
    }

    List<Mahasiswa> mhss = new ArrayList<>();
    List<MataKuliah> matkull = new ArrayList<>();
    Queue<Mahasiswa> mahasiswaQueue = new LinkedList<>();

    public void tambahMhs(Mahasiswa... mahasiswa){
        mhss.addAll(Arrays.asList(mahasiswa));
        mahasiswaQueue.addAll(Arrays.asList(mahasiswa));
    }

    public void tambahMatkul(MataKuliah... matkul){
        matkull.addAll(Arrays.asList(matkul));
    }

    public void tampilMhs(){
        mhss.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
        });
    }

    public void tampilMatkul(){
        matkull.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }

    int linearSearchMhs(String nim){
            for(int i = 0; i < mhss.size(); i++){ 
                if(nim.equals(mhss.get(i).nim)){
                    return i;
                }
            }
            return -1;
    }

    int linearSearchMatkul(String matkul){
            for(int i = 0; i < matkull.size(); i++){ 
                if(matkul.equals(matkull.get(i).kodeMk)){
                    return i;
                }
            }
            return -1;
    }

    Mahasiswa cariMhs(String nim){
        for(int i = 0; i < mhss.size(); i++){
            if(nim.equals(mhss.get(i).nim)){
                return mhss.get(i);
            }
        }
        return null;
    }

    MataKuliah cariMatkul(String matkul){
        for(int i = 0; i < matkull.size(); i++){
            if(matkul.equals(matkull.get(i).kodeMk)){
                return matkull.get(i);
            }
        }
        return null;
    }

    public String toString(int idx1, int idx2){
        return mhss.get(idx1).nim + "\t" + mhss.get(idx1).nama + "\t" + matkull.get(idx2).namaMk + "\t" + matkull.get(idx2).sks + "\t";
    }
    
    static Comparator<Nilai> CompNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        } else if (n1.nilai > (n2).nilai){
            return 1;
        } else {
            return 0;
        }
    };


    // Implementasi untuk menghapus data mahasiswa dari antrian
    public void hapusMhs(){
        if (!mahasiswaQueue.isEmpty()) {
            Mahasiswa removedMahasiswa = mahasiswaQueue.poll();
            mhss.removeIf(mahasiswa -> mahasiswa.nim.equals(removedMahasiswa.nim));
        } else {
            System.out.println("Antrian mahasiswa sudah kosong. Tidak ada data yang dihapus.");
        }
    }    
    

    public static void main(String[] args) {
        Scanner oddis = new Scanner(System.in);
        Scanner oddiss = new Scanner(System.in);
        Scanner oddisss = new Scanner(System.in);

        List<Nilai> nill = new ArrayList<>();
        Nilai nilai = new Nilai("", 0, null, null);
        
        Mahasiswa mhs1 = new Mahasiswa("20001", "Thalhah", "021xxx");
        Mahasiswa mhs2 = new Mahasiswa("20002", "Zubair", "021xxx");
        Mahasiswa mhs3 = new Mahasiswa("20003", "Abdur-Rahman", "021xxx");
        Mahasiswa mhs4 = new Mahasiswa("20004", "Sa'ad", "021xxx");
        Mahasiswa mhs5 = new Mahasiswa("20005", "Sa'id ", "021xxx");
        Mahasiswa mhs6 = new Mahasiswa("20006", "Ubaidah", "021xxx");
        
        nilai.tambahMhs(mhs1, mhs2, mhs3, mhs4, mhs5, mhs6);
        
        MataKuliah mk1 = new MataKuliah("00001", "Internet of Things", 3);
        MataKuliah mk2 = new MataKuliah("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah mk3 = new MataKuliah("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah mk4 = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);
        
        nilai.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
        
        Nilai nilai1 = null;
        String nimMhs, mkMhs;
        
        int menu = 0;
        do{
            System.out.println("====================================================");
            System.out.println("   SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER  ");
            System.out.println("====================================================");
            System.out.println(" 1. Input Nilai");
            System.out.println(" 2. Tampil Nilai");
            System.out.println(" 3. Mencari Nilai Mahasiswa");
            System.out.println(" 4. Urut Data Nilai");
            System.out.println(" 5. Hapus Data Mahasiswa");
            System.out.println(" 6. Keluar");
            System.out.println("====================================================");
            System.out.print("Pilih\t: ");
            menu = oddis.nextInt();
            System.out.println("");
            
            switch(menu){
                case 1 :
                    System.out.println("====================================================");
                    System.out.println("                     MASUKKAN DATA                  ");
                    System.out.println("====================================================");
                    System.out.print("Kode\t: ");
                    String kode = oddiss.nextLine();
                    System.out.print("Nilai\t: ");
                    double nilaiMhs = oddisss.nextDouble();
                    System.out.println("");
                    
                    System.out.println("====================================================");
                    System.out.println("                    DAFTAR MAHASISWA                ");
                    System.out.println("====================================================");
                    System.out.println("NIM\t\tNama\t\tNo Telp");
                    nilai.tampilMhs();
                    System.out.println("---------------------------------------------------");
                    System.out.print("Pilih Mahasiswa by nim\t: ");
                    nimMhs = oddiss.nextLine();
                    Mahasiswa mahaSiswas;
                    mahaSiswas = nilai.cariMhs(nimMhs);
                    
                    System.out.println("");
                    System.out.println("====================================================");
                    System.out.println("                    DAFTAR MATA KULIAH              ");
                    System.out.println("====================================================");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    nilai.tampilMatkul();
                    System.out.println("---------------------------------------------------");
                    System.out.print("Pilih Mata Kuliah by Kode\t:");
                    mkMhs = oddiss.nextLine();
                    MataKuliah matkuls;
                    matkuls = nilai.cariMatkul(mkMhs);
                    
                    nilai1 = new Nilai(kode, nilaiMhs, mahaSiswas, matkuls);
                    
                    nill.add(nilai1);
                    System.out.println("");
                break;

                case 2:
                    System.out.println("====================================================================================");
                    System.out.println("                                 DAFTAR NILAI MAHASISWA                             ");
                    System.out.println("====================================================================================");
                    System.out.printf("%-12s %-20s %-40s %-4s %-5s%n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (int i = 0; i < nill.size(); i++) {
                        nilai.linearSearchMhs(nill.get(i).mhs.nim);
                        nilai.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.printf("%-12s %-20s %-40s %-4d %-5.2f%n",
                                nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nim,
                                nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nama,
                                nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).namaMk,
                                nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).sks,
                                nill.get(i).nilai);
                    }
                    System.out.println("");
                break;
                
                case 3:
                    System.out.println("====================================================================================");
                    System.out.println("                                 DAFTAR NILAI MAHASISWA                             ");
                    System.out.println("====================================================================================");
                    System.out.printf("%-12s %-20s %-40s %-4s %-5s%n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    int sks = 0;
                    for (int i = 0; i < nill.size(); i++) {
                        nilai.linearSearchMhs(nill.get(i).mhs.nim);
                        nilai.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.printf("%-12s %-20s %-40s %-4d %-5.2f%n",
                                nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nim,
                                nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nama,
                                nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).namaMk,
                                nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).sks,
                                nill.get(i).nilai);
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.print("Masukkan data mahasiswa [NIM]\t: ");
                    String input = oddiss.nextLine();
                    System.out.printf("%-12s %-20s %-40s %-4s %-5s%n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (int i = 0; i < nill.size(); i++) {
                        if (input.equalsIgnoreCase(nill.get(i).mhs.nim)) {
                            sks += nilai.matkull.get(i).sks;
                            nilai.linearSearchMhs(nill.get(i).mhs.nim);
                            nilai.linearSearchMatkul(nill.get(i).mk.kodeMk);
                            System.out.printf("%-12s %-20s %-40s %-4d %-5.2f%n",
                                    nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nim,
                                    nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nama,
                                    nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).namaMk,
                                    nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).sks,
                                    nill.get(i).nilai);
                        }
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("");
                break;

                case 4:
                    System.out.println("====================================================================================");
                    System.out.println("                                 DAFTAR NILAI MAHASISWA                             ");
                    System.out.println("====================================================================================");
                    System.out.printf("%-12s %-20s %-40s %-4s %-5s%n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    nill.sort(CompNilai);
                    for (int i = 0; i < nill.size(); i++) {
                        nilai.linearSearchMhs(nill.get(i).mhs.nim);
                        nilai.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.printf("%-12s %-20s %-40s %-4d %-5.2f%n",
                                nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nim,
                                nilai.mhss.get(nilai.linearSearchMhs(nill.get(i).mhs.nim)).nama,
                                nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).namaMk,
                                nilai.matkull.get(nilai.linearSearchMatkul(nill.get(i).mk.kodeMk)).sks,
                                nill.get(i).nilai);
                    }
                    System.out.println("");
                break;

                case 5:
                    System.out.println("====================================================");
                    System.out.println("       HAPUS DATA MAHASISWA DARI ANTRIAN            ");
                    System.out.println("====================================================");
                    nilai.hapusMhs();
                    nilai.tampilMhs();
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("PROGRAM SELESAI");
                    break;
            }
        } while (menu < 6 && menu > 0);
    }
}