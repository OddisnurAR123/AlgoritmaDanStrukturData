public class PraktikumEmpatA {
    public static void main(String[] args) {
        int n = 9;
        System.out.print("Deret Fibonacci: ");
        int prev1 = 0;
        int prev2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(prev1 + " ");
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
    }
}
