package Threads;

public class MultiThreading {

    public static void main(String[] args) {
        Thread thread = new Thread(new Multithreading_thing(1));
        Thread thread_v2 = new Thread(new Multithreading_thing(2));
        thread.start();
        thread_v2.start();

    }
}
