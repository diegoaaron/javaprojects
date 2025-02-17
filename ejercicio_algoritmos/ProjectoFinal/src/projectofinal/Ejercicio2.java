package projectofinal;

import java.util.ArrayList;
import java.util.Scanner;

// Clase principal que contiene la lógica del programa
class SumaPrimos {

    private final int limite;
    private int maxPrimo;
    private int cantidadTerminos;
    private ArrayList<Integer> secuencia;

    // Constructor
    public SumaPrimos(int limite) {
        this.limite = limite;
        this.secuencia = new ArrayList<>();
        calcularSumaPrimosConsecutivos();
    }

    // Getters
    public int getMaxPrimo() {
        return maxPrimo;
    }

    public int getCantidadTerminos() {
        return cantidadTerminos;
    }

    public ArrayList<Integer> getSecuencia() {
        return secuencia;
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

    // Método para calcular la mayor suma de primos consecutivos que sea primo
    private void calcularSumaPrimosConsecutivos() {
        ArrayList<Integer> primos = new ArrayList<>();

        // Generar todos los primos menores al límite
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }

        maxPrimo = 0;
        cantidadTerminos = 0;

        // Buscar la mayor suma de primos consecutivos que sea primo
        for (int i = 0; i < primos.size(); i++) {
            int suma = 0;
            ArrayList<Integer> tempSecuencia = new ArrayList<>();

            for (int j = i; j < primos.size(); j++) {
                suma += primos.get(j);
                tempSecuencia.add(primos.get(j));

                if (suma >= limite) {
                    break;
                }
                if (esPrimo(suma) && tempSecuencia.size() > cantidadTerminos) {
                    maxPrimo = suma;
                    cantidadTerminos = tempSecuencia.size();
                    secuencia = new ArrayList<>(tempSecuencia);
                }
            }
        }
    }
}

// Clase principal con el menú
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Calcular el mayor número primo obtenido por suma de primos consecutivos");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    SumaPrimos sumaPrimos = new SumaPrimos(1_000_000);
                    System.out.println("\nEl mayor numero primo obtenido por suma de primos consecutivos es: " + sumaPrimos.getMaxPrimo());
                    System.out.println("Cantidad de terminos sumados: " + sumaPrimos.getCantidadTerminos());
                    System.out.println("Secuencia de primos:");
                    System.out.println(sumaPrimos.getSecuencia());
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
