import br.com.desafioalura.modelos.Produto;
import br.com.desafioalura.modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Shape", 159.99, 7);
//        p1.setNome("Shape");
//        p1.setPreco(159.99);
//        p1.setQuantidade(7);

        Produto p2 = new Produto("Truck", 209.99, 3);
//        p2.setNome("Truck");
//        p2.setPreco(209.99);
//        p2.setQuantidade(3);

        Produto p3 = new Produto("Rolamento", 99.99, 2);
//        p3.setNome("Rolamento");
//        p3.setPreco(99.99);
//        p3.setQuantidade(2);

        ProdutoPerecivel pP1 = new ProdutoPerecivel("Lixa", 79.99, 12, 5);

        //Criando ArrayList
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(pP1);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Primeiro produto da lista = " + listaDeProdutos.get(0).getNome());
        System.out.println(listaDeProdutos);

    }

}
