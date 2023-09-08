public class Mobil {
    String merekMobil;
        String model;
        
        Mobil(String merekMobil, String model) {
            this.merekMobil = merekMobil;
            this.model = model;
        }
        
        void displayInfo() {
            System.out.println("Merek: " + merekMobil);
            System.out.println("Model: " + model);
        }
    }