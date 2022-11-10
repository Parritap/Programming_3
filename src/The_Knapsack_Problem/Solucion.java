package The_Knapsack_Problem;

import utils.Utils;
import java.io.File;

public class Solucion {
// Java.IO.File


    public static void main(String[] args) {

        Item i1 = new Item(5, 7);
        Item i2 = new Item(4, 5);
        Item i3 = new Item(3, 4);
        Item i4 = new Item(1, 1);

        Item[] objetos = {i1, i2, i3, i4};

        Mochila mochila = new Mochila(7);


        //En la matriz únicamente pondremos los valores que podemos obtener llevando los objetos, no pondremos los pesos.
        //La cantidad de columnas de la matriz indica el peso disponible en cada una, así, en la columna 5 tendremos disponible un peso
        //  de 5 para cargar objetos.

        //A su vez, la matriz tendrá n +1 filas, siendo n la cantidad de objetos (objetos.length) que hay.
        int[][] matriz = new int[objetos.length + 1][mochila.capacidad + 1];

        for (int i = 1; i <= objetos.length; i++) { //Menor o igual dado que la matriz tiene [objetos.length + 1] filas
            for (int j = 1; j <= mochila.capacidad; j++) {

                int maximorValorSinObjeto_i = matriz[i - 1][j]; //Esto es, el valor sin llevar el objeto i.
                //Es por la línea anterior que necesitamos una fila y una columna adicional. Sin objetos (fila 0), el máximo
                //valor que podemos llevar en todas las celdas de la fila es 0.

                int maximoValorConObjeto_i = 0; //declaramos el valor llevando el objeto de la columna i.

                if (j >= objetos[i-1].peso) {
                    int auxValor = objetos[i-1].valor;
                    int pesoRestante = j - objetos[i-1].peso;

                    maximoValorConObjeto_i = auxValor + matriz[i-1][pesoRestante];
                }
                matriz[i][j] = Math.max(maximorValorSinObjeto_i, maximoValorConObjeto_i);
            }
        }
        int valorMaximo = matriz[objetos.length][mochila.capacidad];


        Utils.print(matriz);
        System.out.println("El valor maximo que puede cargar la mochila es: " + valorMaximo);



    }


}
