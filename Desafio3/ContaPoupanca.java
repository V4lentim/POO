public class ContaPoupanca extends Conta{
   private int taxaJuros = 5;
   
   public ContaPoupanca(int numero, String titular, double saldo){
      super(numero, titular, saldo);
   }
   
   public int GetTaxaJuros(){
      return taxaJuros;
   
}
   

   @Override
   public void sacar(double valorSaque) {
		saldo -= valorSaque;
      saldo -= taxaJuros;
	}

}