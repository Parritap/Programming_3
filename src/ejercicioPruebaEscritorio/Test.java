package ejercicioPruebaEscritorio;

import java.util.function.DoublePredicate;

public class Test {

    public static void main(String[] args) {


        Vector v = new Vector(new int[] {1,2,3});

        System.out.println(v.getSumOfSquaredComponents(0,0));
        System.out.println(v.getModule());
    }

}
