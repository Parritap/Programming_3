package Sockets.simpleClientServerApp;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        MyServer server = new MyServer(CONNECTION_TYPE.SERVER);
        server.startServer();
    }

}
