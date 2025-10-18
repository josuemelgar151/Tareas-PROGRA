package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle c;

    @Before
    public void setUp() throws Exception {
        c = new Circle();
    }

    @Test
    public void setRadius() {
        c.setRadius(5.5);
        assertEquals(5.5, c.getRadius(), 0.001);

        c.setRadius(-3.0);
        assertEquals(0.0, c.getRadius(), 0.001);
    }

    @Test
    public void getRadius() {
        c.setRadius(10.0);
        assertEquals(10.0, c.getRadius(), 0.001);
    }

    @Test
    public void area() {
        c.setRadius(3.0);
        double esperado = Math.PI * 3.0 * 3.0;
        assertEquals(esperado, c.area(), 0.001);
    }

    @Test
    public void getName() {
        assertEquals("círculo", c.getName());
    }

    @Test
    public void testToString() {
        String esperado = "centro = [0.0, 0.0]; radio = 0.0";
        String obtenido = c.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
