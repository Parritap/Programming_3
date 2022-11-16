package Sockets.simpleClientServerApp;

import java.io.DataOutputStream;
import java.io.IOException;

public class MyClient extends Connection {

    public MyClient(CONNECTION_TYPE type) throws IOException {
        super(type);
    }


    public void startClient() {
        try {
            serverOutput = new DataOutputStream(this.clientSocket.getOutputStream());

            for (int i=1; i<=10; i++){
               serverOutput.writeUTF("This is the message number: " + i +" \n");
            }

            clientSocket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
