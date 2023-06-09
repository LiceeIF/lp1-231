package semana14;

import org.junit.Test;
import static org.junit.Assert.*;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(4.0,5.0);
        double expectedArea = 20.0;
        double actualArea = retangulo.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(4.0, 5.0);
        double expectedPerimetro = 18.0;
        double actualPerimetro = retangulo.calcularPerimetro();
        assertEquals(expectedPerimetro, actualPerimetro, 0.001);
    }

    @Test
    public void testSetBaseInvalida() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertThrows(RuntimeException.class, () -> retangulo.setBase(-4));
    }


    @Test
    public void testSetAlturaInvalida() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertThrows(RuntimeException.class, () -> retangulo.setAltura(-5));
    }


    @Test
    public void testGetBase() {
        Retangulo retangulo = new Retangulo(4.0,5.0);
        double expectedBase = 4.0;
        double actualBase = retangulo.getBase();
        assertEquals(expectedBase, actualBase, 0.001);
    }

    @Test
    public void testGetAltura() {
        Retangulo retangulo = new Retangulo(4.0,5.0);
        double expectedAltura = 5.0;
        double actualAltura = retangulo.getAltura();
        assertEquals(expectedAltura, actualAltura, 0.001);
    }
}
