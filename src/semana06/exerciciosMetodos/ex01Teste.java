package semana06.exerciciosMetodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class ex01Teste {
    @Test
    public void calculaVolumeTresNumerosPositivos() {
        double comprimento = 50;
        double altura = 40;
        double largura = 30;

        double volume = ex01.calcularVolume(comprimento, altura, largura);

        assertEquals(60.0, volume);
    }

    @Test
    public void calculaVolumeDoisNumerosPositivosEZero() {
        double comprimento = 50;
        double altura = 40;
        double largura = 0;

        double volume = ex01.calcularVolume(comprimento, altura, largura);

        assertEquals(0.0, volume);
    }

    @Test
    public void calculaPotenciaVolumePositivoTemperaturaDesejadaPositivaETemperaturaAmbientePositiva() {
        double volume = 60;
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 17;

        double potencia = ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(39.0, potencia);
    }

    @Test
    public void calculaPotenciaVolumePositivoTemperaturaDesejadaNegativaETemperaturaAmbientePositiva() {
        double volume = 60;
        double temperaturaDesejada = -5;
        double temperaturaAmbiente = 20;

        double potencia = ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(75.0, potencia);
    }

    @Test
    public void calculaPotenciaVolumePosTempDesejadaPosETempAmbienteNeg() {
        double volume = 60;
        double temperaturaDesejada = 21;
        double temperaturaAmbiente = -10;

        double potencia = ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(93.0, potencia);
    }

    @Test
    public void calculaPotenciaVolumeIgualAZeroTempDesejadaPosETempAmbientePos() {
        double volume = 0;
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 25;

        double potencia = ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(0.0, potencia);
    }

    @Test
    public void calcularFiltragemMinima() {
    
        double volume = 10.0;
    
        double soma = ex01.calcularFiltragemMinima(volume);
    
        assertEquals(20, soma);
    }

    @Test
    public void calcularFiltragemMaxima() {
    
        double volume = 10.0;
    
        double soma = ex01.calcularFiltragemMaxima(volume);
    
        assertEquals(30, soma);
    }
}
