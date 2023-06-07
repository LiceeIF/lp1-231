package semana14;
    
public class Circulo {

    public double raio;

    public Circulo(double raio){
        this.setRaio (raio);
    }
    
    public double calcularArea() {
        return Math.PI * raio*raio;
    }

    public double calcularPerimetro() {
        return 2* Math.PI * raio;
    }

    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        if(raio <= 0){
            throw new RuntimeException("Raio inválido");
        }
        this.raio = raio;
    }   
}

