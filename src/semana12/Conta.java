package semana12;

public class Conta {
public int codigo;
public double saldo;
public double valor;
public String correntista;

//construtor para a classe conta nm
public Conta(int codigo, String correntista){
    this.codigo = codigo;
    this.correntista = correntista;
    this.saldo = 0.0;
}

    public double Sacar(double valor, double saldo){
        //pra sacar, voce precisa ver se existe saldo para retirar
        //se tiver saldo, voce retira a quantidade desejada
        //se o valor do saque for maior que o valor do saldo disponivel, nao é
        // possivel efetuar o saque
        if (saldo<valor){
        throw new IllegalArgumentException("valor indisponivel para saque");
    }
    return saldo - valor;
}

    public double Depositar(double valor){
        return saldo + valor;
    }

    public double Transferir(Conta contaDestino, double valor) {
        if(valor > saldo)
            throw new IllegalArgumentException("O valor a ser tranferido é maior do que o seu saldo!");

        contaDestino.Depositar(valor);
        return saldo;
    }
}