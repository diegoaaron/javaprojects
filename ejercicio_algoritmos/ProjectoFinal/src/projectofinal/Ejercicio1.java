package projectofinal;

import java.util.Scanner;

// Clase para Números Triangulares
class NumeroTriangular {
    private int n; // Encapsulación: 'n' es privado

    // Constructor por defecto
    public NumeroTriangular() {
        this.n = 1;
    }

    // Constructor parametrizado
    public NumeroTriangular(int n) {
        this.n = n;
    }

    // Getters y Setters (encapsulación)
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
        long raiz = (long) Math.sqrt(2 * num);
        return raiz * (raiz + 1) == 2 * num;
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

    public NumeroPentagonal(int n) {
        this.n = n;
    }

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
        long prueba = (long) (Math.sqrt(24 * num + 1) + 1);
        return prueba % 6 == 0;
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

    public NumeroHexagonal(int n) {
        this.n = n;
    }

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
        long prueba = (long) (Math.sqrt(8 * num + 1) + 1);
        return prueba % 4 == 0;
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
            System.out.println("1. Encontrar numero triangular, pentagonal y hexagonal (< 50000)");
            System.out.println("2. Verificar si un numero es de un tipo especifico");
            System.out.println("3. Calcular n-esimo numero de un tipo especifico");
            System.out.println("4. Encontrar el termino de un numero de un tipo especifico");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    encontrarComun();
                    break;
                case 2:
                    verificarNumero(scanner);
                    break;
                case 3:
                    calcularNesimo(scanner);
                    break;
                case 4:
                    encontrarTermino(scanner);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    // Encuentra el primer número que es triangular, pentagonal y hexagonal (menor a 50000)
    private static void encontrarComun() {
        NumeroTriangular triangular = new NumeroTriangular();
        NumeroPentagonal pentagonal = new NumeroPentagonal();
        NumeroHexagonal hexagonal = new NumeroHexagonal();

        int n = 1;
        while (true) {
            long numHex = hexagonal.calcular(n);
            if (numHex >= 50000) {
                System.out.println("No se encontró un número común menor a 50000.");
                break;
            }
            if (triangular.esTriangular(numHex) && pentagonal.esPentagonal(numHex)) {
                System.out.println("El número " + numHex + " es triangular, pentagonal y hexagonal.");
                System.out.println("Término triangular: " + triangular.encontrarTermino(numHex));
                System.out.println("Término pentagonal: " + pentagonal.encontrarTermino(numHex));
                System.out.println("Término hexagonal: " + hexagonal.encontrarTermino(numHex));
                break; // Se encontró el *primer* número, se detiene la búsqueda
            }
            n++;
        }
    }

    // Verifica si un número ingresado es triangular, pentagonal o hexagonal
    private static void verificarNumero(Scanner scanner) {
        System.out.print("Ingrese el número a verificar: ");
        long num = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de número (1=Triangular, 2=Pentagonal, 3=Hexagonal): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                NumeroTriangular triangular = new NumeroTriangular();
                System.out.println(num + " es triangular: " + triangular.esTriangular(num));
                break;
            case 2:
                NumeroPentagonal pentagonal = new NumeroPentagonal();
                System.out.println(num + " es pentagonal: " + pentagonal.esPentagonal(num));
                break;
            case 3:
                NumeroHexagonal hexagonal = new NumeroHexagonal();
                System.out.println(num + " es hexagonal: " + hexagonal.esHexagonal(num));
                break;
            default:
                System.out.println("Tipo de número inválido.");
        }
    }

    // Calcula el n-ésimo número triangular, pentagonal o hexagonal
    private static void calcularNesimo(Scanner scanner) {
        System.out.print("Ingrese el tipo de número (1=Triangular, 2=Pentagonal, 3=Hexagonal): ");
        int tipo = scanner.nextInt();
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                NumeroTriangular triangular = new NumeroTriangular();
                System.out.println("El " + n + "-ésimo número triangular es: " + triangular.calcular(n));
                break;
            case 2:
                NumeroPentagonal pentagonal = new NumeroPentagonal();
                System.out.println("El " + n + "-ésimo número pentagonal es: " + pentagonal.calcular(n));
                break;
            case 3:
                NumeroHexagonal hexagonal = new NumeroHexagonal();
                System.out.println("El " + n + "-ésimo número hexagonal es: " + hexagonal.calcular(n));
                break;
            default:
                System.out.println("Tipo de número inválido.");
        }
    }

    private static void encontrarTermino(Scanner scanner) {
        System.out.print("Ingrese el tipo de número (1=Triangular, 2=Pentagonal, 3=Hexagonal): ");
        int tipo = scanner.nextInt();
        System.out.print("Ingrese el número: ");
        long num = scanner.nextLong();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                NumeroTriangular triangular = new NumeroTriangular();
                int termTriangular = triangular.encontrarTermino(num);
                if (termTriangular != -1) {
                    System.out.println("El término del número triangular " + num + " es: " + termTriangular);
                } else {
                    System.out.println(num + " no es un número triangular.");
                }
                break;
            case 2:
                NumeroPentagonal pentagonal = new NumeroPentagonal();
                int termPentagonal = pentagonal.encontrarTermino(num);
                if (termPentagonal != -1) {
                    System.out.println("El término del número pentagonal " + num + " es: " + termPentagonal);
                } else {
                    System.out.println(num + " no es un número pentagonal.");
                }
                break;
            case 3:
                NumeroHexagonal hexagonal = new NumeroHexagonal();
                int termHexagonal = hexagonal.encontrarTermino(num);
                if (termHexagonal != -1) {
                    System.out.println("El término del número hexagonal " + num + " es: " + termHexagonal);
                } else {
                    System.out.println(num + " no es un número hexagonal.");
                }
                break;
            default:
                System.out.println("Tipo de número inválido.");
        }
    }
}