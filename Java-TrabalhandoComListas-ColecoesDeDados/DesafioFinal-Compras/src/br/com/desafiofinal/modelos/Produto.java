package br.com.desafiofinal.modelos;

public class Produto {

    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: produto = " + nome +
                ", valor=" + valor;
    }
}
