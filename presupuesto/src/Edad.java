import java.util.Scanner;

public class Edad {
    public void evaluaEdad(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar al sitio");
        }
    }
}
