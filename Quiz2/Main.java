package Quiz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oddis = new Scanner(System.in);
        
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.print("Masukkan data Pertama: ");
        String data = oddis.nextLine();
        
        System.out.print("Masukkan data Kedua: ");
        String dataa = oddis.nextLine();

        System.out.print("Masukkan data Ketiga: ");
        String dataaa = oddis.nextLine();
 
        list.addFirst(data);
        list.addLast(dataa);
        list.addLast(dataaa);
        list.addLast(data);

        System.out.println("==========================");
        System.out.println("Isi Linked List: ");
        System.out.println("==========================");

        list.print();

    }        
}