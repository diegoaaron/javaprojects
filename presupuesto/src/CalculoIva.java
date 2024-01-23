import java.util.Scanner;

public class CalculoIva {
    public void calculoImpuestos(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        float precio = teclado.nextFloat();
        float iva = 21;
        float totalADescontar = iva * precio / 100;
        float precioFinal = precio - totalADescontar;
        System.out.println("Precio final: S/." + precioFinal);
    }
}
