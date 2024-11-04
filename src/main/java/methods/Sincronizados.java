package methods;

public class Sincronizados {

    public synchronized void contador(){
        for (int i = 0; i < 4; i++) {
            System.out.println("Numrero: "+ i);
        }
    }

    public static void main(String[] args) {

        Sincronizados hilo1 = new Sincronizados();
        System.out.println("Hilo 1");
        hilo1.contador();

        Sincronizados hilo2 = new Sincronizados();
        System.out.println("Hilo 2");
        hilo2.contador();
    }
}
