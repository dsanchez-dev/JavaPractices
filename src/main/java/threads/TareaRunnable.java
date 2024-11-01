package threads;

public class TareaRunnable implements Runnable{
    String name = "\t\tTarea ejecutada con runnable";

    @Override
    public void run() {
        System.out.println(this.name);
    }
}
