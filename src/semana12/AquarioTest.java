package semana12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void testCalcularVolume() {

        double comprimento = 100.0;
        double largura = 50.0;
        double altura = 60.0;
        double expectedVolume = 300.0;
        Aquario aquario = new Aquario(comprimento, largura, altura);


        double volumeCalculado = aquario.calcularVolume();

        Assertions.assertEquals(expectedVolume, volumeCalculado, 0.01);
    }

    @Test
    public void testCalcularPotenciaDoTermostato() {

        double comprimento = 100.0;
        double largura = 50.0;
        double altura = 60.0;
        double temperaturaDesejada = 28.0;
        double temperaturaAmbiente = 25.0;
        double expectedPotencia = 18.0;
        Aquario aquario = new Aquario(comprimento, largura, altura);

        double potenciaCalculada = aquario.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        Assertions.assertEquals(expectedPotencia, potenciaCalculada, 0.01);
    }

    @Test
    public void testCalcularQuantidadeLitrosFiltro() {

        double comprimento = 100.0;
        double largura = 50.0;
        double altura = 60.0;
        double[] expectedFiltragem = {600.0, 900.0};
        Aquario aquario = new Aquario(comprimento, largura, altura);

        double[] filtragemCalculada = aquario.calcularQuantidadeLitrosFiltro();

        Assertions.assertArrayEquals(expectedFiltragem, filtragemCalculada, 0.01);
    }
}
