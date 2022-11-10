package Threads.motor;

public class Motor {

    public static boolean[] gasolina = new boolean[1];

    public static void main(String[] args) throws InterruptedException {

        Thread v1 = new Thread(new Valvula(0));
        v1.start();

        Thread p1 = new Thread(new Piston(0));
        p1.start();

    }

}



