package Pertemuan11.Praktikum2;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = { 6,4,8,3,5,7,9,0,0,0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("Traverse In-Order: ");
        bta.traverseInOrder(0);

        // Tugas 5 Memodifikasi
        bta.add(10);
        bta.add(2);
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("Traverse Pre-Order: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("Traverse Post-Order: ");
        bta.traversePostOrder(0);
        System.out.println();
        System.out.println("---------------------------------");
    }
}