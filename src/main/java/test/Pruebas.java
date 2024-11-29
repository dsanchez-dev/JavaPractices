package test;

import java.util.Arrays;

public class Pruebas {
    
    public static void main(String[] args) {
        int numero = 5;
        int[] datos = {1,2,3,4,5,6,7,8,9,0};

        /*
        //numero divisibles de un numero
        comprobarFactores(numero);
        //modifcar un dato
        datosModificados(numero);
        //verficar si un numero es par o impar
        verificarParImpar(numero);
        //tabla de multiplicar
        tablasDeMultiplicar(numero);
        //método de ordenamiento
        ordenamientoDeBurbuja(datos);
        //secuencia fibonacci
        fibonnaci(10,0,1);

        //calcular numero max y min
        numeroMaxMin(datos);

        //verificar si una oracion es palindromo
        System.out.println(oracionPalindromo("AnitaLavaLaTina"));
        System.out.println(oracionPalindromo("lol"));
        System.out.println(oracionPalindromo("Hola"));

        //verificar si un numero es primo
        System.out.println(esPrimo(7));//true);
        System.out.println(esPrimo(9));//false
        */

        invertirOrdenDeArreglo(datos);
        System.out.println(Arrays.toString(datos));

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
        int resultado;
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

    //secuencia fibonnaci
    public static void fibonnaci(int limite, int a, int b){

        for (int i = 0; i < limite; i++) {
            System.out.println("\nFibonacci: " + a + ", " + b);
            int c = a + b;
            System.out.println("resultado= "+c);
            a = b;
            b = c;
        }
    }

    //maximo y minimo
    public static void numeroMaxMin(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int numero : arreglo) {
            if (numero > max) {
                max = numero;
            }
            if (numero >= 0 && numero < min) {
                min = numero;
            }
        }

        //salida de datos
        if (min == Integer.MAX_VALUE){
            System.out.println("\nTodos los numeros del arreglo son negativos");
        }else {
            System.out.println("\nEl número máximo es: " + max + " y el número menor es: " + min);
        }
    }

    public static boolean oracionPalindromo(String str){
        String inversa = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(inversa);
    }

    public static boolean esPrimo(int numero){
        if(numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero %i == 0) return false;
        }
        return true;
    }

    public static void invertirOrdenDeArreglo(int[] arreglo){
        int numeros = arreglo.length;

        for (int i = 0; i < numeros / 2; i++) {
            int temporal = arreglo[i];
            arreglo[i] = arreglo[numeros - i - 1];
            arreglo[numeros - i -1 ] = temporal;
        }

    }

}