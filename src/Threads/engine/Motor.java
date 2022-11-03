package Threads.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Motor {

    public static void main(String[] args) throws InterruptedException {
        Motor motor = new Motor();

        for (Piston p: motor.conjuntoPistones) {
            Thread t = new Thread(p);
            t.start();
        }

    }


    private  Piston[] conjuntoPistones = {
            new Piston(1,new Valvula()),
            new Piston(2,new Valvula()),
            new Piston(3,new Valvula()),
            new Piston(4,new Valvula())};
}


