package semana12;
    
public class Circulo {

    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

/* por que utilizar THIS?:
 * public Circulo (double r){
 * raio = r;
 * }
 * logo, usar this evita confusões no código
 */
    
    public double calcularArea() {
        return Math.PI * raio*raio;
    }

    public double calcularPerimetro() {
        return 2* Math.PI * raio;
    }
}

