package Threads.motor;

//Clase productora
public class Valvula extends Thread {

    boolean hayGasolina = false;
    int num;


    public Valvula(int num) {
    }


    @Override
    public void run() {

        while (true) {
            synchronized (this){
                Motor.gasolina[num] = true;
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
