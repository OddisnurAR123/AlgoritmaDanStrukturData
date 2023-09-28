import java.util.Scanner;

public class PencarianMain {
    public static void main(String[] args) {
        Scanner ods = new Scanner(System.in);
        double[] data={2.7, 2.9, 3.04, 3.12, 3.54, 3.87, 3.9};
        OrderedSearch os= new OrderedSearch(data);
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        System.out.println("Masukkan data array yang ingin dicari: ");
        double key = ods.nextDouble();
        int index = os.cari(key);
        if(index!=-1){
            System.out.println("Data " + key + " pada index " + index );
        }else {
            System.out.println("Data " + key + "tidak ditemukan");
        }
    }
}