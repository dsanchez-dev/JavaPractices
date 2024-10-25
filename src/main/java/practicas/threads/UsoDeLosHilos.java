package practicas.threads;

public class UsoDeLosHilos {
    public static void main(String[] args) {

        System.out.println("Hilos de forma larga");
        HiloUno nuevoHilo = new HiloUno();
        HiloDos nuevoHilo2 = new HiloDos();

        nuevoHilo.start();
        System.out.println("-------Hola-------");
        nuevoHilo2.run();



        Thread hilo1 = new Thread(new HiloUno());
        Thread hilo2 = new Thread(new HiloDos());
        System.out.println("");
        System.out.println("Hilos de forma corta");
        hilo1.start();
        hilo2.start();

    }
}
