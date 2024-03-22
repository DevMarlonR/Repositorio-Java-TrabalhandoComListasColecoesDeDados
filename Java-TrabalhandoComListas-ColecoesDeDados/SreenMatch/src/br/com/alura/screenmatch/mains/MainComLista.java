package br.com.alura.screenmatch.mains;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComLista {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        meuFilme.avalia(4);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(9);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        meuFilme.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(lost);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> atores = new ArrayList<>();
        atores.add("Adam Sandler");
        atores.add("Marlon");
        atores.add("Gabrielle");
        atores.add("Jaqueline");
        atores.add("Paulo");

        System.out.println(atores);
        Collections.sort(atores);
        System.out.println("Após arrumar: " + atores);

        Collections.sort(lista);
        System.out.println(lista);
        //Comparando com ano de Lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
        
    }

}
