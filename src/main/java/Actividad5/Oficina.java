package Actividad5;

import java.util.ArrayList;

public class Oficina {
	private String nombre;
	private Boolean oficinaCentral;
	private Empresa empresa;

	public Oficina( String nombre, Boolean oficinaCentral) {
		this.nombre = nombre;
		this.oficinaCentral = oficinaCentral;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public Boolean getOficinaCentral() {
		return oficinaCentral;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Oficina central: " + oficinaCentral;
	}
}