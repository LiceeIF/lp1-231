package semana14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void testSaque() {
        Conta conta = new Conta(1, "Bruna");

        conta.depositar(100.0);
        conta.sacar(50.0);

        double saldoAtual = conta.getSaldo();
        Assertions.assertEquals(50.0, saldoAtual, 0.01);
    }

    @Test
    public void testDeposito() {
        Conta conta = new Conta(1, "Bruna");

        conta.depositar(100.0);

        double saldoAtual = conta.getSaldo();
        Assertions.assertEquals(100.0, saldoAtual, 0.01);
    }

    @Test
    public void testTransferencia() {
        Conta contaOrigem = new Conta(1, "Bruna");
        Conta contaDestino = new Conta(2, "Maria Fernanda");

        contaOrigem.depositar(100.0);
        contaOrigem.transferir(contaDestino, 50.0);

        double saldoContaOrigem = contaOrigem.getSaldo();
        double saldoContaDestino = contaDestino.getSaldo();

        Assertions.assertEquals(50.0, saldoContaOrigem, 0.01);
        Assertions.assertEquals(50.0, saldoContaDestino, 0.01);
    }

    @Test
    public void testConstrutorValido() {
        Conta conta = new Conta(1, "Bruna");

        int codigo = conta.getCodigo();
        String correntista = conta.getCorrentista();

        Assertions.assertEquals(1, codigo);
        Assertions.assertEquals("Bruna", correntista);
    }

    @Test
    public void testConstrutorCodigoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Conta(0, "Bruna");
        });
    }

    @Test
    public void testConstrutorCorrentistaInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Conta(1, "Bruna");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Conta(1, "Nome do correntista inválido.");
        });
    }
}
