package semana21;

import java.util.ArrayList;

public class Tela {
//modificador      tipo      nome do atributo
//private ArrayList<Quadrado> quadrados;
//private ArrayList<Retangulo> retangulos;

    private ArrayList<FiguraGeometrica> figuras;

    public Tela(){
        //quadrados = new ArrayList<>();
        //retangulos = new ArrayList<>();
        figuras = new ArrayList<>();
    }

    public void addFigura(FiguraGeometrica f){
        figuras.add(f);
    }

    //public void addQuadrado(Quadrado q){
        //quadrados.add(q);
    //}

    // public void addRetangulo(Retangulo r){
    //     retangulos.add(r);
    // }

    public double totalArea(){
         double total = 0.0;

    //     for (Quadrado quadrado : quadrados){
    //         total += quadrado.calcularArea();
    //     }

    //     for (Retangulo retangulo : retangulos){
    //         total += retangulo.calcularArea();
    //     }

//este for contém polimorfismo pois ele tem a capacidade de assumir diferentes formas:
        for (FiguraGeometrica figura : figuras){
            total += figura.calcularArea();
        }

    return total;
    }

    public double totalPerimetro(){
        double total = 0.0;

        for (FiguraGeometrica figura : figuras){
            total += figura.calcularPerimetro();
        }

        // for (Quadrado quadrado : quadrados){
        //     total += quadrado.calcularPerimetro();
        // }

        // for (Retangulo retangulo : retangulos){
        //     total += retangulo.calcularPerimetro();
        // }

        return total;
    }

}
