import br.com.desafioalura.modelos.Animal;
import br.com.desafioalura.modelos.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Animal animal = (Cachorro) dog;

        Animal animal2 = new Cachorro();

        if (animal2 instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal2;
            // Pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O Objeto não é um Cachorro");
        }

    }
}
