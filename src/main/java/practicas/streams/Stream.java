package practicas.streams;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        var continentes = Arrays.asList("America","Europa","Asia","Oceania","Africa","Antártida");
        continentes.stream()
                .filter((continente) ->continente.contains("a"))
                .map((continente) -> continente.toUpperCase())
                .forEach(System.out::println)
        ;
    }


}
