import br.com.desafioalura.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        Crie uma classe Titulo com um atributo nome do tipo String.
//        Implemente a interface Comparable na classe para que seja possivel ordenar uma lista de objeto

        ArrayList<Titulo> titulos = new ArrayList<>();

        Titulo titulo1 = new Titulo("A");
        Titulo titulo2 = new Titulo("B");
        Titulo titulo3 = new Titulo("C");
        Titulo titulo4 = new Titulo("D");
        Titulo titulo5 = new Titulo("E");
        Titulo titulo6 = new Titulo("F");
        Titulo titulo7 = new Titulo("G");

        titulos.add(titulo7);
        titulos.add(titulo6);
        titulos.add(titulo5);
        titulos.add(titulo4);
        titulos.add(titulo3);
        titulos.add(titulo2);
        titulos.add(titulo1);

        System.out.println("Lista desordenada: " + titulos);

        Collections.sort(titulos);

        System.out.println("Lista ordenada: " +titulos);



    }
}
