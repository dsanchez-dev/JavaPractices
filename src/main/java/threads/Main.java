package threads;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("|------------Tarea con runnable------------|");
        TareaRunnable tareaRunnable = new TareaRunnable();
        Thread thread = (new Thread(tareaRunnable));
        thread.start();

        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("\t\tTarea ejecutada con runnable");
            }
        });
        System.out.println("\n|------------------Tarea con un pase de lambda de new Runnable------------------|");
        run.start();

        TareaConHerenciaDeThread tareaConHerenciaDeThread = new TareaConHerenciaDeThread();
        System.out.println("\n|------------------Tarea con Thread------------------|");
        tareaConHerenciaDeThread.start();


        String[] names ={"Daniel","Fernando","Adam"};

        Arrays.sort(names,(a,b) -> a.compareToIgnoreCase(b));
        System.out.println("\n|------------------Uso de Comparator-----------------|");
        System.out.println("\t\t\t\t"+Arrays.toString(names));

    }
}
