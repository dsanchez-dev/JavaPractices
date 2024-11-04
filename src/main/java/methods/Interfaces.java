package methods;

public interface Interfaces {

    void Saludable();

    default void dormir(){
        System.out.println("vacio");
    }

    public static void main(String[] args) {
        Interfaces interfaces = new Interfaces() {
            @Override
            public void Saludable() {
                System.out.println("Saludable");
            }
            @Override
            public void dormir() {
                System.out.println("zzz");
            }
        };
        interfaces.Saludable();
        interfaces.dormir();
    }
}
