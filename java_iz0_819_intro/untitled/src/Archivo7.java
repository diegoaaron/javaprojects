import java.util.ArrayList;
import java.util.List;

public class Archivo7 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Lucas");
        people.add("Marta");
        people.add("Gabriel");
        people.add("Miguel");

        people.forEach(name -> System.out.println(name));
    }
}
