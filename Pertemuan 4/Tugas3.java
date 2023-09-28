public class Tugas3 {
    static double[] array;

    public static double mencariNilaiTerbesar() {
        double nilaiTerbesar = array[0];

        int i = 1;
        while (i < array.length) {
            if (array[i] > nilaiTerbesar) {
                nilaiTerbesar = array[i];
            }
            i++;
        }
        return nilaiTerbesar;
    }
}