package semana11;

public class Pessoa {
    public double altura;
    public double peso;

    public double calcularIMC() {
        if(altura == 0) 
            throw new RuntimeException("Denominador não pode ser 0!");
        
        return peso / ((altura / 100.0) * (altura / 100.0));
    }

    public String getFaixa() {
        if(calcularIMC() < 18.5) {
            return "Classificação: Baixo Peso";

        } else if(calcularIMC() >= 18.5 && calcularIMC() < 25) {
            return "Classificação: Peso Normal";

        } else if(calcularIMC() >= 25 && calcularIMC() < 30) {
            return "Classificação: Excesso de peso";

        } else if(calcularIMC() >= 30 && calcularIMC() < 35) {
            return "Classificação: Obesidade classe 1";

        } else if(calcularIMC() >= 35 && calcularIMC() < 40) {
            return "Classificação: Obesidade classe 2";

        } else {
            return "Classificação: Obesidade classe 3";    
        }
    }

    public String getSituacao() {
        double pesoAPerder = peso - (24.9 * (altura / 100.0) * (altura / 100.0));

        if(pesoAPerder < 0) {
            return "GANHAR";

        } else  if(pesoAPerder > 1) {
            return "PERDER";

        } else {
            return "NORMAL";
        }
    }
}
