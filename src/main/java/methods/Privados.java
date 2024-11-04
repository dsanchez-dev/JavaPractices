package methods;

public class Privados {

    private void imprimirMensaje(){
        System.out.println("Metodo Privado");
    }

    public static void main(String[] args) {

        Privados metodoPrivado = new Privados();
        metodoPrivado.imprimirMensaje();
    }
}