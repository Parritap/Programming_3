package Threads.classExcercise.punto1;

public class IntCreator extends Thread {

    public static void main(String[] args) throws InterruptedException {
        //random number between 1 and 10000
        int integer = (int) (Math.random() * 10000) + 1;

        for (int i = 0; i <10 ; i++) {
            integer = integer * integer;
            System.out.println(integer);
            Thread.sleep(1500);
        }
    }

    @Override
    public void run (){
        try{
            main(null);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
