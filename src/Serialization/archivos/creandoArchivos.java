package Serialization.archivos;

import java.io.File;

public class creandoArchivos {

    //File class


    public static void main(String[] args) {


        File file = new File("C:\\Users\\USUARIO\\IdeaProjects\\Programming_3\\src\\Serialization.archivos\\miCarpeta");

        try {
            file.mkdir();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
