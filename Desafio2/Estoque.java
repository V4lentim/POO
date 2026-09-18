public class Estoque {

    public String nome;
    public double preco;
    public double qtdEstoque;

    public Estoque() {

    }

    public Estoque(String nome, double preco, double qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double valorTotalEmEstoque() {
        return preco * qtdEstoque;
    }

    public void imprimir() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade de item no estoque: " + qtdEstoque);
        System.out.println("Valor total em estoque: " + valorTotalEmEstoque());
    }

}
