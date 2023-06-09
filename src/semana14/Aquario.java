package semana14;

public class Aquario {
    private double comprimento;
    private double largura;
    private double altura;

    public Aquario(double comprimento, double largura, double altura) {
        setComprimento(comprimento);
        setLargura(largura);
        setAltura(altura);
    }

    public Aquario(double valorUnico) {
        setComprimento(valorUnico);
        setLargura(valorUnico);
        setAltura(valorUnico);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("O valor do comprimento deve ser maior que zero.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("O valor da largura deve ser maior que zero.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("O valor da altura deve ser maior que zero.");
        }
    }

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public double[] calcularQuantidadeLitrosFiltro() {
        double[] filtragem = {calcularVolume() * 2, calcularVolume() * 3};
        return filtragem;
    }
}
