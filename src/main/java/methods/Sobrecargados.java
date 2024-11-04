package methods;

public class Sobrecargados {

    public void dato(String mensaje){
        System.out.println(mensaje);
    }

    public void dato(int numero){
        System.out.println(numero);
    }

    public static void main(String[] args) {

        Sobrecargados sobrecargados = new Sobrecargados();
        sobrecargados.dato("Mensaje");
        sobrecargados.dato(1);
    }
}
