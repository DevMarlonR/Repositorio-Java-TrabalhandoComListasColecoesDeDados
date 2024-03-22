package br.com.desafioalura.modelos;

import java.util.Random;

public class ContaBancaria {
    //    Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida,
    private int numeroDaConta;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        Random aleatorio = new Random();
        numeroDaConta = aleatorio.nextInt(100);
    }

}
