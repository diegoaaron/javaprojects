import java.util.Random;

public class Shop {
    public static void main(String[] args){
        System.out.println("Values: 0:" + args[0] + " 1: " + args[1]);

        Random randon = new Random();
        System.out.println(randon.nextInt(10));
    }
}

// cuando se compila un archivo .java que tiene 2 clases
// se genera 2 archivos compilados (.class)

