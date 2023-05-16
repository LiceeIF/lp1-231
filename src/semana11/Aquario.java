package semana11;

public class Aquario {
    
    public double comprimento;
    public double altura;
    public double largura;

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
