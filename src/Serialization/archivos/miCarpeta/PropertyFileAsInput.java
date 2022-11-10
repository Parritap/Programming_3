package Serialization.archivos.miCarpeta;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileAsInput {

    public static void main(String[] args) throws IOException {

        Properties p = new Properties();
        InputStream is = new FileInputStream("C:\\Users\\USUARIO\\IdeaProjects\\Programming_3\\src\\Serialization.archivos\\miCarpeta\\myProperties.properties");
        p.load(is);
        System.out.println(p.getProperty("nombre"));

    }
}
