public class Programa {
   public static void main(String[] args){
      
      System.out.println("Conta 1");
      Conta conta1 = new Conta(1001, "Jose", 100.000);
      System.out.printf("Titular: %s%n", conta1.getTitular());
      System.out.printf("Numero: %d%n", conta1.getNumero());
      System.out.printf("Saldo: %.3f%n", conta1.getSaldo());
      conta1.sacar(50.000);
      System.out.printf("Saldo: %.3f%n", conta1.getSaldo());
      
      System.out.println("--------------------------------");
      
      System.out.println("Conta 2");
      ContaEmpresarial conta2 = new ContaEmpresarial(1002, "Guilherme", 300.000, 50.000);
      System.out.printf("Titular: %s%n", conta2.getTitular());
      System.out.printf("Numero: %d%n", conta2.getNumero());
      System.out.printf("Saldo: %.3f%n", conta2.getSaldo());
      System.out.printf("Limite: %.3f%n", conta2.getLimiteEmprestimo());
      conta2.sacar(100.000);
      System.out.printf("Saldo: %.3f%n", conta2.getSaldo());

      System.out.println("--------------------------------");
      
      System.out.println("Conta 3");
      ContaPoupanca conta3 = new ContaPoupanca(1003, "Erick", 1000);
      System.out.printf("Titular: %s%n", conta3.getTitular());
      System.out.printf("Numero: %d%n", conta3.getNumero());
      System.out.printf("Saldo: %.3f%n", conta3.getSaldo());
      conta3.sacar(50);
      System.out.printf("Saldo: %.3f%n", conta3.getSaldo());
      
      System.out.println("--------------------------------");
      
      System.out.println("Funcionario 1");
      Funcionario funcionario1 = new Funcionario("Jorge", 2500, "Rua Jaiminho Carteiro", "123456789");      
      funcionario1.print();
      
      System.out.println("--------------------------------");
      FuncionarioPj funcionario2 = new FuncionarioPj("William", 10000, "d2353G35", "Dornelas", "242456346");
      funcionario2.print();
      
      
       System.out.println("--------------------------------");
       FuncionarioPF funcionario3 = new FuncionarioPF("Jao", 5000, "12454312432","Rua Ai Que Delicia", "543758235");
       funcionario3.print();
   }

}