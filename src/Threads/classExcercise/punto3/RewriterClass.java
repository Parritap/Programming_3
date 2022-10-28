package Threads.classExcercise.punto3;

public class RewriterClass extends Thread {

    @Override
    public void run() {
        System.out.println("El estado de la variable word es: " + MyMainClass.word);
        System.out.println("Se procede a reescribir la variable word y dejarla vacía");
        MyMainClass.word = "";
    }


}
