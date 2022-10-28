package Threads.classExcercise.punto3;

public class WriterClass extends Thread {

    private String word;

    public WriterClass(String word) {
        this.word = word;
    }

    public void write() {
        MyMainClass.word += this.word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(MyMainClass.word);
            write();

            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
