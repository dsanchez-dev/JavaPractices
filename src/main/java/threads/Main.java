package threads;

public class Main {
    public static void main(String[] args) {

        System.out.println("|------------Tarea con runnable------------|");
        TareaRunnable tareaRunnable = new TareaRunnable();
        Thread thread = (new Thread(tareaRunnable));
        thread.start();


        TareaConHerenciaDeThread tareaConHerenciaDeThread = new TareaConHerenciaDeThread();
        System.out.println("\n|------------------Tarea con Thread------------------|");
        tareaConHerenciaDeThread.start();

    }
}
