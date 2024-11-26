package arrays;

public class Factors {
    public static void printFactors(int num) {
        System.out.print("Factores de " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printFactors(28); // Factores de 28: 1 2 4 7 14 28
    }
}
