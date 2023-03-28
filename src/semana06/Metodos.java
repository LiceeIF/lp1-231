package semana06;

//um método sempre estará dentro de uma classe, nunca fora da classe e nem dentro de outro método. Métodos precisam retornar valores. Um método estático

public class Metodos {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        imprimirPalavra("Olá Mundo!");
        imprimirPalavra("testeTeste");

        double soma = Calculadora.somar(10.0, 2.3);
        System.out.println(soma);

        System.out.println(Calculadora.somar(3.3, 4.1));
    }


// assinatura do método
// public - acesso em qualquer parte do projeto
// static - método atrelado à classe (não precisa criar um objeto)
// void - tipo de retorno (sem retorno)
// imprimirPalavra - nome do método
// String palavra - parâmetro (pode ter zero ou muitos)
// Definindo o método:
    public static void imprimirPalavra(String palavra){
        System.out.println(palavra.toUpperCase());
    }
}
