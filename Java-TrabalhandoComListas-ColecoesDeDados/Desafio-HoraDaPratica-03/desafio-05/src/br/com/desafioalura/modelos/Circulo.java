package br.com.desafioalura.modelos;

import static java.lang.Math.pow;

public class Circulo implements Formas {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        final double PI = 3.1415;

        return (int) (PI * pow(getRaio(),2));
    }

    public String typeOf() {
        return "Circulo";
    }


}
