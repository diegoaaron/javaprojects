import java.util.Scanner;

public class Respiraciones {
    public void calculoRespirar(){
        System.out.println("Ingrese la cantidad de respiraciones por minuto: ");
        Scanner teclado = new Scanner(System.in);

        int respiraciones = teclado.nextInt();


        if (respiraciones < 12){
            System.out.println("La tasa de respiracion es BAJA");
        } else if (respiraciones <= 20){
            System.out.println("La tasa de respiracion es normal");
        } else if (respiraciones > 30 && respiraciones <= 40) {
            System.out.println("La tasa de respiracion es irregular");
        }
        System.out.println("otro resultado");
    }
}
