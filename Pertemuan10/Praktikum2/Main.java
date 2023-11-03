<<<<<<< HEAD
package Pertemuan10.Praktikum2;

public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================="); 
    }
=======
package Pertemuan10.Praktikum2;

public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================="); 
    }
>>>>>>> 389cf7632c15beefa564135dfca86c8e9bdd1782
}