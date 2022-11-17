import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class Client {



    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Escriba usario y contraseña seguido de una coma");
            dout.writeUTF(readString());
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Function to read a String from the console
    public static String readString() {
        String s = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        //ñññññññññ
        return s;
    }
}
