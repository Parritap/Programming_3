package filesEditing;

import java.io.File;
import java.io.IOException;

public class FilesManipulation {


    public static void main(String[] args) {

        try {
            File myFile = new File("C:\\Users\\esteb\\IdeaProjects\\Programming_3\\src\\filesEditing\\hola.txt");
            if  (myFile.createNewFile()){
                System.out.println("File was crated");
            }else{
                System.out.println("Fila was NOT created");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }


    }
}
