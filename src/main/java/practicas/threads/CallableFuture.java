package practicas.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> tareaAsincronima = ()->{
          Thread.sleep(200);
          return 42;
        };

        Future<Integer> future = executor.submit(tareaAsincronima);

        System.out.println("La tarea se esta ejecutando en segundo plano");

        Integer valor = future.get();
        System.out.println("El resultado de la tarea es: " + valor);

        executor.shutdown();
    }
}
