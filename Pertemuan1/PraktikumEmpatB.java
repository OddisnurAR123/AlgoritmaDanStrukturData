package Pertemuan1;

public class PraktikumEmpatB {
    public static void main(String[] args) {
        int n = 9;
        System.out.print("Deret Fibonacci: ");
            
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}