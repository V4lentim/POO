import java.util.Scanner;

public class Programa {

   public static void main(String[] args) {

      Estoque estoque1 = new Estoque("Camisa", 50.00, 10);
      estoque1.imprimir();

      System.out.println("-------------------------------");

      Estoque estoque2 = new Estoque("Calça", 100.00, 5);
      estoque2.imprimir();

      System.out.println("-------------------------------");
      System.out.println("-------------------------------");

      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o primeiro numero:");
      double num1 = scanner.nextDouble();
      System.out.println("Escolha a operação que deseja realizar: 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Sair");
      int operacao = scanner.nextInt();
      System.out.println("Digite o segundo numero:");
      double num2 = scanner.nextDouble();
      scanner.close();

      switch (operacao) {

         case 1:
            Calculadora calcularSoma = new Calculadora(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + calcularSoma.soma());
            break;

         case 2:
            Calculadora calcularSubtracao = new Calculadora(num1, num2);
            System.out.println(num1 + " - " + num2 + " = " + calcularSubtracao.subtracao());
            break;

         case 3:
            Calculadora calcularMultiplicacao = new Calculadora(num1, num2);
            System.out.println(num1 + " * " + num2 + " = " + calcularMultiplicacao.multiplicacao());
            break;

         case 4:
            Calculadora calcularDivisao = new Calculadora(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + calcularDivisao.divisao());
            break;

         case 5:
            System.out.println("Saindo do programa...");
            break;

         default:
            System.out.println("Operação inválida. Por favor, escolha uma operação válida.");
      }

   }
}