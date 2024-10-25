package practicas.threads;

public class MainContandor {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread hilo1 = new Thread(()->{
            for (int i = 0; i < 1; i++) {
                contador.sumarContador();
                System.out.println("Iteracion del hilo 1: " + contador.getContador());
            }
        });

        Thread hilo2 = new Thread(()->{
            for (int i = 0; i < 1; i++) {
                contador.sumarContador();
                System.out.println("Iteracion del hilo 2: " + contador.getContador());
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Iteracion final de los hilos : " + contador.getContador());
    }
}
