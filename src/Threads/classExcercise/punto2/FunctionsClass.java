package Threads.classExcercise.punto2;

public class FunctionsClass extends Thread {

    private int number;
    private String word;

    public FunctionsClass(int number, String word) {
        this.number = number;
        this.word = word;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        System.out.println(fib(this.number));
        System.out.println(countConsonants(this.word));
    }


    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    private static boolean isConsonant(char ch) {
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }

    static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isConsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
