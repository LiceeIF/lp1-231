package semana12;

public class Aquario {
    public double comprimento;
    public double largura;
    public double altura;

    public Aquario(double comprimento, double largura, double altura){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public Aquario(double valorUnico){
        this.comprimento = valorUnico;
        this.largura = valorUnico;
        this.altura = valorUnico;
    }

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public double [] calcularQuantidadeLitrosFiltro() {
        double [] filtragem = {calcularVolume() * 2, calcularVolume() * 3};
        return filtragem;
    }
}
