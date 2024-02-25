import java.util.ArrayList;
import java.util.List;

public class Shop1 {
    public static void main(String[] args){
        List<String> names = new ArrayList<String>();
        names.add("Lucas");
        names.add("Pepe");
        for(String value: names){
            System.out.println(value + " ");
        }
    }
}
