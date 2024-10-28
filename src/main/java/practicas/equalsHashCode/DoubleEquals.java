package practicas.equalsHashCode;

public class DoubleEquals {
    public static void main(String[] args) {
        System.out.println("\n |--------------Uso de ==()--------------|");
        System.out.println("\n --------------Strings 1--------------\n");
        String mensajealterno1 = new String();
        String mensajealterno2 = new String();

        if(mensajealterno1.equals(mensajealterno2)){
            System.out.println("La cadenas son iguales!");
        }else {
            System.out.println("Las cadenas son diferentes!");
        }

    }
}
