import java.util.Scanner;

public class Calculo3D {

    public void calculocosto3d() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos: ");
        double cantidadMinutos = teclado.nextFloat();
        double precioPorMinuto = 0.05f;
        double precioTotal = precioPorMinuto * cantidadMinutos;

        System.out.println("El precio total es: S/. " + precioTotal);
    }
}
