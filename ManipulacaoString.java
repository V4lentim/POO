public class ManipulacaoString{

   public static String palavra(String palavraUsuario){
      int contador = 0;
      
      for(char vogal : palavraUsuario.toLowerCase().toCharArray()){
         if(vogal  == 'a' || vogal  == 'e' || vogal  == 'i' || vogal  == 'o' || vogal  == 'u'){
            contador++;
         }
      }
      return "Quantidade de vogais: " + contador;
   }
   
   public static String palavraInvertida(String palavraUsuario){
      String palavraInvertida = ""; 
      for(int i = 0; i < palavraUsuario.length(); i++){
         palavraInvertida = palavraUsuario.charAt(i) + palavraInvertida;

      }

      return  palavraInvertida;

   }
   
   public static String palindromo(String palavraUsuario) {
   String palavraLimpa = palavraUsuario.toLowerCase();
   boolean isPalindromo = true;

      for(int i = 0; i < palavraLimpa.length() / 2; i++) {
         if(palavraLimpa.charAt(i) != palavraLimpa.charAt(palavraLimpa.length() - 1 - i)) {
            isPalindromo = false;
            break;
         }
      }

      if(isPalindromo) {
         return palavraUsuario + " e palindromo";
      } else {
         return palavraUsuario + " nao e palindromo";
      }
   
   }  

}