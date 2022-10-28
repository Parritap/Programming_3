package Threads;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new ClaseHilo(1));
        Thread thread_v2 = new Thread(new ClaseHilo(2));
        thread.start();
        thread_v2.start();

    }
}
