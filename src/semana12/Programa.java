package semana12;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        //quadrado.lado = 10.0;

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        //UTILIZANDO CONSTRUTOR PARA A CLASSE RETÂNGULO

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);
        Retangulo r3 = new Retangulo(10.3, 7.5);

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());

        //UTILIZANDO CONSTRUTOR PARA A CLASSE CÍRCULO

        Circulo c1 = new Circulo(10.0);
        Circulo c2 = new Circulo(20.0);

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularPerimetro());

        //USANDO O PRIMEIRO CONSTRUTOR DA CLASSE AQUARIO

        Aquario aqua1 = new Aquario(10.0, 8.5, 2.1);
        Aquario aqua2 = new Aquario(7);

        System.out.println(aqua1.calcularVolume());
        System.out.println(aqua1.calcularQuantidadeLitrosFiltro());
        System.out.println(aqua2.calcularVolume());
        System.out.println(aqua2.calcularQuantidadeLitrosFiltro());
    }
}
