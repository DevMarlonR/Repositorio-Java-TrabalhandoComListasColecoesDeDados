import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Kotlin");
        linguagens.add("C++");
        linguagens.add("C#");
        linguagens.add("Cobol");

        for (String item : linguagens) {
            System.out.println(item);
        }
    }

}
