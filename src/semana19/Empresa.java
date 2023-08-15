package semana19;

public class Empresa {
    private String cnpj;
    private String nome;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    //getters e setters para a classe: 

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
