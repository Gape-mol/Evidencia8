package Actividad3;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Amigo> amigos;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.amigos = new ArrayList<Amigo>();
	}

	public ArrayList<Amigo> getAmigos() {
		return amigos;
	}

	public void agregarAmigo(Amigo amigo) {
		amigos.add(amigo);
	}

	public void obtenerAmigos() {
		try {
			for (Amigo amigo : amigos) {
				System.out.println(amigo.toString());
			}
		} catch (Exception e) {
			System.out.println("No hay amigos :c");
		}
	}
}