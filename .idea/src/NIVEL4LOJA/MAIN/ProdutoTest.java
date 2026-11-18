package NIVEL4LOJA.MAIN;

import NIVEL4LOJA.CLASSE.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Leite",8,15);

    produto.imprimir();
    produto.precoNegativo();

    produto.calcularValorTotal();
        System.out.println("Houve 4 produtos vendidos");
    produto.vendaEstoque(4);
    produto.calcularValorTotal();
        System.out.println("O estoque foi reposto no fim da noite com 5 leites");
        produto.adicionarQuantidadeEstoque(5);
    produto.calcularValorTotal();


    }
}
