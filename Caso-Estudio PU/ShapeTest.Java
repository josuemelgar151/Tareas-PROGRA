package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    // Clase anónima para poder probar los métodos del abstracto
    Shape s = new Shape() {
        @Override
        public String getName() {
            return "figura";
        }
    };

    @Test
    public void area() {
        double esperado = 0.0;
        double obtenido = s.area();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void volume() {
        double esperado = 0.0;
        double obtenido = s.volume();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void getName() {
        String esperado = "figura";
        String obtenido = s.getName();
        assertEquals(esperado, obtenido);
    }
}
