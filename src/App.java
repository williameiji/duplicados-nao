import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas = new ArrayList<>();

        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Acerola");
        frutas.add("Manga");

        List<String> frutas1 = new ArrayList<>();

        frutas1.add("Pêra");
        frutas1.add("Caju");
        frutas1.add("Acerola");
        frutas1.add("Kiwi");

        for (int i = 0; i < frutas.size(); i++) {
            if (frutas1.contains(frutas.get(i))) {
                System.out.println(frutas.get(i));
            }
        }

    }
}
