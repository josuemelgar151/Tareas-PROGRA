package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    private Point p;

    @Before
    public void before() throws Exception {
        p = new Point(1,1);

    }

    @Test
    public void testSetPoint() {
        p.setPoint(1, 2);
        String esperado = "[1.0,2.0]" ;
        String obtenido = p.toString().toLowerCase().replaceAll("\\s+","");
        assertEquals(esperado,obtenido);

    }

    @Test
    public void TestGetName() {
        String esperado = "point" ;
        String obtenido = p.getName().toLowerCase();
        assertEquals(esperado,obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "[1.0, 1.0]" ;
        String obtenido = p.toString().toLowerCase().replaceAll("\\s+","");
        assertEquals(esperado,obtenido);

    }
}
