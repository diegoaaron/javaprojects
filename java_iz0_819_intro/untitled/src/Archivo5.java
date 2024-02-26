import java.util.ArrayList;
import java.util.List;

public class Archivo5 {
    public static void main(String[] args){
        List<Double> scores = new ArrayList<>();
        scores.add(10.1); // [10.1]
        scores.add(new Double(30)); // [10.1, 30.0]
        scores.remove(10.1); // [30.0]
        double first = scores.get(0); // 30.0
    }
}
