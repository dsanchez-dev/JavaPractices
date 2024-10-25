package practicas.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Lock {

    static final ReentrantLock microondas = new ReentrantLock();

   public static void accederAlRecurso(){

       try {
           while (!microondas.tryLock(500, TimeUnit.MILLISECONDS)){
               System.err.println("Acceder al recurso");
           }
       }catch (InterruptedException e){
           e.printStackTrace();
           return;
       }

       System.out.println("Calentando la comida en el microondas");

       try {
           Thread.sleep(2000);
           System.out.println("La comida esta lista");
       } catch (InterruptedException e){
           System.out.println("El microonda es revienta");
           System.exit(1);
       }finally {
           microondas.unlock();
       }

   }

    public static void main(String[] args) {
        Runnable r = () -> accederAlRecurso();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }

}
