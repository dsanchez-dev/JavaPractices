package practicas.tiposDeClases;

import java.util.function.Predicate;

public class UsoDeInterfacesEnLambda {
    public static void main(String[] args) {
        System.out.println("----------------------------Lambda con interfaz----------------------");
        //Predicate sirve para evaluar una condición y devolver un valor booleano: true o false
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println(esPar.test(28));
        System.out.println(esPar.test(31));



    }

}
