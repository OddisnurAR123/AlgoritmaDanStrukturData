public class MobilMain {
    public static void main(String[] args) {
        Mobil[][] dataMobil = new Mobil[2][2];
        
        dataMobil[0][0] = new Mobil("Toyota", "Camry");
        dataMobil[0][1] = new Mobil("Honda", "Civic");
        dataMobil[1][0] = new Mobil("Ford", "Focus");
        dataMobil[1][1] = new Mobil("Chevrolet", "Malibu");
        

        for (int i = 0; i < dataMobil.length; i++) {
            for (int j = 0; j < dataMobil[i].length; j++) {
                System.out.println("Data Mobil [" + i + "][" + j + "]:");
                dataMobil[i][j].displayInfo();
                System.out.println();
            }
        }
    }
}