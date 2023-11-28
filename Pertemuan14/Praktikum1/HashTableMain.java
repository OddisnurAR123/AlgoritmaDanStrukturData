package Pertemuan14.Praktikum1;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable table = new HashTable();

        System.out.println( table.hash("apple") );
        System.out.println( table.hash("banana") );
        System.out.println( table.hash("cherry") );
        System.out.println( table.hash("date") );
        System.out.println( table.hash("eggplant") );

        // Menambahkan data
        table.set("apple", 100);
        table.set("banana", 50);
        table.set("cherry", 300);
        table.set("date", 500);
        table.set("eggplant", 10);

        // Mencetak isi dari hash table setelah menambahkan data
        table.printTable();

        // Menambahkan kode untuk memastikan apakah methode get() berjalan dengan baik.
        System.out.println("\nApple:");
        System.out.println( table.get("apple") );

        System.out.println("\nDate:");
        System.out.println( table.get("date") );

        // Menambahkan kode untuk memastikan apakah method keys() dapat berkeja dengan baik.
        System.out.println( table.keys() );

        // Menghapus data dengan method remove() berdasarkan key, disini saya mencoba menghapus key: eggplant
        table.remove("eggplant");

        // Kemudian saya mencetak kembali isi dari hash table setelah penghapusan
        System.out.println("\n=====================================");
        System.out.println("Hash table setelah penghapusan:");
        System.out.println("=====================================");
        table.printTable();

        // Disini saya juga mencoba memanggil kembali method keys()
        System.out.println( table.keys() );
    }
}