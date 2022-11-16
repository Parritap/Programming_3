package Sockets.simpleClientServerApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {

    private final int PORT = 6666;
    private final String HOST = "localhost";
    public String serverMessage;
    public ServerSocket serverSocket;
    public Socket clientSocket;
    public DataOutputStream serverOutput, clientOutput;


    public Connection(CONNECTION_TYPE type) throws IOException {
        if (type.equals(CONNECTION_TYPE.SERVER)) {
            serverSocket = new ServerSocket(PORT);
            clientSocket = new Socket();
        } else {
            clientSocket = new Socket(HOST, PORT);
        }
    }


}
