package practicas.threads;

public class HiloUno extends Thread {

    @Override
    public void run(){
        for(;;){
            int i = 0;
            boolean interrumpido = isInterrupted();
            if(interrumpido){
                System.out.println("El hilo fue interrumpido");
                return;
            }
            if (++i == 10){
                System.out.println("Hilo uno siendo interrumpido");
            }
        }
    }

}
