package semana14;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void testCalcularIMC() {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(170);
        pessoa.setPeso(70);
        double expectedIMC = 24.22;
        double actualIMC = pessoa.calcularIMC();
        assertEquals(expectedIMC, actualIMC, 0.01);
    }

    @Test
    public void testGetAltura() {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(170);
        double expectedAltura = 170;
        double actualAltura = pessoa.getAltura();
        assertEquals(expectedAltura, actualAltura, 0.01);
    }

    @Test
    public void testSetAltura() {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(170);
        double expectedAltura = 170;
        double actualAltura = pessoa.getAltura();
        assertEquals(expectedAltura, actualAltura, 0.01);
    }

    @Test
    public void testGetPeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(70);
        double expectedPeso = 70;
        double actualPeso = pessoa.getPeso();
        assertEquals(expectedPeso, actualPeso, 0.01);
    }

    @Test
    public void testSetPeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(70);
        double expectedPeso = 70;
        double actualPeso = pessoa.getPeso();
        assertEquals(expectedPeso, actualPeso, 0.01);
    }
}