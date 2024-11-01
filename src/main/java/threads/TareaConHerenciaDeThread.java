package threads;

import java.util.Objects;

public class TareaConHerenciaDeThread extends Thread{
    String nametask = "Tarea ejecutada con herencia de Thread";
    int number =3;

    public TareaConHerenciaDeThread(){
    }

    public void setNametask(String nametask) {
        this.nametask = nametask;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run(){
        System.out.println("\tString: "+this.nametask);
        System.out.println("\tNumber: "+this.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TareaConHerenciaDeThread that = (TareaConHerenciaDeThread) o;
        return number == that.number && Objects.equals(nametask, that.nametask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nametask, number);
    }
}
