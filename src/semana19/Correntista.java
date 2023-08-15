package semana19;

import java.util.List;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas;

    

    public void addConta(Conta conta){
        this.contas.add(conta);
    }
 
    public double calcularTarifas(){
        double totalTarifas = 0;
        for(Conta conta : contas){
            totalTarifas += conta.calcularTarifa();
        }
        return totalTarifas;
    }
}
