package Quiz;
import java.util.ArrayList;
import java.util.List;
public class Transaction {
    private List<Item> items;

    public Transaction() {
        items = new ArrayList<>();
    }

    public void add_item(String itemName, int quantity, int price) {
        Item newItem = new Item(itemName, quantity, price);
        items.add(newItem);
    }

    public void update_item_name(String itemName, String updatedName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.setName(updatedName);
                break;
            }
        }
    }

    public void update_item_qty(String itemName, int updatedQty) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.setQuantity(updatedQty);
                break;
            }
        }
    }

    public void update_item_price(String itemName, int updatedPrice) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.setPrice(updatedPrice);
                break;
            }
        }
    }

    public void delete_item(String itemName) {
        Item itemToRemove = null;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            items.remove(itemToRemove);
        }
    }

    public void reset_transaction() {
        items.clear();
    }

    public void check_order() {
        boolean hasError = false;
        for (Item item : items) {
            if (item.getName().isEmpty() || item.getQuantity() <= 0 || item.getPrice() <= 0) {
                hasError = true;
                break;
            }
        }

        if (hasError) {
            System.out.println("Terdapat kesalahan input data");
        } else {
            System.out.println("Pemesanan sudah benar");
        }
    }

    public int total_price() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getQuantity() * item.getPrice();
        }
    
        double discount = 0.0; // Inisialisasi diskon dengan nilai awal 0
    
        if (totalPrice > 500000) {
            discount = 0.1; // Diskon 10%
        } else if (totalPrice > 300000) {
            discount = 0.08; // Diskon 8%
        } else if (totalPrice > 200000) {
            discount = 0.05; // Diskon 5%
        }
    
        int discountedPrice = (int) (totalPrice - (totalPrice * discount));
        return discountedPrice;
    }    

    public void print_transaction() {
        System.out.println("Item\t\tJumlah item\tHarga/item\tHarga total");
        for (Item item : items) {
            System.out.println(item.getName() + "\t\t" + item.getQuantity() + "\t\t" + item.getPrice()
                    + "\t\t" + item.getQuantity() * item.getPrice());
        }
    }

    class Item {
        private String name;
        private int quantity;
        private int price;

        public Item(String name, int quantity, int price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
