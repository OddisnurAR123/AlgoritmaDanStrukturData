public class Tugas1 {
    public double[] array;

    
    public Tugas1(double arrayNilai[]) {
        array = new double[arrayNilai.length];
        int i = 0;
        while (i < array.length) {
            array[i] = arrayNilai[i];
            i++;
        }
    }

    public int cari (double diketahui) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (diketahui == array[i]) {
                index = i;
                break;
            
            } else {
                if (diketahui < array [i]){
                    break;
                }
            }
            
        }
        return index;

    }

    public void tampilkan() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}
