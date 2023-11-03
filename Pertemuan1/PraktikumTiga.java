public class PraktikumTiga {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9} };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] totalStokBunga = new int[4];
        
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalStokBunga[j] += stokBunga[i][j];
            }
        }

        System.out.println("A. Jumlah Stok Bunga di Seluruh Cabang:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println(jenisBunga[i] + ": " + totalStokBunga[i]);
        }

        int totalPendapatan = 0;
        for (int j = 0; j < stokBunga[0].length; j++) {
            int stokSetelahPengurangan = stokBunga[0][j];
            if (j == 0) {
                stokSetelahPengurangan -= 1;
            } else if (j == 1) {
                stokSetelahPengurangan -= 2;
            } else if (j == 3) {
                stokSetelahPengurangan -= 5;
            }
            totalPendapatan += hargaBunga[j] * stokSetelahPengurangan;
        }
        System.out.println("\nB. Total Pendapatan dari RoyalGarden 1 jika Semua Bunga Terjual Habis:" + totalPendapatan);
    }
}
