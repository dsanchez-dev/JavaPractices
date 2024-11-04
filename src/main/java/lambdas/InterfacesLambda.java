package lambdas;

import java.util.Comparator;
import java.util.function.*;

public class InterfacesLambda {
    public static void main(String[] args) {

        /**Predicate #1
         * Es una interfaz funcional que recibe un parámetro y devuelve un booleano.
         * El parametro que recibe es el tipo de dato que se va a evaluar.
         * Se utiliza para realizar validaciones.
         */
        Predicate<Integer> num = dato -> dato <10;
        System.out.println(num.test(9));

        /**Consumer #2
         * Es una interfaz funcional que recibe un parámetro y no devuelve nada.
         * Se utiliza para realizar acciones.
         */
        Consumer<String> Mensaje = texto -> System.out.println(texto);
        Mensaje.accept("Hola Daniel");

        /**Function #3
         * Es una interfaz funcional que recibe un parámetro y devuelve un valor.
         * Se utiliza para realizar transformaciones.
         * Usado para convertir un tipo de dato a otro.
         */
        Function<String,Integer> convertir = Tdato -> Integer.parseInt(Tdato);
        //Function<Integer,String> convertirDato = Tdato -> Integer.toString(Tdato);
        System.out.println(convertir.apply("10"));

        /**Supplier #4
         * Es una interfaz funcional que no recibe parámetros y devuelve un valor.
         *Se utiliza para generar valores. Ejemplo: generar un número aleatorio.
         */
        Supplier<Integer> GenerarAleaorio = ()-> Math.random() >= 0.9 ? 1 : 0;
        System.out.println("El numero aleatorio es mayor que 0.9? "+GenerarAleaorio.get());

        /**BiPredicate #5
         *Es una interfaz funcional que recibe dos parámetros y devuelve un booleano.
         *Se utiliza para realizar validaciones. Ejemplo: validar si un número es mayor que otro.
         *Usado para comparar dos valores del mismo tipo.
         */
        BiPredicate<Integer,Integer> comparacion = (a,b) -> a < b;
        System.out.println("A es menor que B? "+comparacion.test(5,2));

        /**BiFunction #6
         *Es una interfaz funcional que recibe dos parámetros y devuelve un valor en base a esos parámetros.
         * Se usa para hacer operaciones con dos valores.
         * Retorna un valor del mismo tipo que los parámetros.
         */
        BiFunction<Integer,Integer,Integer> operacionSuma = (x,y ) -> (x + y );
        System.out.println("La suma de los numeros es: "+operacionSuma.apply(9,9));

        /**UnaryOperator #7
         *Es una interfaz funcional que recibe un parámetro y devuelve un valor del mismo tipo.
         *Se utiliza para realizar operaciones con un solo valor.
         * Ejemplo: elevar al cuadrado.
         */
        UnaryOperator<Integer> cuadrado = x -> x * x;
        System.out.println("El cuadrado de 2 es: "+cuadrado.apply(2));

        /**BinaryOperator #8
         *Es una interfaz funcional que recibe dos parámetros y devuelve un valor del mismo tipo.
         *Se utiliza para realizar operaciones con dos valores.
         * Ejemplo: suma, resta, multiplicación, división.
         */

        BinaryOperator<Integer> Division = (a,b) -> (a / b);
        System.out.println("La división de los números es: "+Division.apply(100,2));

        /**Comparator #9
         * Es una interfaz funcional que recibe dos parámetros y devuelve un entero.
         * Se utiliza para comparar dos valores.
         * Ejemplo: ordenar una lista de números para que se muestren de menor a mayor.
         * Retorna:
         * Un valor negativo si el a es menor que el b.
         * Cero si ambos números son iguales.
         * Un valor positivo si el a es mayor que el b.
         */
        Comparator<Integer> Comparar =(num1,num2)  -> num1.compareTo(num2);
        System.out.println("El número mayor es: "+Comparar.compare(20,30));

        /**Runnable #10
         * Es una interfaz funcional que no recibe parámetros y no devuelve nada.
         * Se utiliza para realizar acciones. Ejemplo: imprimir un mensaje, ejecutar un hilo, etc.
         */
        Runnable hilo = () -> System.out.println("Hola Hilo desde Runnable");
        new Thread(hilo).start();



    }
}
