package semana12;

public class Pessoa {
    public double altura;
    public double peso;

    public Pessoa(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / ((altura / 100.0) * (altura / 100.0));
    }
}
