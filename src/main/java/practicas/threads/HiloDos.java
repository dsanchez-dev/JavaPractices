package practicas.threads;

public class HiloDos implements Runnable{
    @Override
    public void run() {
        System.out.println("Hola desde el hilo 2");
    }
}
