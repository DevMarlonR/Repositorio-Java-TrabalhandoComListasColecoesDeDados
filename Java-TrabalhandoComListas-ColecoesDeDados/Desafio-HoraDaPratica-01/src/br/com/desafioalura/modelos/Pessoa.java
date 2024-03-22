package br.com.desafioalura.modelos;


import java.util.Calendar;

public class Pessoa {

    //nome, idade, e um método toString que represente esses atributos.

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    private int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "{Nome: " + this.getNome() + " - Idade: " + this.getIdade() + "}";
    }
}
