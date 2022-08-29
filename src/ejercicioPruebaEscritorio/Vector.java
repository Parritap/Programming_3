package ejercicioPruebaEscritorio;
import java.math.*;

public class Vector implements Vectorizable{

    int[] components;

    public Vector(int[] components) {
        this.components = components;
    }

    @Override
    public double getModule() {
        return Math.sqrt(getSumOfSquaredComponents( 0, 0));
    }

    public double getSumOfSquaredComponents (double sum, int i){
        if(i<components.length){
            return getSumOfSquaredComponents(sum + Math.pow(components[i], 2), ++i);
        }
        return sum;
    }

}
