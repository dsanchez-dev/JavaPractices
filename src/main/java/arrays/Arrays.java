package arrays;

public class Arrays {
    public static void main(String[] args) {
        int x = 10;
        modify(x);
        System.out.println(x);
    }

    public static void modify(int x) {
        x = x + 5;
        System.out.println("x = " + x);
    }
}
