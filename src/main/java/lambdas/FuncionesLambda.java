package lambdas;

import java.util.function.*;

public class FuncionesLambda {
    public static void main(String[] args) {

        Runnable runner = ()-> System.out.println("Lambda");
        //Cuando usar Runnable? Cuando se necesita una función que no reciba ni devuelva nada.
        System.out.println("|----------1.-Lambda con runnable-----------|");
        new Thread(runner).start();

        //Cuando usar BiConsumer()? Cuando se necesita una función que reciba dos parámetros y no devuelva nada.
        BiConsumer<String, Integer> printer = (s,i) -> System.out.println(s+" "+i);
        System.out.println("|----------2.-Lambda con BiConsumer-----------|");
        printer.accept("Número:", 10);


        System.out.println("|----------3.-UnaryOperator-----------|");
        //Cuando usar UnaryOperator()? Cuando se necesita una función que reciba un parámetro y devuelva el mismo tipo de dato.
        UnaryOperator<Integer> operacion = numero -> (numero * numero);

        int result = operacion.apply(2);
        System.out.println("Resultado: " + result);


        System.out.println("|----------3.-BinaryOperator-----------|");
        //Cuando usar BinaryOperator()? Cuando se necesita una función que reciba dos parámetros y devuelva el mismo tipo de dato. A diferencia UnaryOperator, que recibe un solo parámetro.
        BinaryOperator<Integer> suma = (a,b) -> (a + b);

        int resultado = suma.apply(1,1);
        System.out.println("resultado = " + resultado);


        System.out.println("|----------4.-ToIntFunction-----------|");
        //Cuando usar ToIntFunction()? Cuando se necesita una función que reciba un parámetro y devuelva un entero.
        ToIntFunction<String> tamanoFuction = (s) -> s.length();

        int tamano = tamanoFuction.applyAsInt("Daniel");
        System.out.println("tamano = " + tamano);


        System.out.println("|----------5.-ToDoubleFunction®-----------|");
        //Cuando usar ToDoubleFunction()? Cuando se necesita una función que reciba un parámetro y devuelva un double.
        ToDoubleFunction<String> funciondoble = numero -> Double.parseDouble(numero);

        double resultadoDoble = funciondoble.applyAsDouble("2.1");
        System.out.println("Resultado: " + resultadoDoble);


        System.out.println("|----------6.-ToLongFunction-----------|");
        //Cuando usar ToLongFunction()? Cuando se necesita una función que reciba un parámetro y devuelva un long.
        ToLongFunction<String> longFunction = s -> Long.parseLong(s);

        long resultadoLong = longFunction.applyAsLong("123456789");
        System.out.println("resultado = " + resultadoLong);


        System.out.println("|----------7.-IntPredicate-----------|");
        //Cuando usar IntPredicate()? Cuando se necesita una función que reciba un entero y devuelva un booleano.
        IntPredicate verificacion = dato -> dato > 10;

        boolean resultadoBoolean = verificacion.test(20);
        System.out.println("resultadoBoolean = " + resultadoBoolean);






    }
}
