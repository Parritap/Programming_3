package chat;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Cliente {
    private Socket socket;
    private DataInputStream bufferDeEntrada = null;
    private DataOutputStream bufferDeSalida = null;
    Scanner teclado = new Scanner(System.in);
    final String COMANDO_TERMINACION = "salir()";

    public void levantarConexion(String ip, int puerto) {
        try {
            socket = new Socket(ip, puerto);
            print("Conectado a :" + socket.getInetAddress().getHostName());
        } catch (Exception e) {
            print("Excepción al levantar conexión: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public void abrirFlujos() {
        try {
            bufferDeEntrada = new DataInputStream(socket.getInputStream());
            bufferDeSalida = new DataOutputStream(socket.getOutputStream());
            bufferDeSalida.flush();
        } catch (IOException e) {
            print("Error en la apertura de flujos");
        }
    }

    public void enviar(String s) {
        try {
            bufferDeSalida.writeUTF(s);
            bufferDeSalida.flush();
        } catch (IOException e) {
            print("IOException al enviar el mensaje");
        }
    }

    public void cerrarConexion() {
        try {
            bufferDeEntrada.close();
            bufferDeSalida.close();
            socket.close();
            print("Conexión terminada");
        } catch (IOException e) {
            print("IOException on cerrarConexion()");
        } finally {
            System.exit(0);
        }
    }

    public void ejecutarConexion(String ip, int puerto) {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    levantarConexion(ip, puerto);
                    abrirFlujos();
                    recibirDatos();
                } finally {
                    cerrarConexion();
                }
            }
        });
        hilo.start();
    }

    public void recibirDatos() {
        String st = "";
        try {
            do {
                st = (String) bufferDeEntrada.readUTF();
                print("\n[Servidor] => " + st);
                System.out.print("\n[Usted] => ");
            } while (!st.equals(COMANDO_TERMINACION));
        } catch (IOException e) {
        }
    }

    public void escribirDatos() {
        String entrada = "";
        while (true) {
            System.out.print("[Usted] => ");
            entrada = teclado.nextLine();
            if (entrada.length() > 0)
                enviar(entrada);
        }
    }

    public static void main(String[] argumentos) {
        Cliente cliente = new Cliente();
        Scanner escaner = new Scanner(System.in);
        print("Ingresa la IP: [localhost por defecto] ");
        String ip = escaner.nextLine();
        if (ip.length() <= 0) ip = "localhost";

        print("Puerto: [5050 por defecto] ");
        String puerto = escaner.nextLine();
        if (puerto.length() <= 0) puerto = "5050";
        cliente.ejecutarConexion(ip, Integer.parseInt(puerto));
        cliente.escribirDatos();
    }


    /**
     *Notas
     *
     * FLUSH();
     * When you write data to a stream, it is not written immediately, and it is buffered. So use flush() when you need to be sure that all your data from buffer is written.
     * We need to be sure that all the writes are completed before we close the stream, and that is why flush() is called in file/buffered writer's close().
     * But if you have a requirement that all your writes be saved anytime before you close the stream, use flush().
     */
}