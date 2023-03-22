package semana05;

import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao programa!!");
        System.out.println("Insira as seguintes informações a respeito do seu aquário");
            Scanner sc = new Scanner(System.in);
        System.out.println("Insira o comprimento do seu aquário em centímetros:");
        double comprimento = sc.nextDouble();
        System.out.println("Agora insira o valor da altura de seu aquário em centímetros: ");
        double altura = sc.nextDouble();
        System.out.println("Por fim, insira o valor da largura de seu aquário em centímetros: ");
        double largura = sc.nextDouble();

        double volume = (comprimento*altura*largura)/1000;

        System.out.println("O volume do seu aquário é, em litros: " + volume);

        System.out.println("Para calcular a potência do termostato de seu aquário, insira a temperatura ambiente: ");
        double temp_ambiente = sc.nextDouble();
        System.out.println("Insira a temperatura que o aquário precisa alcançar:");
        double temp_desejada = sc.nextDouble();

        double potencia = volume*0.05*(temp_desejada-temp_ambiente);

        System.out.println("A potência de seu termostato, em watts, será:" + potencia);

        double filtragem_minima = (volume*2);
        double filtragem_maxima = (volume*3);

        System.out.println("A filtragem por hora no mínimo deverá ser de:" + filtragem_minima);
        System.out.println("A filtragem por hora no máximo deverá ser de:" + filtragem_maxima);


        sc.close();

    }
}
