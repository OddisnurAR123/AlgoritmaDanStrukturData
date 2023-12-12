package Pertemuan16.Praktikum2;

import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        // Mengganti Stack<String> menjadi List<String>
        //List<String> fruits = new List<>();

        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for(String fruit: fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while(!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // Menghilangkan data soal No.2
        //fruits.push("Melon");
        //fruits.push("Durian");

        fruits.push("Melon");
        // Mengganti elemen terakhir dari dari objek fruits menjadi “Strawberry” soal No.5
        fruits.push("Strawberry");

        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });

        System.out.println("");
        for(int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        // Menambahkan 3 buah “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting soal No.6
        fruits.push("Manggo");
        fruits.push("Guava");
        fruits.push("Avocado");
        System.out.println("");
        
        System.out.println("\n================================");
        System.out.println("     DATA SESUDAH DISORTING     ");
        System.out.println("================================");
        Collections.sort(fruits);
        Iterator<String> i = fruits.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
            System.out.println("");
        }
    }
}