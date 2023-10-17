package Pertemuan8.kode;

public class NasabahBankMain {
    public static void main(String[] args) {
        // NasabahBankMain sebelum implementasi QUEUE
        /*LinkedListNasabah daftarNasabah = new LinkedListNasabah();
        daftarNasabah.tambahNasabah("Oddis Nur Alifathur Razaaq", "Ploso, Jombang", "19876767623456");
        daftarNasabah.tambahNasabah("Arya Bima Putra Dewangga", "Kabuh, Jombang", "98798775789012");
        daftarNasabah.tambahNasabah("Senilya Dias Sastra", "Plandaan, Jombang", "98367547345678");
        daftarNasabah.tambahNasabah("Mutiara Rengganis", "Kudu, Jombang", "98276352410298");

        System.out.println("Daftar Nasabah Bank:");
        daftarNasabah.displayList();*/

        // NasabahBankMain Setelah mengimplementasikan QUEUE
        LinkedListNasabah daftarNasabah = new LinkedListNasabah(6); // Menentukan kapasitas maksimum

        daftarNasabah.enqueue("Oddis Nur Alifathur Razaaq", "Ploso, Jombang", "19876767623456");
        daftarNasabah.enqueue("Arya Bima Putra Dewangga", "Kabuh, Jombang", "98798775789012");
        daftarNasabah.enqueue("Senilya Dias Sastra", "Plandaan, Jombang", "98367547345678");
        daftarNasabah.enqueue("Mutiara Rengganis", "Kudu, Jombang", "98276352410298");
        daftarNasabah.enqueue("Lydia Ayu Fatma", "Tembelang, Jombang", "13231426354781");
        daftarNasabah.enqueue("Deviana Anggraini", "Megaluh, Jombang", "42316253415243");

        System.out.println("===================================================");
        System.out.println("Daftar Nasabah Bank:");
        System.out.println("===================================================");

        daftarNasabah.displayList();

        System.out.println("\n \n");
        System.out.println("Nasabah yang di-dequeue:");
        System.out.println("===================================================");
        NasabahBank nasabah1 = daftarNasabah.dequeue();
        if (nasabah1 != null) {
            nasabah1.display();
            System.out.println("===================================================");
        }

        NasabahBank nasabah2 = daftarNasabah.dequeue();
        if (nasabah2 != null) {
            nasabah2.display();
            System.out.println("===================================================");
        }

        System.out.println("\n \n");
        System.out.println("Setelah dua nasabah di-dequeue:");
        System.out.println("===================================================");
        daftarNasabah.displayList();
    }
}