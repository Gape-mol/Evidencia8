package Actividad5;

import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private int edad;
	private int identificacion;
	private Empresa empresa;
	private Departamento departamento;


	public Empleado(String nombre, int edad, int identificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Edad: " + edad + " Identificacion: " + identificacion;
	}
}