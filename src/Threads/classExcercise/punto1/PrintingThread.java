package Threads.classExcercise.punto1;

public class PrintingThread extends Thread {

    private String name;


    public PrintingThread(String name) {
        this.name = name;
    }

    public void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            System.out.println(this.getName());
            Thread.sleep(500);
        }
    }

    @Override
    public void run() {
        try {
            main(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
