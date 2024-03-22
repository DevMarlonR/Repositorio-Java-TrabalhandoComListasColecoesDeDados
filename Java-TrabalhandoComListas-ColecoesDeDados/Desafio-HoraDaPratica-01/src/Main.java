import br.com.desafioalura.modelos.Pessoa;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Marlon", 21);
//        pessoa1.setNome("Marlon");
//        pessoa1.setAnoDeNascimento(2002);

        Pessoa pessoa2 = new Pessoa("Gabrielle", 19);
//        pessoa2.setNome("Gabrielle");
//        pessoa2.setAnoDeNascimento(2004);

        Pessoa pessoa3 = new Pessoa("Luna", 0);
//        pessoa3.setNome("Luna");
//        pessoa3.setAnoDeNascimento(2023);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + pessoas.size());
        System.out.println("Primeira pessoa: " + pessoas.get(0).toString());
        System.out.println(pessoas);

    }

}
