package methods;

public abstract class Abstractos {

    public abstract void imprimirMensaje();

    public static void main(String[] args) {

        Abstractos abstracto = new Abstractos() {
            @Override
            public void imprimirMensaje() {
                System.out.println("Mensaje");
            }
        };

        abstracto.imprimirMensaje();
    }
}
