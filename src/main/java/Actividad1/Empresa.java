package Actividad1;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Bus> buses;
	private String nombre;
	public TerceraParte TerceraParte;

	public void venderBus(Bus bus, TerceraParte comprador, int precio) {
		if (comprador.getDinero() >= precio) {
			bus.vender();
		} else {
			System.out.println("La venta no ha sido exitosa");
		}
	}

	public void comprarBus(Bus bus) {
		if (buses.size() < 12) {
			buses.add(bus);
		} else {
			System.out.println("No se pueden comprar más de 12 buses");
		}
	}

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.buses = new ArrayList<Bus>();
	}

	public void mostrarBuses() {
		try {
			for (Bus bus : buses) {
				System.out.println(bus.toString());
			}
		}catch(Exception e){
				System.out.println("No hay buses");
		}
	}

	public ArrayList<Bus> getBuses() {
		return buses;
	}
}