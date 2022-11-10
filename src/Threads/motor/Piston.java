package Threads.motor;

//Clase consumidora
public class Piston extends Thread {

    int numeroPiston;
    boolean hayGasolina = false;


    public Piston (int numeroPiston){
        this.numeroPiston = numeroPiston;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (this){
                try {
                    if (Motor.gasolina[numeroPiston]) System.out.println("Piston: " + numeroPiston+". accionado");
                    sleep(1500);
                    notifyAll();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    private  synchronized void llenarGasolina() {
        hayGasolina = true;
    }

}
