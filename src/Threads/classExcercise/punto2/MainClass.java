package Threads.classExcercise.punto2;

public class MainClass {

    private final static int number = 10;
    public final static String word = "otorrinolaringologia";

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new FunctionsClass(number, word));
        Thread t2 = new Thread(new FunctionsClass(number, word));
        S4 s4 = new S4((int) FunctionsClass.fib(number), FunctionsClass.countConsonants(word));
        Thread t3 = new Thread(s4);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();

    }
}
