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

        Utils.print(n);


    }


    public static void rotateMatrixClockWiseOnce(int[][] m, int[][] n, int i, int j) {


        if (j == m[0].length) {
            j = 0;
            i++;
            if (i == m.length) return;
        }
        n[i][m.length - 1 - j] = m[i][j];
        rotateMatrixClockWiseOnce(m, n, i, ++j);
    }

    public void rotateMatrixClockWise(int[][] m, int n) {

        int[][] newMatrix;

        if (n % 2 == 0) {
            newMatrix = new int[m[0].length][m.length];

            rotateMatrixClockWise(m, --n);

        } else {
            newMatrix = new int[m.length][m[0].length];
        }

    }
}
