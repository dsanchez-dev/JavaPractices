package practicas.tiposDeClases;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main  {
    public static void main(String[] args) {

        System.out.println("----------------------------Lambda string----------------------");
        ImprimirMensaje miMensaje = (hola) -> System.out.println("Hola con lambda");
        miMensaje.mensaje(miMensaje.toString());


        Thread hilo = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("---------------------------Hilo------------------------------");
                System.out.println("Hola desde el hilo xD");
            }
        });
        hilo.start();


        int numero = 10;
        Suma suma = (a, b) -> a + numero;
        System.out.println(suma.suma(5, 1));

        System.out.println("----------------------------Clase record----------------------");
        Celular cel = new Celular("Samsung",  2021);
        System.out.println("Marca: "+cel.marca());
        System.out.println("Precio: "+cel.precio());


        System.out.println("-------------------------Predicate lambda----------------------");
        int num = 5;
        //Predicate: Recibe un argumento y devuelve un valor booleano
        Predicate<Integer> esMayorQueCinco = verificacion -> verificacion > num;
        System.out.println(esMayorQueCinco.test(10));
        System.out.println(esMayorQueCinco.test(4));

        System.out.println("-------------------------Predicate clase anonima----------------------");
        Predicate<Integer> esMayorQueCinco2 = new Predicate<Integer>(){
            @Override
            public boolean test(Integer dato) {
                return dato > num;
            }
        };
        System.out.println(esMayorQueCinco2.test(10));

        System.out.println("-------------------------Lambda con Function----------------------");
        Function<String,String> UpperCase = (cadena) -> cadena.toLowerCase();
        System.out.println(UpperCase.apply("Hola Daniel"));

        /*System.out.println("-------------------------Lambda con AndThen----------------------");
        Function<Integer, Integer> multiplicarPorDos = x -> x * 2;
        Function<Integer, Integer> sumarTres = x -> x + 3;
        Function<Integer, Integer> multiplicarLuegoSumar = multiplicarPorDos.andThen(sumarTres);

        System.out.println(multiplicarLuegoSumar.apply(5)); // Salida: 13 (5 * 2 + 3)*/

        System.out.println("-------------------------Lambda con compose----------------------");
        Function<Integer, Integer> multiplicarPorDos = x -> x * 2;
        Function<Integer, Integer> sumarTres = x -> x + 3;
        Function<Integer, Integer> sumarLuegoMultiplicar = multiplicarPorDos.compose(sumarTres);
        System.out.println(sumarLuegoMultiplicar.apply(5)); // Salida: 16 ((5 + 3) * 2)


        System.out.println("-------------------------Lambda runnable----------------------");

        Runnable runner = () -> System.out.println("Hola con runnable en lambda ");
        runner.run();

        System.out.println("-------------------------Lambda con for each version larga----------------------");
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> lista = List.of(numeros);// se debe hacer una conversion previa para que usarse con un foreach.
        lista.forEach(numerosLista -> System.out.println(numerosLista));
        System.out.println("-------------------------Lambda con for each version corta----------------------");
        lista.forEach(System.out::println);


    }
}
