package chat;

import java.io.IOException;

public class MainServidor {

    public static void main(String[] args) throws IOException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                Servidor.main(null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
    }

}
