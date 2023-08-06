package semana17;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.limite = limite;
    }

    //sobrescrita do método da superclasse Conta 
    @Override
    public void sacar(double valor) {
        if(valor > limite) {
            throw new RuntimeException("Saque fora do limite");
        }

        super.sacar(valor);
    }

    @Override
    public double calcularTarifa() {
        return 10.0;
    }
}