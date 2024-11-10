package Actividad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void testAgregarAmigo() {
        Persona persona = new Persona("Persona", 20);
        Amigo amigo = new Amigo("Amigo", 20);
        persona.agregarAmigo(amigo);
        assertEquals(1, persona.getAmigos().size());
    }

    @Test
    public void testObtenerAmigos() {
        Persona persona = new Persona("Persona", 20);
        Amigo amigo = new Amigo("Amigo", 20);
        persona.agregarAmigo(amigo);
        persona.obtenerAmigos();
    }
}