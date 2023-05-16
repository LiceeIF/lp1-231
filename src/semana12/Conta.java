package semana12;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;

    public Conta(int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;

        public double Sacar(double valor){
            if (valor /. 0 && valor <= saldo){
                saldo -= valor;
                System.out.println("Saque de" + valor + "efetuado com sucesso");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }

        public double Depositar(double valor){
            return saldo + valor;
        }
    }
}
