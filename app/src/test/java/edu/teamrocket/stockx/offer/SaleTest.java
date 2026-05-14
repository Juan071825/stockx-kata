package edu.teamrocket.stockx.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SaleTest {
    
    Sale oferta1 = new Sale("15", 50);
    Sale oferta2 = new Sale("15", 50);
    Sale oferta3 = new Sale("10", 13);

    @Test
    public void comprobarDatos() {
        assertEquals(50, oferta1.value());
        assertEquals("15", oferta1.size());
    }

    @Test 
    public void compararOfertas() {
        assertEquals(oferta1.compareTo(oferta2), 0);
        assertEquals(oferta1.compareTo(oferta3), 1);
        assertEquals(oferta3.compareTo(oferta1), -1);
    }
}