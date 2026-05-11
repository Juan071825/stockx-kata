package edu.teamrocket.stockx.offer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AskTest {
    
    Ask oferta1 = new Ask("15", 50);
    Ask oferta2 = new Ask("15", 50);
    Ask oferta3 = new Ask("10", 13);

    @Test
    public void comprobarDatos() {
        assertEquals(50, oferta1.value());
        assertEquals("15", oferta1.size());
    }

    @Test void compararOfertas() {
        assertEquals(oferta1.compareTo(oferta2), 0);
        assertEquals(oferta1.compareTo(oferta3), 37);
        assertEquals(oferta3.compareTo(oferta1), -37);
    }
}