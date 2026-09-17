import java.util.Scanner;

public class programa{

   public static void main(String [] args){
   
      int soma = UtilitariosMatematicos.somar(1, 53);
      int subtrair = UtilitariosMatematicos.subtrair(25, 5);
      int multiplicar = UtilitariosMatematicos.multiplicar(5, 5);
      double dividir = UtilitariosMatematicos.dividir(15, 3);
      double dolarParaReal = UtilitariosMatematicos. dolarParaReal(100);
      double PI = UtilitariosMatematicos.PI();
      
      System.out.println("Soma: " + soma);
      System.out.println("Subtracao: " + subtrair);
      System.out.println("Multiplicacao: " + multiplicar);
      System.out.println("Divisao: " + dividir);
      System.out.println("Dolar para Real: " + dolarParaReal);
      System.out.println("Valor de PI: " + PI);
      
      System.out.println("-------------------");
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite uma palavra: ");
      String palavraUsuario = scanner.nextLine();
      scanner.close();
      

      System.out.println("Palavra que digitou: " + palavraUsuario);
      String palavra = ManipulacaoString.palavra(palavraUsuario);
      System.out.println(palavra);
      String palavraUsuarioInvertida = ManipulacaoString.palavraInvertida(palavraUsuario);
      System.out.println("Palavra invertida: " + palavraUsuarioInvertida);
      String palindromo = ManipulacaoString.palindromo(palavraUsuario);
      System.out.println(palindromo);
   }
}