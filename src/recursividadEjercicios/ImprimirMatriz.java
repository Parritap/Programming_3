package recursividadEjercicios;

public class ImprimirMatriz {

    public static void main(String[] args) {


        int[][] m = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
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
//---------------------------------------------------------------------------------------------------------------------
    //Retroceder en columnas (--j) y aumentar en filas(i++). Sumar toda la matriz.


    /**
     * Método que suma los elementos que, dada una fila (i) dada, suma los elementos de la misma
     * de atrás hacia adelante, esto es, se va de columna en columna desde la última posición posible de
     * la fila hasta la primera.
     *
     * @param sum Suma de las filas anteriores. Si la columna que se evalúa no es la primera, entonces sum debería pasar
     *            un valor distinto de 0 (por ejemplo si la fila evaluada es {3,4,5}, entonces la tercera vez que se llame el método
     *            el parametro sum debería ser 3+4 = 7. )
     * @param m   Matriz
     * @param i   Index que indica la fila en la que nos encontramos. En este método "i" no se modifica.
     * @param j   Index que indica la columna en la que nos encontramos. Este sí que modifica "j" para poder movernos de manera horizontal entre
     *            los elementos de "m"
     * @return La suma de todos los elementos de la fila.
     */
    public static int sumCol(int sum, int[][] m, int i, int j) {
        if (j < m[i].length) return sumCol(sum + m[i][j], m, i, ++j);
        return sum;
    }


    /**
     * Método que suma todas las filas de una matriz. Utiliza el método sumCol para aumentar la simplicidad.
     * Su funcionamiento es simple. Usa sumCol para sumar todos los elementos de una fila "i" de una matriz.
     * y va iterando de manera recursiva, empezando desde la última fila, hasta que llega a la primera de la matriz m.
     *
     * @param sum Suma que se pasa por parametro para mantener la cuenta de las filas a las que se les saca su suma de elementos.
     * @param m   matriz a evaluar
     * @param i   Index que indica la fila en la que nos encontramos. "i" sí se moficia en este método.
     * @param j   Index que indica la columna en la que nos encontramos. "j" no se modifica.
     * @return
     */
    public static int sumRows(int sum, int[][] m, int i, int j) {
        if (i >= 0) {
            return sumRows(sumCol(sum, m, i, j), m, --i, 0);
        }
        return sum;
    }

    /**
     * Método que integra los métodos sumRows e (implicitamente) sumCol.
     *
     * @param m Matriz a evaluar.
     * @return Suma de todos los elementos dentro de la matriz.
     */
    public static int sumMatrizLikeRobinsonSaid(int[][] m) {
        return sumRows(0, m, m.length - 1, 0);
    }
}

//---------------------------------------------------------------------------------------------------------------------
///(TAREA)hacer un método recursivo que gira la matriz n veces. Y debe poder girar en

