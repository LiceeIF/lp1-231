package semana14;

public class Conta {
    private final int codigo;
    private double saldo;
    private final String correntista;

    public Conta(int codigo, String correntista) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("O código deve ser um valor maior que zero.");
        }
        if (correntista.length() < 5 || correntista.length() > 100) {
            throw new IllegalArgumentException("O nome do correntista deve ter entre 5 e 100 caracteres.");
        }
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public double sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Valor indisponível para saque.");
        }
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }

    public double transferir(Conta contaDestino, double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("O valor a ser transferido é maior do que o seu saldo!");
        }
        setSaldo(getSaldo() - valor);
        contaDestino.depositar(valor);
        return getSaldo();
    }
}