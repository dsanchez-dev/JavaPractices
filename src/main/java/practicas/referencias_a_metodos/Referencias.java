package practicas.referencias_a_metodos;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Referencias {
    public static void main(String[] args) {

        Function<String,Long> lambda = (str) -> Long.parseLong(str);
        System.out.println(lambda.apply("123"));
        Function<String, Long> lambda2 = Long::parseLong;
        System.out.println(lambda2.apply("123"));


        Supplier<Random> generarRandom = () -> new Random();
        System.out.println(generarRandom.get());
        Supplier<Random> generarRandom2 = Random::new;
        System.out.println(generarRandom2.get());
        Function<Long, Random> generarRandom3 = Random::new;
        System.out.println(generarRandom3.apply(2L));


        String cadena = "hola dani";
        Supplier<Integer> longitud = () -> cadena.length();
        System.out.println(longitud.get());
        Supplier<Integer> longitue = cadena::length;
        System.out.println(longitue.get());

        Predicate<String> asdsafdt = (str) -> cadena.startsWith(str);
        System.out.println(asdsafdt.test("hola"));
        Predicate<String> assdasd = cadena::startsWith;
        System.out.println(assdasd.test("hola"));

        //(str) -> str.length()
        Function<String,Integer> function1 = (str) -> str.length();
        System.out.println(function1.apply("hola"));

        //(str,n) -> str.length
        BiFunction<String,Integer,String> biFunction = String::repeat;
        System.out.println(biFunction.apply("hola \n", 2));


    }
}
