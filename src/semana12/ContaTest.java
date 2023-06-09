package semana12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest{

    @Test
    public void testSacar() {
        Conta conta = new Conta(1, "João");
        conta.saldo = 100.0;
        double novoSaldo = conta.Sacar(50.0, conta.saldo);
        assertEquals(50.0, novoSaldo, 0.001);

        assertThrows(IllegalArgumentException.class, () -> conta.Sacar(200.0, conta.saldo));
    }

    @Test
    public void testDepositar() {
        Conta conta = new Conta(1, "João");
        conta.saldo = 100.0;
        double novoSaldo = conta.Depositar(50.0);
        assertEquals(150.0, novoSaldo, 0.001);
    }

    @Test
    public void testTransferir() {
        Conta conta1 = new Conta(1, "João");
        Conta conta2 = new Conta(2, "Maria");
        conta1.saldo = 100.0;
        conta2.saldo = 50.0;
        double novoSaldoConta1 = conta1.Transferir(conta2, 30.0);
        double novoSaldoConta2 = conta2.saldo;
        assertEquals(70.0, novoSaldoConta1, 0.001);
        assertEquals(80.0, novoSaldoConta2, 0.001);

        assertThrows(IllegalArgumentException.class, () -> conta1.Transferir(conta2, 100.0));
    }
}
