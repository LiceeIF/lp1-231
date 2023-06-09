package semana14;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoTest {

    @Test
    public void testCalcularArea() {
        Quadrado quadrado = new Quadrado(5);
        double expectedArea = 25.0;
        double actualArea = quadrado.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(5);
        double expectedPerimetro = 20.0;
        double actualPerimetro = quadrado.calcularPerimetro();
        assertEquals(expectedPerimetro, actualPerimetro, 0.001);
    }

    @Test
    public void testGetLado() {
        Quadrado quadrado = new Quadrado(5);
        double expectedLado = 5.0;
        double actualLado = quadrado.getLado();
        assertEquals(expectedLado, actualLado, 0.001);
}
}
