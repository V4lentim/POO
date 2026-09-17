public class Funcionario{
   
   public String nome;
   protected double salario;
   protected String endereco;     
   protected String telefone;
   
   public  Funcionario(){  
   }
   
   public Funcionario(String nome, double salario, String endereco, String telefone){
      this.nome = nome;
      this.salario = salario;
      this.endereco = endereco;
      this.telefone = telefone;
   }
   
   public String getNome(){
      return nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public double getSalario(){
      return salario;
   }
   
   public void setSalario(double salario){
      this.salario = salario;
   }
   
   public String getEndereco(){
      return endereco;
   }
   
   public void setEndereco(String endereco){
      this.endereco = endereco;
   }
   
   public String getTelefone(){
      return telefone;
   }

   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
   
   public void print(){
      System.out.println("Nome: " + nome );
      System.out.println("Salario: " + salario );
      System.out.println("Endereco: " + endereco );
      System.out.println("Telefone: " + telefone );
      
         
   }
      
}   

