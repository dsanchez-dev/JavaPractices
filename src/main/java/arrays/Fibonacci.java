package arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número de términos a imprimir
        int a = 0, b = 1;

        System.out.print("Fibonacci: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
