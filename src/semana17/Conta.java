package semana17;

import java.time.LocalDate;

public class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

    public void sacar (double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException ("Valor inválido para saque");
        }
        if (valor > saldo) {
        throw new IllegalArgumentException ("Saldo insuficiente para saque");
        }

        saldo -= valor;

        System.out.println("Saque de R$" + valor + " realizado por " + correntista) ;
        System.out.println("Saldo atual: R$" + saldo);
        }

        public void depositar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException ("Valor inválido para depósito");
        }

        saldo += valor;
        System.out.println ("Depósito de R$" + valor + " realizado para " + correntista);
        System.out.println ("Saldo atual: R$" + saldo);
    }
}
    