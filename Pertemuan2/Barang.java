public class Barang {
     String namaBarang;
        int harga; 
        int jumlahBarang;
        
        Barang(){
        }
        
         Barang(String nm, int hr, int jb){
            namaBarang = nm;
            harga = hr;
            jumlahBarang = jb;
        }
         
         void tampilBarang(){
            System.out.println("Nama Barang: "+namaBarang);
            System.out.println("Harga: "+harga);
            System.out.println("Jumlah Barang: "+jumlahBarang);
        }
        
          void tambahBarang(int n){
            jumlahBarang += n;
        }
        
        void kurangiBarang(int n){
            jumlahBarang -= n;
        }
        
        int totalRevenue(int jumlah){
            return jumlah*harga;
        }
    
}
