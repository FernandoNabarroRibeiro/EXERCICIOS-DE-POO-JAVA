package NIVEL4LOJA.CLASSE;

public class Produto {
    private String nome;
    private int preco;
    private int quandidadeNoEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuandidadeNoEstoque() {
        return quandidadeNoEstoque;
    }

    public void setQuandidadeNoEstoque(int quandidadeNoEstoque) {
        this.quandidadeNoEstoque = quandidadeNoEstoque;
    }

    public Produto(String nome, int preco, int quandidadeNoEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quandidadeNoEstoque = quandidadeNoEstoque;
    }

    public void precoNegativo(){
        if (preco<=0){
            System.out.println("Preço Invalido de produto!!");
        }
    }

    public void adicionarQuantidadeEstoque(int quantidade){
        if (quantidade>0){
            this.quandidadeNoEstoque += quantidade;
        } else {
            System.out.println("Quantidade Invalido de produto!!");
        }
    }




    public int vendaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quandidadeNoEstoque) {
            this.quandidadeNoEstoque -= quantidade;
        }

        return this.quandidadeNoEstoque;
    }

    public void calcularValorTotal(){
        int valorTotal = this.preco * this.quandidadeNoEstoque;
        System.out.println("Valor total do estoque: " + valorTotal);
    }

    public void imprimir(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade do produto: " + quandidadeNoEstoque);
    }



}
