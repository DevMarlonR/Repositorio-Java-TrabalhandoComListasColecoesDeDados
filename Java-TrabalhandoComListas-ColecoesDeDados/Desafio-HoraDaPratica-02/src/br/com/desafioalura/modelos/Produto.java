package br.com.desafioalura.modelos;

public class Produto {

    // nome, preco, e quantidade

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    protected Produto() {

    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nProduto: " + getNome() + "\n Valor: " + getPreco() + "\n Quantidade: " + getQuantidade() + "\n";
    }
}
