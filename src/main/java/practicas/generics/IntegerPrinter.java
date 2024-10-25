package practicas.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerPrinter {
    public static void main(String[] args) {
        GenericPrinter<Integer> printer = new GenericPrinter<>(24);
        printer.print();

        GenericPrinter<Double> printer2 = new GenericPrinter<>(24.0);
        printer2.print();



    }
}
