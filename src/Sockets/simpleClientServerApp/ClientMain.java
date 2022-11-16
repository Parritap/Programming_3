package Sockets.simpleClientServerApp;

import java.io.IOException;

public class ClientMain {

    public static void main(String[] args) throws IOException {
        MyClient client = new MyClient(CONNECTION_TYPE.CLIENT);
        client.startClient();
    }
}
