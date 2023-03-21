package semana04.exercicios;

import java.util.Scanner;

public class ex02 {
    //Escreva um programa em Java que solicita ao usuário três números e apresenta a média aritmética dos números informados.
    public static void main(String[] args) {

        System.out.println("Seja bem-vindo ao programa!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        float primeiro_num = sc.nextFloat();
        System.out.println("Insira o segundo número:");
        float segundo_num = sc.nextFloat();
        System.out.println("Insira o terceiro número:");
        float terceiro_num = sc.nextFloat();

        float media = (primeiro_num + segundo_num + terceiro_num)/3;

        System.out.println("A média aritimética é:" + media);
        sc.close();
    }
}
