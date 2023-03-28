package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void somarDoisNumerosPositivos(){
        //AAA: Arrange -
        double n1 = 10.0;
        double n2 = 2.0;

        // Act -
        double soma = Calculadora.somar(n1, n2);

        // Assert -
        assertEquals(12.0, soma);
    }

    @Test
    public void somarDoisNumerosPositivosEUmNegativo(){

        double n1 = 10.0;
        double n2 = -2.0;

        double soma = Calculadora.somar(n1, n2);

        assertEquals(8.0, soma);
}


@Test
public void somarDoisNumerosNegativos(){

    double n1 = -10.0;
    double n2 = -2.0;

    double soma = Calculadora.somar(n1, n2);

    assertEquals(-12.0, soma);
}

@Test
public void subtrairDoisNumerosPositivos(){

    double n1 = 10.0;
    double n2 = 2.0;

    double subtracao = Calculadora.subtrair(n1, n2);

    assertEquals(8.0, subtracao);
}

@Test
public void subtrairUmNumeroPositivo(){

    double n1 = 10.0;
    double n2 = -2.0;

    double subtracao = Calculadora.subtrair(n1, n2);

    assertEquals(12.0, subtracao);
}

@Test
public void subtrairDoisNumerosNegativos(){

    double n1 = -10.0;
    double n2 = -2.0;

    double subtracao = Calculadora.subtrair(n1, n2);

    assertEquals(-8.0, subtracao);
}

@Test
public void multiplicarDoisNumerosPositivos(){

    double n1 = 10.0;
    double n2 = 2.0;

    double multiplicacao = Calculadora.multiplicar(n1, n2);

    assertEquals(20.0, multiplicacao);
}

@Test
public void multiplicarUmNumeroNegativoEUmPositivo(){

    double n1 = 10.0;
    double n2 = -2.0;

    double multiplicacao = Calculadora.multiplicar(n1, n2);

    assertEquals(-20.0, multiplicacao);
}

@Test
public void multiplicarDoisNumerosNegativos(){

    double n1 = -10.0;
    double n2 = -2.0;

    double multiplicacao = Calculadora.multiplicar(n1, n2);

    assertEquals(20.0, multiplicacao);
}

@Test
public void DividirDoisNumerosPositivos(){

    double n1 = 10.0;
    double n2 = 2.0;

    double divisao = Calculadora.dividir(n1, n2);

    assertEquals(5.0, divisao);
}

@Test
public void DividirUmNumeroNegativoEUmPositivo(){

    double n1 = 10.0;
    double n2 = -2.0;

    double divisao = Calculadora.dividir(n1, n2);

    assertEquals(-5.0, divisao);
}

@Test
public void DividirDoisNumerosNegativos(){

    double n1 = -10.0;
    double n2 = -2.0;

    double divisao = Calculadora.dividir(n1, n2);

    assertEquals(5.0, divisao);
}
}
