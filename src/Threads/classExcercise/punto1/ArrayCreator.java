package Threads.classExcercise.punto1;

public class ArrayCreator extends  Thread{

    public static void main(String[] args) throws InterruptedException {

        int array [] = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println("[" + array[i] + "]");
            sleep(1000);
        }
    }

    @Override
    public void run (){
        try {
            main(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
