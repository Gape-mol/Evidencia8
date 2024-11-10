package Actividad5;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private ArrayList<Empleado> empleados;
	private Empleado administrador;
	private Empresa empresa;

	public Departamento(String nombre, Empleado administrador) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
		this.administrador = administrador;
	}

	public void agregarEmpleado(Empleado empleado) {
		if (empleado.getEmpresa() == null) {
			empleados.add(empleado);
			empleado.setEmpresa(this.empresa);
			empleado.setDepartamento(this);
		} else {
			System.out.println("El empleado ya pertenece a una empresa");
		}
	}

	public void mostrarEmpleados() {
		try {
			for (Empleado empleado : empleados) {
				System.out.println(empleado.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("No hay empleados en este departamento");
		}
	}

	public void mostrarAdministrador() {
		System.out.println(this.administrador.toString());
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public Empleado getAdministrador() {
		return administrador;
	}

}