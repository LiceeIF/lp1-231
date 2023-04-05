package semana06.exerciciosMetodos;

import java.util.Scanner;

public class ex02 {
    //exercício do IMC por meio de métodos;

    public static void main(String[] args) {
        System.out.println("Programa para calcular IMC!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu peso, em KG: ");
        float peso = sc.nextFloat();
        System.out.println("Insira sua altura, em metros: ");
        float altura = sc.nextFloat();
        sc.close();
        double pesoIdeal = calcularPesoIdeal(peso, altura);
        
        if (calcularIMC(altura, peso) < 18.5){
            System.out.println("Seu IMC é de: " + calcularIMC(altura, peso) + ", e você se encaixa na classificação de Baixo peso!");
        }
        if (calcularIMC(altura, peso) >= 18.5 && calcularIMC(altura, peso) <= 24.9){
            System.out.println("Seu IMC é de: " + calcularIMC(altura, peso) + ", e você se encaixa na classificação de Peso normal!");
        }
        if (calcularIMC(altura, peso) >= 25.0 && calcularIMC(altura, peso) <= 29.9){
            System.out.println("Seu IMC é de: " + calcularIMC(altura, peso) + ", e você se encaixa na classificação de Excesso de peso!");
        }
        if (calcularIMC(altura, peso) >= 30.0 && calcularIMC(altura, peso) <=34.9){
            System.out.println("Seu IMC é de: " + calcularIMC(altura, peso) + ", e você se encaixa na classificação de Obesidade de Classe 1!");
        }
        if (calcularIMC(altura, peso) >= 35.0 && calcularIMC(altura, peso) <= 39.9){
            System.out.println("Seu IMC é de: " + calcularIMC(altura, peso) + ", e você se encaixa na classificação de Obesidade de Classe 2!");
        }
        if (calcularIMC(altura, peso) >= 40.0){
            System.out.println("Seu IMC é de: " + calcularIMC(altura, peso) + ", e você se encaixa na classificação de Obesidade de Classe 3!");
        }

        if (calcularIMC(altura, peso) <= 18.5 || calcularIMC(altura, peso) >= 24.9){
            if (calcularPesoIdeal(peso, altura) < 0){
                pesoIdeal = pesoIdeal * (-1);
                System.out.printf(" Você precisa ganhar: %.2f kgs!", calcularPesoIdeal(peso, altura));
            } else {
                if (calcularPesoIdeal(peso, altura) > 0){
                    System.out.printf("Você precisa perder: %.2f kgs!", calcularPesoIdeal(peso, altura));
                }  
            }

        }
    }

    public static double calcularIMC(double altura, double peso){
        return peso / (altura * altura);
    }
    public static double calcularPesoIdeal(double peso, double altura){
        return peso - (24.9 * altura * altura);
    }
}
