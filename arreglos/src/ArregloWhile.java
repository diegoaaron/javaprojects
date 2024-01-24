import java.util.Scanner;

public class ArregloWhile {
    public void arregloDoWhile() {

        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        /*
        while (contador < 5){
            System.out.println("Ingrese un número: ");
            numeros[contador] = teclado.nextInt();
            ++contador;
        }
        contador = 0;

        while (contador < 5) {
            System.out.println("la posicion " + contador + " es " + numeros[contador]);
            ++contador;
        }
        */

        // con Do While
        do {
            System.out.println("Ingrese un número: ");
            numeros[contador] = teclado.nextInt();
            ++contador;
        } while(contador < 5);

        contador = 0;

        do {
            System.out.println("la posicion " + contador + " es " + numeros[contador]);
            ++contador;
        } while(contador < 5);

    }
}
