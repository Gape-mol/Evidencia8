package Actividad1;

import java.util.ArrayList;

public class Bus {
	private String modelo;
	private int antiguedad;
	private String matricula;
	private Boolean vendido;

	//Constructor
	public Bus(String modelo, int antiguedad, String matricula, Boolean vendido) {
		this.modelo = modelo;
		this.antiguedad = antiguedad;
		this.matricula = matricula;
		this.vendido = vendido;
	}

	//Getters
	public Boolean getVendido() {
		return this.vendido;
	}

	//Metodos
	public void vender() {
		this.vendido = true;
	}

	//ToString
	@Override
	public String toString() {
		return "Bus [modelo=" + modelo + ", antiguedad=" + antiguedad + ", matricula=" + matricula + ", vendido=" + vendido + "]";
	}
}