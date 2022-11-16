package Sockets.simpleClientServerApp;

import java.io.*;

public class MyServer extends Connection {
    public MyServer(CONNECTION_TYPE type) throws IOException {
        super(type);
    }

    //Método que inicia la ejecución del server.
    public void startServer() {

        try {
            System.out.println("Waiting...");

            clientSocket = this.serverSocket.accept();

            System.out.println("Client online");

            clientOutput = new DataOutputStream(clientSocket.getOutputStream());

            clientOutput.writeUTF("Request received and ccepted");

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));



            while ((serverMessage= input.readLine()) !=null){
                System.out.println(serverMessage); //Se muestra el mensaje obtenido por el cliente mediante su inputSteam
            }

            System.out.println("Closing connection");

            serverSocket.close();

            System.out.println("Connection closed");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
