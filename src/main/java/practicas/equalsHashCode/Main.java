package practicas.equalsHashCode;

public class Main {
    public static void main(String[] args) {
        EqualsHashCode person1 = new EqualsHashCode("Daniel", 30);
        System.out.println("La referencia del objecto de persona 1 es: "+person1.hashCode());
        EqualsHashCode person2 = new EqualsHashCode("Daniel", 30);
        System.out.println("La referencia del objecto de persona 2 es: "+person2.hashCode());



        System.out.println("\n------------Estado de los objectos------------\n");

        if(person1.equals(person2)){
            System.out.println("Aviso: Los objetos son iguales!\n");
            System.out.println("La persona (1) es igual a persona (2): "+person1.equals(person2)+"" +
                    "\nLa referencia de persona (1) es: "+person1.hashCode()+"" +" La referencia de persona (2) es: "+person2.hashCode());
        }else{
            System.out.println("Aviso: Los objetos son diferentes!");
        }

        System.out.println("\n |--------------Uso de Equals()----------|");
        System.out.println("    --------------String 1--------------\n");
        String mensaje1 = new String();
        String mensaje2 = new String();

        if(mensaje1.equals(mensaje2)){
            System.out.println("La referencia en memoria de ambos objectos es iguales!");
        }else {
            System.out.println("La referencia en memoria de ambos objectos es diferentes!");
        }

        System.out.println("\n |--------------Uso de ==()--------------|");
        System.out.println("   --------------Strings 1--------------\n");
        String mensajealterno1 = "Hola";
        String mensajealterno2 = "Hola";

        if(mensajealterno1 == mensajealterno2){
            System.out.println("El contenido de las cadenas es iguales!");
        }else {
            System.out.println("El contenido de las cadenas es diferentes!");
        }


    }
}
