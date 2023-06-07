package semana14;

import semana12.Aquario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class exAquarioTest {
        @Test
        public void testCalcularVolume() {
            Aquario aquario = new Aquario(10, 5, 2);
            double expectedVolume = 10.0;
            double actualVolume = aquario.calcularVolume();
            assertEquals(expectedVolume, actualVolume, 0.001);
        }
    
        @Test
        public void testCalcularPotenciaDoTermostato() {
            Aquario aquario = new Aquario(10, 5, 2);
            double temperaturaDesejada = 28;
            double temperaturaAmbiente = 25;
            double expectedPotencia = 0.3;
            double actualPotencia = aquario.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);
            assertEquals(expectedPotencia, actualPotencia, 0.001);
        }
    
        @Test
        public void testCalcularQuantidadeLitrosFiltro() {
            Aquario aquario = new Aquario(10, 5, 2);
            double[] expectedFiltragem = {20.0, 30.0};
            double[] actualFiltragem = aquario.calcularQuantidadeLitrosFiltro();
            assertArrayEquals(expectedFiltragem, actualFiltragem, 0.001);
        }
    
        @Test
        public void testGetComprimento() {
            Aquario aquario = new Aquario(10, 5, 2);
            double expectedComprimento = 10.0;
            double actualComprimento = aquario.getComprimento();
            assertEquals(expectedComprimento, actualComprimento, 0.001);
        }
    
        @Test
        public void testGetLargura() {
            Aquario aquario = new Aquario(10, 5, 2);
            double expectedLargura = 5.0;
            double actualLargura = aquario.getLargura();
            assertEquals(expectedLargura, actualLargura, 0.001);
        }
    
        @Test
        public void testGetAltura() {
            Aquario aquario = new Aquario(10, 5, 2);
            double expectedAltura = 2.0;
            double actualAltura = aquario.getAltura();
            assertEquals(expectedAltura, actualAltura, 0.001);
        }
    
        @Test
        public void testSetComprimentoValido() {
            Aquario aquario = new Aquario(10, 5, 2);
            double novoComprimento = 15.0;
            aquario.setComprimento(novoComprimento);
            assertEquals(novoComprimento, aquario.getComprimento(), 0.001);
        }
    
        @Test(expected = IllegalArgumentException.class)
        public void testSetComprimentoInvalido() {
            Aquario aquario = new Aquario(10, 5, 2);
            double novoComprimento = -5.0;
            aquario.setComprimento(novoComprimento);
        }
    
        @Test
        public void testSetLarguraValida() {
            Aquario aquario = new Aquario(10, 5, 2);
            double novaLargura = 8.0;
            aquario.setLargura(novaLargura);
            assertEquals(novaLargura, aquario.getLargura(), 0.001);
        }
    
        @Test(expected = IllegalArgumentException.class)
        public void testSetLarguraInvalida() {
            Aquario aquario = new Aquario(10, 5, 2);
            double novaLargura = -3.0;
            aquario.setLargura(novaLargura);
        }
    
        @Test
        public void testSetAlturaValida() {
            Aquario aquario = new Aquario(10, 5, 2);
            double novaAltura = 3.0;
            aquario.setAltura(novaAltura);
            assertEquals(novaAltura, aquario.getAltura(), 0.001);
        }
    
        @Test(expected = IllegalArgumentException.class)
        public void testSetAlturaInvalida() {
            Aquario aquario = new Aquario(10, 5, 2);
            double novaAltura = 0.0;
            aquario.setAltura(novaAltura);
        }
    }    
}
