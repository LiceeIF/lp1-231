package semana04.exercicios;

import java.util.Scanner;

public class ex03 {
    /* Crie um programa em Java que recebe como entrada o valor de uma compra e apresenta como saída o valor final com desconto e o desconto aplicado com base nas seguintes regras
    Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
    Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
    Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
    Compras iguais ou superiores a R$ 500,00 - 15% de desconto */ 

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao programa!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor final da compra:");
        double valorDaCompra = sc.nextDouble();

        if (valorDaCompra <= 9.99) {
            System.out.println("O desconto não se aplica à esta compra:" + valorDaCompra);
        }

        if (valorDaCompra >= 10 && valorDaCompra <= 99.99) {
            double primeiroDesconto = valorDaCompra - (valorDaCompra * 0.05);
            System.out.println("Desconto de 5% fornecido:" + primeiroDesconto);
        }

        if (valorDaCompra >= 100 && valorDaCompra <= 499.99) {
            double segundoDesconto = valorDaCompra - (valorDaCompra * 0.10);
            System.out.println("Desconto de 10% fornecido:" + segundoDesconto);
        }

        if (valorDaCompra >= 500.00) {
            double terceiroDesconto = valorDaCompra - (valorDaCompra * 0.15);
            System.out.println("Desconto de 15% fornecido:" + terceiroDesconto);
        }
        sc.close();
    }

}
