package semana20;

//é necessário deixar como abstract pois esta é uma classe que tem atributos usados por outras classes

public abstract class Questao { 
    private int numero; 
    private String enunciado; 
    
    public Questao(int numero, String enunciado)
     { 
        this.numero = numero; 
        this.enunciado = enunciado;
     }

      public boolean validarResposta(String resposta)
    { 
        return false;
    } 

    public abstract int getPontuacao();

    public void mostrarEnunciado()
    { 
        System.out.println(numero + ". " + enunciado); 
    }
}
