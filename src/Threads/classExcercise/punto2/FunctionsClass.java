package Threads.classExcercise.punto2;

public class FunctionsClass extends Thread {

    public static int number = 10;
    public static String word = "otorrinolaringologia";


    public static void main(String[] args) {

    }

     @Override
    public void run(){

     }


    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    private boolean isConsonant (char ch) {
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }

    private int countConsonants (String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isConsonant(str.charAt(i))){
                count++;
            }
        }
        return count;
    }






}
