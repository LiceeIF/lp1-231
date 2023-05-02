package semana10;

//classe
public class Retangulo{
    // atributos da classe
    public double base;
    public double altura;

    // métodos da classe
    // método NÃO static pois é associado à classe, não ao objeto
    public double calcularArea() {
        return base * altura;
    }
    public double calcularPerimetro() {
        return 2*(base + altura);
    }
}
