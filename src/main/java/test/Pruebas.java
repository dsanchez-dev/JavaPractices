package test;

import java.util.Arrays;

public class Pruebas {
    
    public static void main(String[] args) {
        int numero = 5;
        int[] datos = {1,8,3,2,5,7,9,6,4};

        comprobarFactores(10);

        datosModificados(numero);

        verificarParImpar(numero);

        tablasDeMultiplicar(numero = 2);

        ordenamientoDeBurbuja(datos);

    }

    //numero divisibles de un numero
    public static void comprobarFactores(int numero) {
        System.out.println("Factores de: " + numero + "!");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println("Si "+i + " es factor de " + numero + "!");
            }else {
                System.out.println(i +" no es factor de " + numero + "!");
            }
        }
    }

    //modificacion de datos
    public static void datosModificados(int x){
        int resultado = 0;
        System.out.println("\n Datos en el metodo.");
        System.out.println("El numero recibido fue: "+x);
        resultado = x + 1;
        System.out.println("El numero cambio a: " + resultado);
    }

    public static void verificarParImpar(int numero){
        System.out.println("\nEl numero a verificar es: " + numero);
        if(numero %2 == 0){
            System.out.println("El numero es: "+ numero +" es par");
        }else{
            System.out.println("El numero es: "+ numero +" es impar");
        }
    }

    public static void tablasDeMultiplicar(int numero){
        System.out.println("\nTabla de multiplicar del: " +numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i +" = " +(numero * i));
        }
    }

    public static void ordenamientoDeBurbuja(int[] arreglo){
        System.out.println("\nOrdenamiento por burbuja");

        int tamanoDeArreglo = arreglo.length;

        for (int i = 0; i < tamanoDeArreglo - 1; i++) {
            System.out.println("iteracion: "+ i +": "+Arrays.toString(arreglo));
            for (int j = 0; j < tamanoDeArreglo - 1; j++) {
                if (arreglo[j]>arreglo[j+1]){
                    //intercambio de posiciones
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
        System.out.println("\nEl arreglo completo es:\n"+Arrays.toString(arreglo));
    }

}