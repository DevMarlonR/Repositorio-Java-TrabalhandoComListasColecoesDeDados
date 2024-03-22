import br.com.desafioalura.modelos.Circulo;
import br.com.desafioalura.modelos.Formas;
import br.com.desafioalura.modelos.Quadrado;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Formas> itens = new ArrayList<>();

        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(2);
        Circulo c3 = new Circulo(6);
        Circulo c4 = new Circulo(130);
        Circulo c5 = new Circulo(3);

        Quadrado q1 = new Quadrado(4);
        Quadrado q2 = new Quadrado(2);
        Quadrado q3 = new Quadrado(6);
        Quadrado q4 = new Quadrado(130);
        Quadrado q5 = new Quadrado(3);

        itens.add(c1);
        itens.add(c2);
        itens.add(c3);
        itens.add(c4);
        itens.add(c5);
        itens.add(q1);
        itens.add(q2);
        itens.add(q3);
        itens.add(q4);
        itens.add(q5);

        for (Formas item : itens) {
            System.out.println("Area do " + item.typeOf() + ": " + item.calcularArea());
        }



    }

}
