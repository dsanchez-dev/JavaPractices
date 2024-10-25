package practicas.heap;

public class CuentaBancaria {
    private int saldo = 1000;

    public synchronized void retirar(int cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println(Thread.currentThread().getName() + " retiró " + cantidad + ". Saldo restante: " + saldo);
        } else {
            System.out.println(Thread.currentThread().getName() + " intentó retirar " + cantidad + " pero no hay suficiente saldo.");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(); // Objeto compartido

        Thread hilo1 = new Thread(() -> cuenta.retirar(500), "Hilo1");
        Thread hilo2 = new Thread(() -> cuenta.retirar(700), "Hilo2");

        hilo1.start();
        hilo2.start();
    }
}
