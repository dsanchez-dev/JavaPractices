package practicas.tiposDeClases;

public class ClaseExterna {
    private String mensaje = "Hola desde clase anindada";

    public class ClaseAnnidada{
        public void imprimirMensaje(){
            Runnable runnable  = () -> System.out.println(mensaje);
            runnable.run();
        }
    }

    //Clase estatica: solo se puede usar mediante una instancia de la claseExterna y no puede acceder a los atributos de la clase externa
    public static class ClaseAnidadaEstatica{
        public void imprimirMensajeEstatico(){
            Runnable runnable = () -> System.out.println("Hola desde clase anidada estatica");
            runnable.run();
        }
    }

    public static  class ClaseAnidadaEstatica2{
        private void imprimirUnNumero(){
            Runnable runnable = () -> System.out.println("Número: 21");
            runnable.run();
        }
    }

    public static void main(String[] args) {

        ClaseExterna claseAnidada = new ClaseExterna();
        System.out.println(claseAnidada.mensaje);

        ClaseExterna.ClaseAnidadaEstatica claseAnidadaEstatica = new ClaseAnidadaEstatica();
        claseAnidadaEstatica.imprimirMensajeEstatico();

        ClaseExterna.ClaseAnidadaEstatica2 claseAnidadaEstatica2 = new ClaseAnidadaEstatica2();
        claseAnidadaEstatica2.imprimirUnNumero();

        ClaseExterna.ClaseAnidadaEstatica2 nueva = new ClaseAnidadaEstatica2();
        nueva.imprimirUnNumero();

    }
}
//Por que las lambdas no se pueden usar en clases anidadas?