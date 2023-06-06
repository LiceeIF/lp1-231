package semana14;

import org.junit.Test;
import org.junit.Assert;

public class CirculoTest {
    @Test
    public void testeCalcularArea(){
        Circulo circulo = new Circulo(5);
        double expectedArea = Math.PI*5*5;
        double actualArea = circulo.calcularArea();
        Assert.assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
    Circulo circulo = new Circulo(5);
    double expectedPerimetro = 2 * Math.PI * 5;
    double actualPerimetro = circulo.calcularPerimetro();
    Assert.assertEquals(expectedPerimetro, actualPerimetro, 0.0001);
    }

    @Test
    public void testSetRaio() {
    Circulo circulo = new Circulo(5);
    double expectedRaio = 10;
    circulo.setRaio(expectedRaio);
    double actualRaio = circulo.getRaio();
    Assert.assertEquals(expectedRaio, actualRaio, 0.0001);
    }

    @Test
    public void testSetRaioInvalido() {
    Circulo circulo = new Circulo(5);
    Assert.assertThrows(RuntimeException.class, () -> {
    circulo.setRaio(-1);
    });
    }
}
