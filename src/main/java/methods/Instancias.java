package methods;

public class Instancias {

    public void imprimirMensaje(){
        System.out.println("Mensaje");
    }

    public static void main(String[] args) {

        Instancias tipoInstancia = new Instancias();
        tipoInstancia.imprimirMensaje();
    }
}
