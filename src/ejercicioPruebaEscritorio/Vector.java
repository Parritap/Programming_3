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
        int [] vector = this.components;
        if(i<vector.length){
            return getSumOfSquaredComponents(sum + Math.pow(vector[i], 2), ++i);
        }
        return sum;
    }

}
