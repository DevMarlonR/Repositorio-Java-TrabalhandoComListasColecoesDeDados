import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 10; i > 0; i--) {
            lista.add(i);
        }
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("Lista ordenada: ");
        System.out.println(lista);


    }

}
