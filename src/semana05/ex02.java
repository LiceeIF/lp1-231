package semana05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("BEM-VINDO AO PROGRAMA DE IMC!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua massa em kg:");
        float massa = sc.nextFloat();
        System.out.println("Insira sua altura em M:");
        float altura = sc.nextFloat();

        float IMC = massa/(altura*altura);

        if (IMC<18.5){
            System.out.println("Você está abaixo do peso. IMC:" + IMC);
        }

        if(IMC>18.5 && IMC<24.9){
            System.out.println("Você está no peso normal. IMC:" + IMC);
        }

        if (IMC>25.0 && IMC<29.9){
            System.out.println("Você está acima do peso. IMC:" + IMC);
        }

        if (IMC>30.0 && IMC<34.9){
            System.out.println("CUIDADO! Seu IMC atinge a obesidade de classe 1. IMC:" + IMC);
        }

        if (IMC>35.0 && IMC<39.9){
            System.out.println("CUIDADO! Seu IMC atinge a obesidade de classe 2. IMC:" + IMC);
        }

        if (IMC>=40.0){
            System.out.println("CUIDADO! Seu IMC atinge a obesidade de classe 3. IMC:" + IMC);
        }

        double pesoIdeal = 0;

        if (IMC <= 18.5 || IMC >= 24.9) {
            pesoIdeal = massa - (24.9 * (altura * altura));
        }
            if (pesoIdeal < 0) {
                pesoIdeal = pesoIdeal * (-1);
                System.out.printf(" Você precisa ganhar: %.2f KGs!", pesoIdeal);
            } else {
                if (pesoIdeal > 0){
                    System.out.printf("Você precisa perder: %.2f KGs!", pesoIdeal);
                }  
            }
        sc.close();
    }
}
