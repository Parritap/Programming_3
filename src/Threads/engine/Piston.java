package Threads.engine;

//Clase consumidora
public class Piston extends Thread {

    int numeroPiston;
    boolean hayGasolina = false;
    Valvula valvula;

    public Piston (int numeroPiston, Valvula valvula){
        this.valvula = valvula;
        this.numeroPiston = numeroPiston;
    }

    @Override
    public void run() {
        while (true) {
            if (hayGasolina) {
                System.out.println("Explosión en el pistón: " + this.numeroPiston);
                hayGasolina = false;
                valvula.hayGasolina = true;
            } else{
                try {
                    sleep(1000);
                    llenarGasolina();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void llenarGasolina() {
        hayGasolina = true;
    }

}
