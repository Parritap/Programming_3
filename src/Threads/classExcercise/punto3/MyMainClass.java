package Threads.classExcercise.punto3;

import java.util.Scanner;

public class MyMainClass {

    public  static String word ="";


    public static void main(String[] args) throws InterruptedException {

        boolean flag = true;
        while (flag){

            WriterClass writerClass= new WriterClass("Hola");
            RewriterClass rewriterClass = new RewriterClass();

            writerClass.start();
            writerClass.join();
            rewriterClass.start();


            char c =  readChar();
            if(c == 'N'){
                flag = false;
            }
        }

    }


    public static char readChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character [Y/N] para continuar: ");
        char character = scanner.next().charAt(0);
        return character;
    }


}
