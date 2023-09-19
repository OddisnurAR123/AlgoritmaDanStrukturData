package Quiz;
import java.util.Scanner;

public class MainTransaction {
    public static void main(String[] args) {
        Scanner oddis = new Scanner(System.in);
        Transaction trnsct_123 = new Transaction();

        boolean isShopping = true;

        while (isShopping) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Update Nama Item");
            System.out.println("3. Update Jumlah Item");
            System.out.println("4. Update Harga Item");
            System.out.println("5. Hapus Item");
            System.out.println("6. Reset Transaksi");
            System.out.println("7. Check Order");
            System.out.println("8. Print Transaksi");
            System.out.println("9. Total Belanja");
            System.out.println("10. Selesai Belanja");
            System.out.print("Pilih menu (1-10): ");

            int menuChoice = oddis.nextInt();
            oddis.nextLine(); // Membuang newline

            switch (menuChoice) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String itemName = oddis.nextLine();
                    System.out.print("Masukkan jumlah item: ");
                    int quantity = oddis.nextInt();
                    System.out.print("Masukkan harga per item: ");
                    int price = oddis.nextInt();
                    trnsct_123.add_item(itemName, quantity, price);
                    break;
                case 2:
                    System.out.print("Masukkan nama item yang ingin diupdate: ");
                    String oldName = oddis.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String newName = oddis.nextLine();
                    trnsct_123.update_item_name(oldName, newName);
                    break;
                case 3:
                    System.out.print("Masukkan nama item yang ingin diupdate jumlahnya: ");
                    String itemNameQty = oddis.nextLine();
                    System.out.print("Masukkan jumlah baru: ");
                    int newQty = oddis.nextInt();
                    trnsct_123.update_item_qty(itemNameQty, newQty);
                    break;
                case 4:
                    System.out.print("Masukkan nama item yang ingin diupdate harganya: ");
                    String itemNamePrice = oddis.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    int newPrice = oddis.nextInt();
                    trnsct_123.update_item_price(itemNamePrice, newPrice);
                    break;
                case 5:
                    System.out.print("Masukkan nama item yang ingin dihapus: ");
                    String itemToDelete = oddis.nextLine();
                    trnsct_123.delete_item(itemToDelete);
                    break;
                case 6:
                    trnsct_123.reset_transaction();
                    System.out.println("Transaksi telah direset.");
                    break;
                case 7:
                    trnsct_123.check_order();
                    break;
                case 8:
                    trnsct_123.print_transaction();
                    break;
                case 9:
                    int totalPrice = trnsct_123.total_price();
                    System.out.println("Total belanja: " + totalPrice);
                    break;
                case 10:
                    isShopping = false;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        }
    }
}

