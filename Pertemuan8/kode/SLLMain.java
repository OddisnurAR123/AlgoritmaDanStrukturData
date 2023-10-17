package Pertemuan8.kode;

public class SLLMain {
    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        // Untuk Soal No 2 Tugas
        /*singLL.addFirst("a");
        singLL.print();
        singLL.insertAfter("a", "b");
        singLL.print();
        singLL.insertAfter("b", "c");
        singLL.print();
        singLL.insertAfter("c", "d");
        singLL.print();
        singLL.insertAfter("d", "e");
        singLL.print();*/

        // Untuk Soal No 3 Tugas
        singLL.addFirst("Bahasa");
        singLL.print();
        singLL.insertBefore("Bahasa", "Android");
        singLL.print();
        singLL.insertBefore("Android", "Komputer");
        singLL.print();
        singLL.insertBefore("Komputer", "Basis Data");
        singLL.print();
        singLL.insertBefore("Basis Data", "Matematika");
        singLL.print();
        singLL.insertBefore("Matematika", "Algoritma");
        singLL.print();
        singLL.insertBefore("Algoritma", "Statistika");
        singLL.print();
        singLL.insertBefore("Statistika", "Multimedia");
        singLL.print();

        /*singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        // Menambahkan node 999 sebelum node dengan nilai 760
        singLL.insertBefore(760, 999);
        singLL.print();

        System.out.println("Data pada indeks ke - 1 = " +singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke -  " +singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();*/
    }
}