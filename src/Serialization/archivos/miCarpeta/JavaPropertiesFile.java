package Serialization.archivos.miCarpeta;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class JavaPropertiesFile {

    public static void main(String[] args) throws IOException {

        Properties p = new Properties();


        p.setProperty("nombre", "Juan Esteban Parra Parra");
        p.setProperty("edad", "21 anios");
        p.setProperty("Lenguaje_Favorito", "Kotlin");

        OutputStream os = new FileOutputStream("C:\\Users\\USUARIO\\IdeaProjects\\Programming_3\\src\\Serialization.archivos\\miCarpeta\\myProperties.properties");

        p.store(os, null);

    }


}
