package projectofinal;

/*
Es posible escribir diez como suma de números primos de exactamente cinco maneras diferentes:
7 + 3
5 + 5
5 + 3 + 2
3 + 3 + 2 + 2
2 + 2 + 2 + 2
Escribir un programa que devuelva el primer valor que puede escribirse como suma de números primos de más de cinco mil maneras diferentes.
 */
import java.util.ArrayList;
import java.util.Scanner;

class SumaPrimosDescomposicion {

    private int limite;
    private int valorObjetivo;

    // Constructor
    public SumaPrimosDescomposicion(int limite) {
        this.limite = limite;
        this.valorObjetivo = calcularPrimerValor();
    }

    // Getter
    public int getValorObjetivo() {
        return valorObjetivo;
    }

    // Método para verificar si un número es primo
    private boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular el primer número que puede escribirse como suma de primos en más de 5000 formas
    private int calcularPrimerValor() {
        ArrayList<Integer> primos = new ArrayList<>();

        // Generar primos hasta el límite
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }

        int[] formas = new int[limite];
        formas[0] = 1; // Solo hay una forma de hacer 0 (no usar ningún número)

        // Calcular el número de maneras en que se puede formar cada número
        for (int primo : primos) {
            for (int j = primo; j < limite; j++) {
                formas[j] += formas[j - primo];
            }
        }

        // Buscar el primer número que tenga más de 5000 formas de ser escrito como suma de primos
        for (int i = 2; i < limite; i++) {
            if (formas[i] > 5000) {
                return i;
            }
        }
        return -1; // En caso de error
    }
}

// Clase principal con el menú
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Calcular el primer número que puede escribirse como suma de primos de más de 5000 maneras");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    SumaPrimosDescomposicion sumaPrimos = new SumaPrimosDescomposicion(10_000);
                    System.out.println("\nEl primer número que puede escribirse como suma de primos de más de 5000 maneras es: "
                            + sumaPrimos.getValorObjetivo());
                }
                case 2 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}
