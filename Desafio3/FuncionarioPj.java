public class FuncionarioPj extends Funcionario{
   
   public String cnpj;
   public double taxaISS;
   
   public FuncionarioPj(String nome, double salario, String cnpj, String endereco, String telefone){
      super(nome, salario, endereco, telefone);
      this.cnpj = cnpj;
      this.taxaISS = salario - (salario * 0.05);
   }
   
   public String getCnpj(){
      return cnpj;
   }
   
   public void setCnpj(String cnpj){
      this.cnpj = cnpj;
   }
   
   
  @Override
    public void print(){
      System.out.println("Nome: " + nome );
      System.out.println("CNPJ: " + cnpj);
      System.out.println("Salario: " + salario );
      System.out.println("Taxa ISS (5%): " + taxaISS); 
      System.out.println("Endereco: " + endereco );
      System.out.println("Telefone: " + telefone );
   }
   
} 