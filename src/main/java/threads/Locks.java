package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    private int saldo = 10;
    private final ReentrantLock lock = new ReentrantLock();

    public void depositar(int cantidad) {
        lock.lock();
        try {
            saldo += cantidad;
        } finally {
            lock.unlock();
        }
    }

    public void retirar(int cantidad) {
        lock.lock();
        try {
            saldo -= cantidad;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Locks look = new Locks();
        System.out.println("Saldo inicial: " + look.saldo);

        Thread depositThread = new Thread(() -> {
            System.out.println("Depositando 200");
            look.depositar(200);
            System.out.println("Saldo después de depositar: " + look.saldo);
        });

        Thread withdrawThread = new Thread(() -> {
            System.out.println("Retirando 100");
            look.retirar(100);
            System.out.println("Saldo después de retirar: " + look.saldo);
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}