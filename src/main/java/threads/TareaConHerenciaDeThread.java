package threads;

import java.util.Objects;

public class TareaConHerenciaDeThread extends Thread{
    String nametask = "Tarea ejecutada con herencia de Thread";

    public TareaConHerenciaDeThread(){
    }

    public void setNametask(String nametask) {
        this.nametask = nametask;
    }


    @Override
    public void run(){
        System.out.println("\tString: "+this.nametask);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TareaConHerenciaDeThread that = (TareaConHerenciaDeThread) o;
        return Objects.equals(nametask, that.nametask);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nametask);
    }
}
