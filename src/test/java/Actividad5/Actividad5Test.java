package Actividad5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Actividad5Test {

    @Test
    public void testEmpresa() {
        Empresa empresa = new Empresa("Empresa");
        Empleado administrador = new Empleado("Administrador", 20, 123);
        Departamento departamento = new Departamento("Departamento", administrador);
        Empleado empleado = new Empleado("Empleado", 20, 123);
        Oficina oficina = new Oficina("OficinaCentrak", true);
        Oficina oficina2 = new Oficina("Oficina", false);

        empresa.agregarDepartamento(departamento);
        empresa.agregarOficina(oficina);
        empresa.agregarOficina(oficina2);

        assertEquals(empresa, departamento.getEmpresa());
        assertEquals(empresa, oficina.getEmpresa());
        assertEquals(empresa, oficina2.getEmpresa());

        departamento.agregarEmpleado(empleado);

        assertEquals(empresa, empleado.getEmpresa());
    }

    @Test
    public void testDepartamento() {
        Empleado administrador = new Empleado("Administrador", 20, 123);
        Departamento departamento = new Departamento("Departamento", administrador);
        Empleado empleado = new Empleado("Empleado", 20, 123);

        departamento.agregarEmpleado(empleado);

        assertEquals(departamento, empleado.getDepartamento());
        assertEquals(administrador ,departamento.getAdministrador());
    }

}