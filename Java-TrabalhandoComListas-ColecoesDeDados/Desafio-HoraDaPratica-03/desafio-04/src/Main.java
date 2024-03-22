import br.com.desafioalura.modelos.Produto;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando ArrayList
        ArrayList<Produto> produtos = new ArrayList<>();

        //Criando produtos
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        Produto p5 = new Produto();
        //Adicionando nome e preco aos produtos
        p1.setNome("Capa da invisibilidade");
        p1.setPreco(209.99);
        p2.setNome("Varinha das varinhas");
        p2.setPreco(359.99);
        p3.setNome("Feijão de todos os sabores");
        p3.setPreco(29.99);
        p4.setNome("Sapos de Chocolate");
        p4.setPreco(19.99);
        p5.setNome("Nimbus 2001");
        p5.setPreco(100);

        //Adicionando elementos ao ArrayList
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        double totalValorProdutos = 0;
        //laço para somar o valor dos produtos
        for (Produto item : produtos) {
            totalValorProdutos += item.getPreco();
        }
        double mediaValorProdutos = totalValorProdutos/ produtos.size();
        System.out.printf("Média dos produtos: %.2f", mediaValorProdutos);

    }
}
