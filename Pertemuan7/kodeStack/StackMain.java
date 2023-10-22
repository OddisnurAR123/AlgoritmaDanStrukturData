package Pertemuan7.kodeStack;

public class StackMain {
    public static void main (String[] args) {
        Stack stk = new Stack(7);

        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.print();

        stk.push(11);
        stk.push(34);
        
        // Menambahkan data ke stack menggunakan angka 18 dan 40
        stk.push(18);
        stk.push(40);
        stk.pop();
        stk.peek();
        stk.print();
     }
}