package projectofinal;

import java.util.Scanner;

// Clase para Números Triangulares
class NumeroTriangular {

    private int n; // Encapsulación: 'n' es privado

    // Constructor por defecto
    public NumeroTriangular() {
        this.n = 1;
    }

    // Getters y Setters (encapsulación) - no se utilizaron
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long calcular(int n) {
        return (long) n * (n + 1) / 2;
    }

    public boolean esTriangular(long num) {
        long valor = (long) Math.sqrt(2 * num);
        return valor * (valor + 1) == 2 * num;
    }

    public int encontrarTermino(long num) {
        if (!esTriangular(num)) {
            return -1; // No es triangular
        }
        return (int) Math.sqrt(2 * num);
    }
}

// Clase para Números Pentagonales
class NumeroPentagonal {

    private int n;

    public NumeroPentagonal() {
        this.n = 1;
    }

    // Getters y Setters (encapsulación) - no se utilizaron
    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long calcular(int n) {
        return (long) n * (3 * n - 1) / 2;
    }

    public boolean esPentagonal(long num) {
        if (num < 1) {
            return false;
        }
        double valor = (1 + Math.sqrt(1 + 24 * num)) / 6;
        return valor == (int) valor; // Verifica si n es un entero
    }

    public int encontrarTermino(long num) {
        if (!esPentagonal(num)) {
            return -1;
        }
        long prueba = (long) (Math.sqrt(24 * num + 1) + 1);
        return (int) (prueba / 6);
    }
}

// Clase para Números Hexagonales
class NumeroHexagonal {

    private int n;

    public NumeroHexagonal() {
        this.n = 1;
    }

    // Getters y Setters (encapsulación) - no se utilizaron
    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long calcular(int n) {
        return (long) n * (2 * n - 1);
    }

    public boolean esHexagonal(long num) {
        long valor = (long) (Math.sqrt(8 * num + 1) + 1);
        return valor % 4 == 0;
    }

    public int encontrarTermino(long num) {
        if (!esHexagonal(num)) {
            return -1;
        }
        long prueba = (long) (Math.sqrt(8 * num + 1) + 1);
        return (int) (prueba / 4);
    }
}

// Clase principal del programa
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menú de opciones
            System.out.println("\nMenu:");
            System.out.println("1. Busca numros triangular, pentagonal y hexagonal (< 50000)");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 ->
                    encontrarComun();
                case 2 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    // Encuentra los números que son triangulares, pentagonales y hexagonales (menores a 50000)
    private static void encontrarComun() {
        NumeroTriangular triangular = new NumeroTriangular();
        NumeroPentagonal pentagonal = new NumeroPentagonal();
        NumeroHexagonal hexagonal = new NumeroHexagonal();

        int n = 1;

        while (true) {
            long numHex = hexagonal.calcular(n);
            if (numHex >= 50000) {
                break;
            }
            if (pentagonal.esPentagonal(numHex)) {
                System.out.println("El numero " + numHex + " es triangular, pentagonal y hexagonal.");
                System.out.println("Su termino triangular es: " + triangular.encontrarTermino(numHex));
                System.out.println("Su termino pentagonal es: " + pentagonal.encontrarTermino(numHex));
                System.out.println("Su termino hexagonal  es: " + hexagonal.encontrarTermino(numHex));
            }
            n++;
        }
    }
}
