package Pertemuan5;

public class MainTugas3 {
    public static void main(String[] args) {

        double[] array = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};
        double nilaiTerbesar = array[0];
        int[] indeksTerbesar = new int[array.length];
        int arrayTerbesar = 0;

        System.out.println("=========================================================================");
        System.out.println("Deret Nilai: ");

        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        System.out.print("\n");

        i = 1;
        while (i < array.length) {
            if (array[i] > nilaiTerbesar) {
                nilaiTerbesar = array[i];
                indeksTerbesar[0] = i;
                arrayTerbesar = 1;
            } else if (array[i] == nilaiTerbesar) {
                indeksTerbesar[arrayTerbesar] = i;
                arrayTerbesar++;
            }
            i++;
        }

        System.out.println("=========================================================================");
        System.out.print("Array yang Nilainya terbesar adalah " + nilaiTerbesar + " yang berada di posisi index ke-");
        i = 0;
        while (i < arrayTerbesar) {
            System.out.print(indeksTerbesar[i]);
            if (i < arrayTerbesar - 1) {
                System.out.print(" dan ke- ");
            }
            i++;
        }
    }
}
