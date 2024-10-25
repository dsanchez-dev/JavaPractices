package practicas.threads;

public class UsoDeLosHilos {
    public static void main(String[] args) throws InterruptedException {

        HiloUno nuevoHilo = new HiloUno();
        nuevoHilo.start();

        nuevoHilo.interrupt();

        System.out.println("Hola");
    }
}
