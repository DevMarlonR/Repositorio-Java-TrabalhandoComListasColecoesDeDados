package br.com.desafioalura.modelos;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome= " + this.getNome() ;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
