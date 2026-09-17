public class FuncionarioPF extends Funcionario{
   
   public String cpf;
   public double taxaIR;
   
   public FuncionarioPF(String nome, double salario, String cpf, String endereco, String telefone){
      super(nome, salario, endereco, telefone);
      this.cpf = cpf;
      this.taxaIR = salario - (salario * 0.075);
   }
   
   public String getCpf(){
      return cpf;
   }
   
   public void setCpf(String cpf){
      this.cpf = cpf;
   }
   
   
  @Override
    public void print(){
      System.out.println("Nome: " + nome );
      System.out.println("CPF: " + cpf);
      System.out.println("Salario: " + salario );
      System.out.println("Taxa ISS (7,5%): " + taxaIR); 
      System.out.println("Endereco: " + endereco );
      System.out.println("Telefone: " + telefone );
   }
   
} 