import br.com.desafioalura.modelos.ContaBancaria;

import java.util.ArrayList;

public class Main {


//    crie uma lista de contas bancárias com diferentes saldos.
//    Utilize um loop para encontrar e imprimir a conta com o maior saldo.
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        ContaBancaria c1 = new ContaBancaria(2000);
        ContaBancaria c2 = new ContaBancaria(1000);
        ContaBancaria c3 = new ContaBancaria(2000);
        ContaBancaria c4 = new ContaBancaria(276.99);
        ContaBancaria c5 = new ContaBancaria(50000.60);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);
        contas.add(c5);

        ContaBancaria contaMaiorSaldo = contas.get(0);

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com maior saldo: " + contaMaiorSaldo.getNumeroDaConta());
        System.out.println("Valor na conta: " + contaMaiorSaldo.getSaldo());

    }

}
