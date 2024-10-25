package practicas.threads;

public class Contador {

    private int contador = 0;

    public synchronized void sumarContador() {
        contador++;
    }

    public int getContador(){
        return contador;
    }
}
