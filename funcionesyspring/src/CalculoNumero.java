import java.util.Scanner;

public class CalculoNumero {

    public void calculandoArreglos(){
        int[] numeros = new int[5];
        cargarArreglo(numeros);
        mostrarNumeros(numeros);
    }
    private static void mostrarNumeros(int[] arreglo){
        System.out.println("Estos son los números ingresados: ");
        for(int i = 0; i < arreglo.length; ++i){
            System.out.println("El numero es: " + arreglo[i]);
        }
    }

    private static void cargarArreglo(int[] arreglo) {
        for(int i = 0; i < arreglo.length; ++i){
            int var1 = pedirNumeroAlUsuario();
            arreglo[i] = var1;
        }
    }

    public static int pedirNumeroAlUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        return teclado.nextInt();
    }
}
