import java.util.Scanner;

public class Quemaduras {
    public void calculoQuemaduras(){
        System.out.println("Mostrar información de quemaduras");

        System.out.println("1) Primer grado");
        System.out.println("Enrojecimiento, dolor leve y posible hinchazon");

        System.out.println("2) Segundo grado");
        System.out.println("Ampollas, enrojecimiento, dolor intenso e hinchazon");

        System.out.println("3) Tercer grado");
        System.out.println("Piel carbonizada, grave hinchazon");
        System.out.println("Que tipo de quemadura es: ");

        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();

        if(eleccion == 1) {
            System.out.println("Tratamiento: ");
        } else if (eleccion == 2) {
            System.out.println("Tratamiento: ");
        } else if (eleccion == 3) {
            System.out.println("Tratamiento: ");
        } else {
            System.out.println("No selecciono una opción permitida");
        }
    }
}
