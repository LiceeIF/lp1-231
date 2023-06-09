package semana14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AquarioTest {
        
    @Test
    public void testCalcularVolume() {
        Aquario aquario = new Aquario(10.0, 5.0, 8.0);
        double volume = aquario.calcularVolume();
        assertEquals(4.0, volume, 0.001);
    }

    @Test
    public void testCalcularPotenciaDoTermostato() {
        Aquario aquario = new Aquario(10.0, 5.0, 8.0);
        double potencia = aquario.calcularPotenciaDoTermostato(30.0, 25.0);
        assertEquals(0.2, potencia, 0.001);
    }

    @Test
    public void testCalcularQuantidadeLitrosFiltro() {
        Aquario aquario = new Aquario(10.0, 5.0, 8.0);
        double[] quantidadeLitrosFiltro = aquario.calcularQuantidadeLitrosFiltro();
        assertEquals(8.0, quantidadeLitrosFiltro[0], 0.001);
        assertEquals(12.0, quantidadeLitrosFiltro[1], 0.001);
    }

    @Test
    public void testSetComprimento() {
        Aquario aquario = new Aquario(10.0, 5.0, 8.0);
        aquario.setComprimento(12.0);
        assertEquals(12.0, aquario.getComprimento(), 0.001);

        assertThrows(IllegalArgumentException.class, () -> aquario.setComprimento(-5.0));
    }

    @Test
    public void testSetLargura() {
        Aquario aquario = new Aquario(10.0, 5.0, 8.0);
        aquario.setLargura(6.0);
        assertEquals(6.0, aquario.getLargura(), 0.001);

        assertThrows(IllegalArgumentException.class, () -> aquario.setLargura(0.0));
    }

    @Test
    public void testSetAltura() {
        Aquario aquario = new Aquario(10.0, 5.0, 8.0);
        aquario.setAltura(10.0);
        assertEquals(10.0, aquario.getAltura(), 0.001);

        assertThrows(IllegalArgumentException.class, () -> aquario.setAltura(-3.0));
    }
}
