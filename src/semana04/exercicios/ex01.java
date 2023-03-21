package semana04.exercicios;

import java.util.Scanner;

public class ex01 {
 //EXERCÍCIO 1: Escreva um programa em Java que solicita ao usuário um número inteiro e apresenta seu antecessor e sucessor.
 public static void main(String[] args) {
    System.out.println("Seja bem-vindo ao programa!");
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira um  número inteiro");
    int num = sc.nextInt();
    int num_antecessor = num - 1;
    int num_sucessor = num + 1;

    System.out.println("Antecessor: " + num_antecessor);
    System.out.println("Sucessor: " + num_sucessor);

    sc.close();
}
}