package practicas.inner_class;

public class OuterClass {
    int number = 6;

    public void heythere(){
        System.out.println("Hey there");
        System.out.println(" number: " + number);

        //clase local dentro de un method
        class LocalInnerClass {

            String localInnerClassVariable = "Here´s Daniel";
            public void printLocalInnerClassVariable() {
                System.out.println("Hola desde una class local en un method ");
                System.out.println(localInnerClassVariable);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printLocalInnerClassVariable();
}

    public class SecondInnerClass {
        int number = 10;
        public void WhatsUp(){
            System.out.println("Inner Class");
            System.out.println(" number: " + number);
        }
    }

    public static class thirdInnerClass {
        int number = 20;

        public void Mehhod(){
            System.out.println("Third Inner Class");
            System.out.println("number = " + number);
        }
    }
}
