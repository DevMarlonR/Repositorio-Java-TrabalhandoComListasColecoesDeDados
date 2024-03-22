package br.com.desafiofinal.modelos;

import java.util.ArrayList;
import java.util.Comparator;

public class Cartao {

    private double limite;
    private double saldo = 0;
    private ArrayList<Produto> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean possoGastar(Produto produto) {
        return (this.saldo >= produto.getValor()); // retornará true ou false
    }

    public void gastar(Produto produto) {
        this.saldo -= produto.getValor();
        compras.add(produto);
    }

    public void getExtrato() {
        System.out.println("********************");
        System.out.println("Compras realizadas:");
        System.out.println();
        // Ordenando a lista por valor
        compras.sort(Comparator.comparing(Produto::getValor));

        for (Produto item : compras){
            System.out.println(item.getNome() + " - " + item.getValor());
        }

        System.out.println();
        System.out.println("********************");
        double s = saldo;
        String saldo = String.format("%.2f", s);
        System.out.println("Saldo da conta: " + saldo);

    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

}