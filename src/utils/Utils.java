package utils;

import java.util.Arrays;

public class Utils {

    /**
     * Método que imprime una matriz de enteros.
     */
    public static void print(int matrix[][]) {
        for (int[] element : matrix
        ) {
            System.out.println(Arrays.toString(element));
        }
    }

    /**
     * Método que imprime una matriz de caracteres.
     */
    public static void print(char matrix[][]) {
        for (char[] element : matrix
        ) {
            System.out.println(Arrays.toString(element));
        }
    }

    public static  void printColum(int colum, int[][] matrix ){
        for (int[] fila : matrix) {
            System.out.println(fila[colum]);
        }
    }
}
