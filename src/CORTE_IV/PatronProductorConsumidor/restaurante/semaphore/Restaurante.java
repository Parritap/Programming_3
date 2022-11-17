package CORTE_IV.PatronProductorConsumidor.restaurante.semaphore;

import java.util.concurrent.Semaphore;

public class Restaurante extends Thread{

	private String nombre;
	Semaphore mesero = new Semaphore(4);

	public Restaurante(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			Cliente cliente = new Cliente("Cliente:"+i, this);
			cliente.start();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public void entrar() {
		try {
			mesero.acquire();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void salir() {
			mesero.release();

	}
}
