package Actividad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmpresaTest {

    @Test
    public void testVenderBus() {
        Empresa empresa = new Empresa("Empresa");
        Bus bus = new Bus("modelo", 1, "123ABC", false);
        TerceraParte terceraParte = new TerceraParte(100);
        empresa.venderBus(bus, terceraParte, 100);
        assertTrue(bus.getVendido());
    }

    @Test
    public void testComprarBus() {
        Empresa empresa = new Empresa("Empresa");
        Bus bus = new Bus("modelo", 1, "123ABC", false);
        empresa.comprarBus(bus);
        assertEquals(1, empresa.getBuses().size());
    }

    @Test
    public void testMostrarBuses() {
        Empresa empresa = new Empresa("Empresa");
        Bus bus = new Bus("modelo", 1, "123ABC", false);
        empresa.comprarBus(bus);
        empresa.mostrarBuses();
    }

    @Test
    public void testMostrarBusesEmpty() {
        Empresa empresa = new Empresa("Empresa");
        empresa.mostrarBuses();
    }

    @Test
    public void testComprarBusFull() {
        Empresa empresa = new Empresa("Empresa");
        Bus bus = new Bus("modelo", 1, "123ABC", false);
        for (int i = 0; i < 12; i++) {
            empresa.comprarBus(bus);
        }
        empresa.comprarBus(bus);
    }
}