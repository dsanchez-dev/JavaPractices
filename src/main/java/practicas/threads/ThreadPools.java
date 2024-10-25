package practicas.threads;

import java.time.Duration;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadPools {

    static class TareaFalsa implements Runnable{

        long amount;
        TimeUnit unit;
        String id;

         public TareaFalsa(long duracion, TimeUnit unit, String id) {
             this.id = id;
             this.amount = duracion;
             this.unit = unit;

         }

        @Override
        public void run() {
            System.out.println("Iniciamos: "+id);
            try {
                long durationInMillis = Duration.of(amount, unit.toChronoUnit()).toMillis();
                Thread.sleep(durationInMillis);
                System.out.println("Terminamos: "+ id );
            }catch (InterruptedException e){
                System.out.println("Interrupida antes de tiempo: "+id);
            }
        }
    }

    public static void main(String[] args) {
        //var service = Executors.newFixedThreadPool(8);
        var service = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) {
            service.submit(new TareaFalsa(3, TimeUnit.SECONDS, "Tarea"+i));
        }
    }
}
