package recursividadEjercicios;

public class ImprimirMatriz {

    public static void main(String[] args) {


        int[][] m = {
                {1, 2, 3,4},
                {5, 6, 7,8},
                {9,10,11,12}
        };
        //imprimirMatriz(m, 0, 0);


        int sum = sumMatrizLikeRobinsonSaid(m);
        System.out.println(sum);
    }

    public static void imprimirMatriz(int[][] m, int i, int j) {

        if (i == m.length - 1 && j == m[i].length - 1) {
            System.out.println(m[i][j]);
        } else {
            if (j < m[i].length) {
                System.out.println(m[i][j]);
                imprimirMatriz(m, i, j + 1);
            } else {
                imprimirMatriz(m, i + 1, 0);
            }
        }

    }

    //Retroceder en columnas y aumentar en filas. Sumar toda la matriz.

    //hacer un método recursivo que gira la matriz n veces. Y debe poder girar en

    public static int sumCol(int sum, int[][] m, int i, int j) {
        if (j < m[i].length) {
            return sumCol(sum + m[i][j], m, i, ++j);
        }
        return sum;
    }
    public static int sumRows (int sum, int[][] m, int i, int j){
        if (i>=0){
            return sumRows (sumCol(sum, m, i, j), m, --i, 0);
        }
        return sum;
    }

    public static int sumMatrizLikeRobinsonSaid (int [][] m){
        return sumRows(0,m, m.length-1,0);
    }


}
