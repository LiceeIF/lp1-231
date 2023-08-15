package semana19;

public class ContaSalario extends Conta {
    private Empresa empresa;
    public ContaSalario(int numero, double tarifa, Empresa empresa, Correntista correntista){
        super(numero, tarifa, correntista);
        this.empresa = empresa;

    }

    @Override
    public double calcularTarifa(){
        return 0;
    }
}
