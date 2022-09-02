package ejercicioEnClase;

import java.util.Arrays;

public class ObtenerNumMayor {


    public static void main(String[] args) {

        int[] array = new int[] {10, 3, 40, 2};


        int n =obtenerNumMayor(array, 0, array[0]);
        System.out.println(n);


    }

    public static int obtenerNumMayor(int[] a, int i, int numMayor) {

        if (i < a.length) {

            if (a[i] > numMayor) {
                numMayor = a[i];
                i++;
                return obtenerNumMayor(a, i, numMayor);
            } else {
                i++;
                return obtenerNumMayor(a, i, numMayor);
            }

        } else {
            return numMayor;
        }


    }

}
