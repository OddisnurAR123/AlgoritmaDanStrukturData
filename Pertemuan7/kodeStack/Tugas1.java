package Pertemuan7.kodeStack;

public class Tugas1 {
    int size;
    int top;
    char data[];

    public Tugas1(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public boolean IsFull() {
        return top == size - 1;
    }

    public void push(char dt) {
        if (!IsFull()) {
            data[++top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public char pop() {
        if (!IsEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack masih kosong");
            return ' ';
        }
    }

    public String reverseSentence(String sentence) {
        int length = sentence.length();

        for (int i = 0; i < length; i++) {
            push(sentence.charAt(i));
        }

        char[] reversedChars = new char[length];
        int index = 0;

        while (!IsEmpty()) {
            reversedChars[index] = pop();
            index++;
        }

        return new String(reversedChars);
    }
}