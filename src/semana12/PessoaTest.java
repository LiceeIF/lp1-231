package semana12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testCalcularIMC() {
        double altura = 180.0;
        double peso = 80.0;
        double expectedIMC = 24.69; 

        Pessoa pessoa = new Pessoa(altura, peso);

        double calculatedIMC = pessoa.calcularIMC();

        Assertions.assertEquals(expectedIMC, calculatedIMC, 0.01);
        altura = 160.0;
        peso = 55.0;
        expectedIMC = 21.48;

        pessoa = new Pessoa(altura, peso);
        calculatedIMC = pessoa.calcularIMC();
        Assertions.assertEquals(expectedIMC, calculatedIMC, 0.01);
    }
}
