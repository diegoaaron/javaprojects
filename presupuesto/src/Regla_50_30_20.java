import java.util.Scanner;

public class Regla_50_30_20 {

    public void calculoAhorros(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el salario: ");
        float salario = teclado.nextFloat();
        float necesidades = salario * 0.5f;
        float otrasCosas = salario * 0.3f;
        float ahorros = salario * 0.2f;

        System.out.println("Deberias asignar tu salario a las siguientes cosas: ");
        System.out.println("Necesidades: S/." + necesidades);
        System.out.println("Otras cosas: S/." + otrasCosas);
        System.out.println("Ahorros: S/." + ahorros);
    }
}
