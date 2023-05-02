package semana10;

public class Circulo {
    // atributos da classe
    public double raio;

    // métodos da classe
    public double calcularArea() {
        return Math.PI * raio*raio;
        //OU: return Math.PI * Math.pow(raio, 2);
    }
    public double calcularPerimetro() {
        return 2* Math.PI * raio;
    }
}
