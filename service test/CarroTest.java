package service2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarroTest {

    private Carro carro;



    @Before
    public void before(){
        carro = new Carro();

    }

    @Test
    public void testCambiarLlantaDelanteraPIloto() {
        Llanta esperado = new Llanta(20);
        Llanta  []lls = new Llanta [4];
        lls[0] = esperado;

        carro.setLlantas(lls);

        Llanta obtenido = carro.getLlantas()[0];

        assertEquals(esperado, obtenido);
    }



    @Test
    public void testToString() {
        String esperado = "Carro{TAM=5, llantas[LLanta(rin=10),Llanta(rin=10), Llanta(rin=10)]}";
        String obtenido = carro.toString();
        assertEquals(esperado,obtenido);

    }
}