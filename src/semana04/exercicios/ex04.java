package semana04.exercicios;

import java.util.Scanner;

public class ex04 {
    /*O código identificador de funcionários de uma empresa contém 7 caracteres, inicia com a sequência de caracteres BR, em seguida apresenta um número inteiro entre 0001 e 9999 
    e finaliza com o caractere X. Crie um programa em Java que solicita ao usuário um identificador 
    e apresenta se o que foi informado é um valor válido ou inválido. */  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM-VINDO AO PROGRAMA");
        System.out.println("Insira seu número de identificação: ");
        String identificador = sc.nextLine();
        char terceira_letra = identificador.charAt(2);
        char quarta_letra = identificador.charAt(3);
        char quinta_letra = identificador.charAt(4);
        char sexta_letra = identificador.charAt(5);

        if (identificador.length() == 7 && identificador.startsWith("BR") && identificador.endsWith("X") && Character.isDigit(terceira_letra) && Character.isDigit(quarta_letra) && Character.isDigit(quinta_letra) && Character.isDigit(sexta_letra)){
            System.out.println("Seu número identificador é válido!");
        } else {
            System.out.println("Seu número identificador é inválido!");
        }
        sc.close();
    }
}