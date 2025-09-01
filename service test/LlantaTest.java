
package service2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LlantaTest {

    private Llanta l;

    @Before
    public void before() throws Exception {
        l = new Llanta();
    }

    @Test
    public void getRin() {
        int esperado = 0; // constructor sin parámetros asigna 0
        int obtenido = l.getRin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void setRin() {
        l.setRin(15);
        int esperado = 10;
        int obtenido = l.getRin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void setRinNeg() {
        l.setRin(-1);
        int esperado = -1;
        int obtenido = l.getRin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void toStringTest() {
        l.setRin(10);
        String esperado = "llanta(rin=10)";
        String obtenido = l.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
