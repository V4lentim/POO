package Desafio1;

public class Retangulo {
    
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return 2 * (this.largura + this.altura);
    }

    public double calcularDiagonal(){
        return Math.sqrt(calcularArea() + calcularArea());
    }

}
