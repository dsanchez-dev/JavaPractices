package methods;

public class Sincronizados {

    public synchronized void contador() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            System.out.println("Numrero: "+ i);
        }
        System.out.println("Fin del hilo!\n");
        Thread.sleep(1000);
    }

        public static void main(String[] args) throws InterruptedException {

            Sincronizados hilo1 = new Sincronizados();
            System.out.println("Hilo 1");
            hilo1.contador();

            Sincronizados hilo2 = new Sincronizados();
            System.out.println("Hilo 2");
            hilo2.contador();

            Sincronizados hilo3 = new Sincronizados();
            System.out.println("Hilo 3");
            hilo3.contador();

            Sincronizados hilo4 = new Sincronizados();
            System.out.println("Hilo 4");
            hilo4.contador();
        }
}