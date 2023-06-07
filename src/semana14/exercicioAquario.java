package semana14;

public class exercicioAquario {
    public class Aquario {
        private double comprimento;
        private double largura;
        private double altura;
    
        public Aquario(double comprimento, double largura, double altura){
            this.comprimento = comprimento;
            this.largura = largura;
            this.altura = altura;
        }
    
        public Aquario(double valorUnico){
            this.comprimento = valorUnico;
            this.largura = valorUnico;
            this.altura = valorUnico;
        }
    
        public double calcularVolume() {
            return (comprimento * altura * largura) / 1000;
        }
    
        public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
            return calcularVolume() * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
        }
    
        public double[] calcularQuantidadeLitrosFiltro() {
            double[] filtragem = {calcularVolume() * 2, calcularVolume() * 3};
            return filtragem;
        }
    
        public double getComprimento() {
            return comprimento;
        }
    
        public void setComprimento(double comprimento) {
            if (comprimento <= 0) {
                throw new IllegalArgumentException("Comprimento inválido");
            }
            this.comprimento = comprimento;
        }
    
        public double getLargura() {
            return largura;
        }
    
        public void setLargura(double largura) {
            if (largura <= 0) {
                throw new IllegalArgumentException("Largura inválida");
            }
            this.largura = largura;
        }
    
        public double getAltura() {
            return altura;
        }
    
        public void setAltura(double altura) {
            if (altura <= 0) {
                throw new IllegalArgumentException("Altura inválida");
            }
            this.altura = altura;
        }
    }       
}
