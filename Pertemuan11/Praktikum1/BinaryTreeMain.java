package Pertemuan11.Praktikum1;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.find(5));
        bt.delete(8);
        
        // Tugas 1 menambahkan node dengan cara rekursif
        bt.addRekursif(14);

        bt.traversePreOrder(bt.root);
        System.out.println();

        // Tugas 2 menambahkan method untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree
        System.out.println("---------------------------------");
        int min = bt.findMinimum();
        int max = bt.findMaximum();

        System.out.println("Nilai paling kecil: " + min);
        System.out.println("Nilai paling besar: " + max);
        System.out.println("---------------------------------");

        // Tugas 3 menambahkan method untuk menampilkan data yang ada di leaf
        System.out.println("Data yang ada di leaf:");
        bt.printLeaf(bt.root);
        System.out.println("\n---------------------------------");

        // Tugas 4 menambahkan method untuk menampilkan berapa jumlah leaf yang ada di dalam tree
        int countLeaf = bt.countLeaf(bt.root);
        System.out.println("Jumlah leaf: " + countLeaf);
        System.out.println("\n---------------------------------");
    }
}