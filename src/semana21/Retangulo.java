package semana21;

public class Retangulo implements FiguraGeometrica {
    private double base;
    private double altura;
     
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
       return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base + altura);
    }
    
}
