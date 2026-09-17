public class UtilitariosMatematicos{
   
   public static int somar(int num1, int num2){
      int resultado = num1 + num2;
      return resultado;
   }
   
   public static int subtrair(int num1, int num2){ 
      int resultado = num1 - num2;
      return resultado;
   }   
   
   public static int multiplicar(int num1, int num2){
      int resultado = num1 * num2;
      return resultado;
   }
   
   public static double dividir(double num1, double num2){
      double resultado = num1 / num2;
      return  resultado;
   }
   
   public static double dolarParaReal(double dolarPReal){
       double resultado = dolarPReal * 5.16;
       return  resultado;
   
   }
   
   public static double PI(){
      return 3.14159;
   }
   
}