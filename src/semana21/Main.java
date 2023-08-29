package semana21;

import java.util.ArrayList;

// interface  


// class abstrata FiguraGeometrica -
// interface FiguraGeometrica

/* quadrado - lado - calcular area e perimetro
retangulo - base e altura - calcular area e perimetro
circulo - 

 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Oioi");

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(10, 5);

        Circulo c1 = new Circulo(5);


        Tela tela = new Tela();
        // tela.addQuadrado(q1);
        // tela.addQuadrado(q2);
        // tela.addRetangulo(r1);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        tela.addFigura(c1);


        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());



        //arrays

        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 3.0;
        notas[2] = 5.0;
        // este array de 4a posição dará erro de indice:
        // notas[3] = 7.0;

        System.out.println(notas[0]);

        // COLEÇÕES
        // List
        // Set
        // Map

        //String[] nomes = new String [10]; este é um array

        ArrayList<String> nomes = new ArrayList<>();//arraylist sem index definido

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        String nome = nomes.get(1);
        System.out.println(nome);

        System.out.println(nomes.size());

        //nomes.clear(); - este limpa todos os elementos do LIST

        System.out.println(nomes.size());

        //FOR PARA O ARRAYLIST:

        // for (int i = 0; i < nomes.size(); i++){
        //     String nome = nomes.get(i);
        // }

        // FOREACH PARA O ARRAYLIST:

        for (String n : nomes){
            System.out.println(n);
        }

        nomes.remove(0); 
        //pode-se passar no parametro tanto a posição como o valor, ex. "Jõao"


        for (String n : nomes){
            System.out.println(n);
        }

    }
}
