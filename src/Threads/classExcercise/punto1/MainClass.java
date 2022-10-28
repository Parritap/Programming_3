package Threads.classExcercise.punto1;

public class MainClass {

    public static void main(String[] args) {
        Thread arrayCreator = new Thread(new ArrayCreator());
        Thread intCreator  = new Thread(new IntCreator());
        Thread printingThread = new Thread(new PrintingThread("JOJO!!!!"));

        arrayCreator.start();
        intCreator.start();
        printingThread.start();
    }

}
