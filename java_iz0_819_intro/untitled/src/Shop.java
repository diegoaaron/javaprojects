import java.util.Random;

public class Shop {
    public static void main(String[] args){
        int x = (int)1.0;
        x = 2 * (10 - --x) + x++; // 20
        x = (x = 2) + (x=3); //5
        boolean flag = x == (long)100; // false
        if(flag = true){
            System.out.println("Result: " + x + (1+2));
            // Result: 53
        }

        x = 10;
        x = x > 10 ? x < 10 ? 1 : 2 : 3;
    }
}

// cuando se compila un archivo .java que tiene 2 clases
// se genera 2 archivos compilados (.class)

