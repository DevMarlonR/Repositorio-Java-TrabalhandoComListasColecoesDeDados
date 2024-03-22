package br.com.desafioalura.modelos;

public class Quadrado implements Formas {

    private int lado;

    public Quadrado (int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {

        return (getLado() * getLado());

    }

    public String typeOf() {
        return "Quadrado";
    }

}
