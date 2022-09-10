package recursividadEjercicios;

import utils.Utils;

public class RotateMatrix {

    public static void main(String[] args) {


        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] n = new int[m[0].length][m.length];

        rotateMatrixClockWiseOnce(m, n, 0, 0);

        //Utils.print(n);

        int[][] x = new int[m[0].length][m.length];

        rotateMatrixAntiClockWiseOnce(m, x, 0, 0);
        Utils.print(x);


    }


    public static void rotateMatrixClockWiseOnce(int[][] m, int[][] n, int i, int j) {
        if (i == m.length) {
            i = 0;
            j++;
            if (j == m[0].length) return;
        }
        n[j][m.length - 1 - i] = m[i][j];
        i++;
        rotateMatrixClockWiseOnce(m, n, i, j);
    }


    public static void rotateMatrixAntiClockWiseOnce(int[][] m, int[][] n, int i, int j) {
        if (i == m.length) {
            i = 0;
            j++;
            if (j == m[0].length) return;
        }
        n[j][i] = m[i][j];
        i++;
        rotateMatrixAntiClockWiseOnce(m, n, i, j);
    }


    //  public static int[][] rotateClockWise (int[][]m, int[][]n, int times){
//
    //      if(times>0) {
    //          int[][] rotated = new int[m[0].length][m.length];
    //          rotateMatrixAntiClockWiseOnce(m, n, 0, 0);
    //          times--;
    //      }
    //  }


    /**
     * Método que retorna una matriz girada una n cantidad de veces en el sentido dispuesto en los parametros.
     *
     * @param matrix     Matriz a girar
     * @param direcction True para sentido horario, False para antihorario.
     * @param times      Cantidad de veces a girar la matriz
     */
    public int[][] rotateMatrixClockWise(int[][] matrix, boolean direcction, int times) {

        int[][] newMatrix;

        if (times % 4 == 0) return matrix;

        if (times % 2 == 0 && direcction && times > 0) {
            newMatrix = new int[matrix[0].length][matrix.length];

            rotateMatrixClockWiseOnce(matrix, newMatrix, 0, 0);

        } else {
            newMatrix = new int[matrix.length][matrix[0].length];

        }


        return newMatrix;
    }
}
