package semana10;

public class Programa {
    public static void main(String[] args) {
        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);

        System.out.println(areaRet1);
        System.out.println(perimetroRet1);

        // objeto é uma instância de uma classe
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 100.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        //MOSTRANDO A CLASSE DO QUADRADO

        Quadrado quadrado1 = new Quadrado();
        quadrado1.lado = 10.0;

        System.out.println(quadrado1.calcularArea());
        System.out.println(quadrado1.calcularPerimetro());

        //MOSTRANDO A CLASSE DO CÍRCULO
        Circulo circle1 = new Circulo();
        circle1.raio = 10.0;

        System.out.println(circle1.calcularArea());
        System.out.println(circle1.calcularPerimetro());

        //UTILIZANDO COMO VÁRIAVEL, CASO OPCIONAL:
        //double areaCirculo = circle1.calcularArea();
        //System.out.println(areaCirculo);
    }

    //método para calcular a área
    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    //método para calcular o perímetro
    public static double calcularPerimetro(double base, double altura){
        return 2 *(base + altura);
    }
}
