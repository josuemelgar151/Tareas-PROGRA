package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    Cylinder c;

    @Before
    public void setUp() throws Exception {
        c = new Cylinder();
    }

    @Test
    public void setHeight() {
        c.setHeight(10.5);
        assertEquals(10.5, c.getHeight(), 0.001);

        c.setHeight(-4.0);
        assertEquals(0.0, c.getHeight(), 0.001);
    }

    @Test
    public void getHeight() {
        c.setHeight(8.0);
        assertEquals(8.0, c.getHeight(), 0.001);
    }

    @Test
    public void area() {
        c.setRadius(3.0);
        c.setHeight(5.0);
        double esperado = 2 * 3.14159 * 3.0 * (3.0 + 5.0);
        double obtenido = c.area();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void volume() {
        c.setRadius(2.0);
        c.setHeight(7.0);
        double esperado = Math.PI * 2.0 * 2.0 * 7.0;
        double obtenido = c.volume();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void getName() {
        String esperado = "cilindro";
        String obtenido = c.getName();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "círculo = {centro = [0.0, 0.0]; radio = 0.0}; altura = 0.0";
        String obtenido = c.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
