package methods;

public class Estaticos {

    public Estaticos(){
        System.out.println("Constructor Vacio");
    }
     public static int numero (int a){
        return a;
    }

    public static void main(String[] args) {
        System.out.println(numero(1));
    }
}
