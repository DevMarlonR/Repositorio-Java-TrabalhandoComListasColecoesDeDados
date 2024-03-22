import br.com.desafiofinal.modelos.Cartao;
import br.com.desafiofinal.modelos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite do seu cartão de Crédito: ");
        Cartao cartao = new Cartao(sc.nextDouble());
        System.out.println("Seu limite é de: R$" + cartao.getLimite());

        int opcao = 1;
        do {

            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();
            System.out.println("Digite o valor do(a) " + descricao + ": ");
            double valor = sc.nextDouble();

            Produto produto = new Produto(descricao, valor);

            // Checando se não posso gastar
            if (!cartao.possoGastar(produto)) {
                System.out.println("Saldo insuficiente para compra...");
                opcao = 0;
                break;
            }
            // Caso tenha limite
            cartao.gastar(produto);
            System.out.println("Compra realizada!");
            System.out.println("""
                    Escolha sua opção:
                    0 - Sair
                    1 - Realizar nova compra
                    2 - Mostrar extrato""");
            opcao = sc.nextInt();

            if (opcao == 2) {
                cartao.getExtrato();
                System.out.println("""
                    Escolha sua opção:
                    0 - Sair
                    1 - Realizar nova compra
                    """);
                opcao = sc.nextInt();
            }


        } while (opcao != 0);

        cartao.getExtrato();

    }
}