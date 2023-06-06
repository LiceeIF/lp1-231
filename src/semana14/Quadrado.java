package semana14;

public class Quadrado {
    //construtor da classe:
    
    public double lado;

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4* lado;
    }

//private: não se pode modificar o valor e não se pode ler também

//
//public tipo ATRIBUTO getNOMEATRIBUTO(){
//    return ATRIBUTO;
//}

public double getLado(){
    return lado;
}

//SET
// public void setNOME_DO_ATRIBUTO(TIPO_ATRIBUTO NOME_DO_ATRIBUTO){
//     this.NOME_DO_ATRIBUTO = NOME_DO_ATRIBUTO;
// }
//EXEMPLO:
// public void setLado(double lado){
//     this.lado = lado;
// }
// }

public void setLado (double lado){
    if(lado > 0){
        throw new RuntimeException("lado inválido");
    }
    this.lado = lado;
}
}