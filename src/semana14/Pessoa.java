package semana14;

public class Pessoa {
    private double altura;
    private double peso;

    public double calcularIMC() {
        return peso / ((altura / 100.0) * (altura / 100.0));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

