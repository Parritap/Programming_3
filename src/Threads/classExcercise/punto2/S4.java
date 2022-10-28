package Threads.classExcercise.punto2;

public class S4 extends Thread{

    public int number1;
    public int number2;

    public S4(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }



    @Override
    public void run (){
        int sum = number1 * number2;
        System.out.println(sum);
    }


}
