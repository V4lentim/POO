package Desafio1;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do retangulo: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();
        scanner.close();
        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
        System.out.println("Diagonal: " + retangulo.calcularDiagonal());

    }

}
