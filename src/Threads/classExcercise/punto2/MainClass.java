package Threads.classExcercise.punto2;

public class MainClass {

    public static void main(String[] args) {
        Thread T1 = new Thread(new FunctionsClass());
        Thread T2 = new Thread(new FunctionsClass());
    }
}
