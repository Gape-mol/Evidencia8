package Actividad5;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Oficina> oficinas;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.departamentos = new ArrayList<Departamento>();
		this.oficinas = new ArrayList<Oficina>();
	}

	public void agregarDepartamento(Departamento departamento) {
		if (departamento.getEmpresa() == null) {
			departamentos.add(departamento);
			departamento.setEmpresa(this);
		} else {
			System.out.println("El departamento ya pertenece a una empresa");
		}
	}

	public void agregarOficina(Oficina oficina) {
		if (oficina.getEmpresa() == null) {
			oficina.setEmpresa(this);
			oficinas.add(oficina);
		} else {
			System.out.println("La oficina ya pertenece a una empresa");
		}
	}



	public void mostrarDepartamentos() {
		try {
			for (Departamento departamento : departamentos) {
				System.out.println(departamento.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("No hay departamentos en esta empresa");
		}
	}

	public void mostrarOficinas() {
		try {
			for (Oficina oficina : oficinas) {
				System.out.println(oficina.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("No hay oficinas en esta empresa");
		}
	}
}