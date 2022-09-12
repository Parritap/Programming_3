package backTracking;

import utils.Utils;

import java.util.ArrayList;

public class Laberinto {


    public char[][] laberinto = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', ' ', ' ', ' ', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', ' ', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
    };


    public ArrayList<char[][]> listaSoluciones = new ArrayList<>();


    /* --------------------- PRUEBA DEL ALGORITMO --------------------- */
    public static void main(String[] args) {
        Laberinto m = new Laberinto();                                                // construimos un objeto de la clase Laberinto por defecto


        for (int i = 0; i < m.laberinto.length; i++) {
            for (int j = 0; j < m.laberinto[i].length; j++) {

                for (int k = m.laberinto.length - 1; k >= 0; k--) {
                    for (int l = m.laberinto[k].length - 1; l >= 0; l--) {

                        char [][] copiaLaberinto = m.laberinto;
                        copiaLaberinto[i][j] = 'X';                                                    // introducimos en este caso, la salida (X) en las coordenadas (1,1)
                        m.resuelve(k, l, copiaLaberinto);
                    }
                }
            }
        }


        // ahora, introducimos la entrada (S) en las coordenadas (8,1) y llamamos al algoritmo
        //System.out.println(m.printLaberinto());                                    // imprimimos el laberinto ya resuelto (si tiene solución)


        for (char[][] solution : m.listaSoluciones) {
            Utils.print(solution);
            System.out.println("\n\n");
        }

        Utils.print(m.laberinto);

        System.out.println("Número de soluciones es: " + m.listaSoluciones.size());
    }


    /* ----------------- IMPLEMENTACIÓN DEL ALGORITMO ----------------- */
    public void resuelve(int x, int y, char [][] laberinto) {
        if (paso(x, y, laberinto)) {                                // intentará resolver el laberinto en estas coordenadas
            laberinto[x][y] = 'S';                        // introduce en las coordenadas (x, y) la entrada
        }
    }

    private boolean paso(int x, int y, char[][] laberinto) {

        if (laberinto[x][y] == 'X') { // si hemos llegado a X quiere decir que hemos encontrado solución

            this.listaSoluciones.add(laberinto);
            return true; // luego, el algoritmo termina
        }


        if (laberinto[x][y] == '#' || laberinto[x][y] == '*' || laberinto[x][y] == 'f') { // si llegamos a una pared o al mismo punto,
            return false; // entonces el laberinto no puede resolverse y termina.
        }

        // si no se cumple ninguna de estas dos situaciones, quiere decir que nos encontramos en un
        // caso intermedio, por lo tanto, que empezamos a recorrer o todavía no hemos llegado a nada
        laberinto[x][y] = '*'; // marcamos la posición como visitada (si es la primera, en las coordenadas x e y

        boolean result; // se coloca S de START)

        if (y != laberinto[0].length-1) {
            result = paso(x, y + 1, laberinto); // intentamos ir hacia la DERECHA. Primera llamada recursiva
            if (result) return true; // si el resultado es el final, entonces el algoritmo termina
        }

        if (x != 0) {
            result = paso(x - 1, y, laberinto); // intentamos ir hacia ARRIBA. Segunda llamada recursiva
            if (result) return true; // si el resultado es el final, entonces el algoritmo termina
        }

        if (y != 0) {
            result = paso(x, y - 1, laberinto); // intentamos ir hacia la IZQUIERDA. Tercera llamada recursiva
            if (result) return true; // si el resultado es el final, entonces el algoritmo termina}
        }


        if (x != laberinto.length - 1) {
            result = paso(x + 1, y, laberinto); // intentamos ir hacia ABAJO. Cuarta llamada recursiva
            if (result) return true; // si el resultado es el final, entonces el algoritmo termina
            //
        }


        // si no hemos encontrado la solución en estos cuatros movimientos, volvemos atrás, aunque hay que
        // considerar que en este punto, todas las llamadas recursivas han finalizado. Si en ninguna de ellas
        // se ha conseguido el éxito, entonces el algoritmo termina y devuelve false.
        laberinto[x][y] = 'f'; // en el caso de no ser el resultado, se marca con +. Ya fue pisado
        return false; // vuelta atrás si la solución no se encuentra aquí


    }

    String printLaberinto() { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene implementado
        String salida = "";    // un método toString para arrays bidimensionales, lo programamos a mano
        for (int x = 0; x < laberinto.length; x++) { // recorremos filas
            for (int y = 0; y < laberinto[x].length; y++) { // recorremos columnas
                salida += laberinto[x][y] + " "; // output es nuestra variable que va almacenando los valores a imprimir
            }
            salida += "\n"; // devolvemos esta variable con un salto de línea
        }
        return salida;
    }


    //  private ArrayList<ArrayList<Character>> convertTo2DArrayList(char[][] matrix) {

    //  }

}