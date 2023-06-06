package semana14;

public class Retangulo {

    //construtor da classe:
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double base;
    public double altura;

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2*(base + altura);
    }    

public double getBase(){
    return base;
}

public double getAltura(){
    return altura;
}

    public void setBase(double base){
        if(base > 0){
            throw new RuntimeException("Base inválida");
        }
        this.base = base;
    }
    public void setAltura(double altura){
        if(altura > 0){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }
}
