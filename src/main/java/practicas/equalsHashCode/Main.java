package practicas.equalsHashCode;

public class Main {
    public static void main(String[] args) {
        EqualsHashCode person1 = new EqualsHashCode("Daniel", 30);
        EqualsHashCode person2 = new EqualsHashCode("Daniel", 30);

        System.out.println("Estado de los objectos:");

        if(person1.equals(person2)){
            System.out.println("Los objetos son iguales");
            System.out.println("La persona (1) es igual a persona (2): "+person1.equals(person2));
        }else{
            System.out.println("Los objetos son diferentes");
        }
    }
}
