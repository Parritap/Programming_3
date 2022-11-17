package CORTE_IV.PatronProductorConsumidor.tuberiaLetras;

public class Ejecucion {

	public static void main( String args[] ) {
		Tuberia t = new Tuberia();
		Productor p = new Productor( t );
		Productor p2 = new Productor( t );
		Consumidor c = new Consumidor( t );

		p.start();
		c.start();
		p2.start();
	}
}