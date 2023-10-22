package Pertemuan7.kodeStack;

public class Tugas2{
    int maxSize;
    String[] stackArray;
    int top;

    public Tugas2(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(String struk) {
        if (!isFull()) {
            stackArray[++top] = struk;
            System.out.println("Struk Belanja ditambahkan ke stack");
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String struk = stackArray[top];
            top--;
            return struk;
        } else {
            System.out.println("Stack struk belanja kosong");
            return null;
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack struk belanja kosong");
            return null;
        }
    }

    public void print() {
        System.out.println("\nDaftar Struk Belanja Dewi:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Semua struk belanja telah dihapus");
        } else {
            System.out.println("Stack struk belanja kosong");
        }
    }
}