package CORTE_IV.PatronProductorConsumidor.restaurante;

public class Cliente extends Thread{

	private String nombre;
	Restaurante restaurante;

	public Cliente(String nombre,Restaurante restaurante) {
		super(nombre);
		this.nombre = nombre;
		this.restaurante = restaurante;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public void run() {


		restaurante.reservar();
		System.out.println("El "+getNombre() +" entro al Restaurante");
		try {
			Thread.sleep(30000);

			restaurante.cancelarReserva();
			System.out.println("El "+getNombre() +" salio al Restaurante");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}