package semana12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest{

    @Test
    public void testSacar() {

        Conta conta = new Conta(123, "Maria");
        conta.depositar(100.0);

        double saldoAtual = conta.sacar(50.0);

        Assertions.assertEquals(50.0, saldoAtual);
    }

    @Test
    public void testSacarValorMaiorQueSaldo() {

        int codigo = 123;
        String correntista = "Maria Fernanda";
        double saldoInicial = 100.0;
        double valorSaque = 150.0;
        Conta conta = new Conta(codigo, correntista);
        conta.saldo = saldoInicial;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(valorSaque, conta.saldo);
        });
    }

    @Test
    public void testDepositar() {

        int codigo = 123;
        String correntista = "Maria Fernanda";
        double saldoInicial = 100.0;
        double valorDeposito = 50.0;
        double expectedSaldo = saldoInicial + valorDeposito;
        Conta conta = new Conta(codigo, correntista);
        conta.saldo = saldoInicial;


        double saldoAtual = conta.depositar(valorDeposito);

        Assertions.assertEquals(expectedSaldo, saldoAtual, 0.01);
    }

    @Test
    public void testTransferir() {

        int codigoOrigem = 123;
        String correntistaOrigem = "Maria Fernanda";
        double saldoOrigem = 100.0;
        double valorTransferencia = 50.0;
        double saldoDestino = 0.0;
        Conta contaOrigem = new Conta(codigoOrigem, correntistaOrigem);
        contaOrigem.saldo = saldoOrigem;

        int codigoDestino = 456;
        String correntistaDestino = "Juliana Blanco";
        Conta contaDestino = new Conta(codigoDestino, correntistaDestino);
        contaDestino.saldo = saldoDestino;

        double expectedSaldoOrigem = saldoOrigem - valorTransferencia;
        double expectedSaldoDestino = saldoDestino + valorTransferencia;

        double saldoAtualOrigem = contaOrigem.transferir(contaDestino, valorTransferencia);
        double saldoAtualDestino = contaDestino.saldo;

        Assertions.assertEquals(expectedSaldoOrigem, saldoAtualOrigem, 0.01);
        Assertions.assertEquals(expectedSaldoDestino, saldoAtualDestino, 0.01);
    }

    @Test
    public void testTransferirValorMaiorQueSaldo() {

        int codigoOrigem = 123;
        String correntistaOrigem = "Maria Fernanda";
        double saldoOrigem = 100.0;
        double valorTransferencia = 150.0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            conta.transferir(valorSaque, conta.saldo);
    });
}
}
