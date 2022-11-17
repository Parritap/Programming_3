package CORTE_IV.PatronProductorConsumidor.restaurante;


public class Restaurante {

	private String nombre;
	AgenteReservas agenteReservas;


	public Restaurante(String nombre,int aforo) {
		this.nombre = nombre;
		this.agenteReservas = new AgenteReservas(aforo);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void reservar() {
		try {
			agenteReservas.reservar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void cancelarReserva() {

		try {
			agenteReservas.cancelarReserva();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void simularClientes(){

		Cliente cliente = null;
		for (int i = 1; i <= 10 ; i++) {
			cliente = new Cliente("Cliente "+i, this);
			cliente.start();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
