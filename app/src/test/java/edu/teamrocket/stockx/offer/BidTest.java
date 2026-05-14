package edu.teamrocket.stockx.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BidTest {
    
    Bid oferta1 = new Bid("15", 50);
    Bid oferta2 = new Bid("15", 50);
    Bid oferta3 = new Bid("10", 13);

    @Test
    public void testComprobarDatos() {
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