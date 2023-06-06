package semana14;

import org.junit.Test;
import static org.junit.Assert.*;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(4);
        retangulo.setAltura(5);
        double expectedArea = 20.0;
        double actualArea = retangulo.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(4);
        retangulo.setAltura(5);
        double expectedPerimetro = 18.0;
        double actualPerimetro = retangulo.calcularPerimetro();
        assertEquals(expectedPerimetro, actualPerimetro, 0.001);
    }

    @Test
    public void testSetBaseInvalida() {
        try {
            Retangulo retangulo = new Retangulo();
            retangulo.setBase(-4);
            fail("Deveria ter lançado uma exceção");
        } catch (RuntimeException e) {
            assertEquals("Base inválida", e.getMessage());
        }
    }

    @Test
    public void testSetAlturaInvalida() {
        try {
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(-5);
            fail("Deveria ter lançado uma exceção");
        } catch (RuntimeException e) {
            assertEquals("Altura inválida", e.getMessage());
        }
    }

    @Test
    public void testGetBase() {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(4);
        double expectedBase = 4.0;
        double actualBase = retangulo.getBase();
        assertEquals(expectedBase, actualBase, 0.001);
    }

    @Test
    public void testGetAltura() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        double expectedAltura = 5.0;
        double actualAltura = retangulo.getAltura();
        assertEquals(expectedAltura, actualAltura, 0.001);
    }
}
