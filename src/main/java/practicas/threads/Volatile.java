package practicas.threads;

public class Volatile {
    private volatile boolean flag = false;  // Variable compartida entre los hilos

    public static void main(String[] args) {
        Volatile example = new Volatile();

        // Thread que cambia el valor de flag
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simula un trabajo de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Writer: Cambiando flag a true");
            example.flag = true;  // Cambio de valor
        });

        // Thread que espera hasta que flag sea true
        Thread reader = new Thread(() -> {
            System.out.println("Reader: Esperando que flag sea true...");
            while (!example.flag) {
                // Espera activa hasta que flag cambie
            }
            System.out.println("Reader: Flag ahora es true, saliendo del bucle.");
        });

        writer.start();
        reader.start();
    }
}
