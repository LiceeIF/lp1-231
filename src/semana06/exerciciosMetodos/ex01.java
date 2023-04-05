package semana06.exerciciosMetodos;

import java.util.Scanner;

public class ex01 {
    //exercicio do aquario por meio de métodos;

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o comprimento, a altura e a largura do aquário, em cm: ");
        double comprimento = scan.nextDouble();
        double altura = scan.nextDouble();
        double largura = scan.nextDouble();

        System.out.println("Agora, insira a temperatura desejada da água e a temperatura ambiente: ");
        double temperaturaDesejada = scan.nextDouble();
        double temperaturaAmbiente = scan.nextDouble();

        double volume = calcularVolume(comprimento, altura, largura);

        System.out.printf("O volume do aquário é de %.1f L", volume);
        System.out.printf("A potência do termostato necessária é de %.1f W", calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente));
        System.out.printf("A quantidade de filtragem deve ser, no mínimo, %.1f L a %.1f L por hora\n", calcularFiltragem(volume) [0], calcularFiltragem(volume) [1]);

        scan.close();
    }

    public static double calcularVolume(double comprimento, double altura, double largura) {
        return (comprimento * altura * largura) / 1000;
    }

    public static double calcularPotencia(double volume, double temperaturaDesejada, double temperaturaAmbiente) {
        return volume * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public static double [] calcularFiltragem(double volume) {
        double[] filtragem = {volume*2, volume*3};
        return filtragem;
    }
    
    public static double calcularFiltragemMinima(double volume){
        return (volume*2);
    }

    public static double calcularFiltragemMaxima(double volume){
        return (volume*3);
    }
}

