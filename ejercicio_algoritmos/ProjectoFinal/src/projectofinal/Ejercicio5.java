package projectofinal;

/*
Se desea procesar las operaciones bancarias de un cliente a quien se le pide por única vez su nombre y saldo inicial. Luego en un proceso repetitivo se presenta las siguientes opciones:
Depósito, Retiro, Fin. Al ingresar la opción elegida si esta fue ‘D’ se pide si es en efectivo (1) o con cheque (2), se ingresa la cantidad, y si fuese cheque se descuenta el 1% por comisión y se actualiza su saldo mostrándolo en pantalla. Si la opción elegida fue ‘R’ se ingresa la cantidad verificando que ésta sea menor al saldo actualizándolo, de lo contrario dar un mensaje de sobregiro. Si la opción elegida fue ‘F’ mostrar los siguientes resultados:
a. Nombre, Saldo inicial.
b. Saldo final.
c. Número de Depósitos en EFECTIVO y con CHEQUE.
 */
import java.util.Scanner;

// Clase Cliente (encapsulamiento, constructor, getters y setters)
class Cliente {

    private String nombre;
    private double saldoInicial;
    private double saldoActual;
    private int depositosEfectivo;
    private int depositosCheque;

    // Constructor
    public Cliente(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldoInicial = saldoInicial;
        this.saldoActual = saldoInicial; // El saldo actual inicialmente es igual al inicial
        this.depositosEfectivo = 0;
        this.depositosCheque = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public int getDepositosEfectivo() {
        return depositosEfectivo;
    }

    public int getDepositosCheque() {
        return depositosCheque;
    }

    // No se necesitan setters publicos para saldoActual, depositosEfectivo y depositosCheque
    // porque se modifican internamente con los metodos de deposito y retiro.
    // Métodos para las operaciones bancarias
    public void depositarEfectivo(double cantidad) {
        saldoActual += cantidad;
        depositosEfectivo++;
        System.out.println("Depósito en efectivo realizado. Nuevo saldo: " + saldoActual);
    }

    public void depositarCheque(double cantidad) {
        double comision = cantidad * 0.01;
        saldoActual += (cantidad - comision);
        depositosCheque++;
        System.out.println("Depósito con cheque realizado. Comisión: " + comision + ". Nuevo saldo: " + saldoActual);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldoActual);
        } else {
            System.out.println("Sobregiro: No tiene fondos suficientes.");
        }
    }

    public void mostrarResumen() {
        System.out.println("\n--- Resumen de Operaciones ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("Saldo Final: " + saldoActual);
        System.out.println("Número de Depósitos en Efectivo: " + depositosEfectivo);
        System.out.println("Número de Depósitos con Cheque: " + depositosCheque);
    }
}

// Clase principal (Programa)
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos iniciales del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Crear el objeto Cliente
        Cliente cliente = new Cliente(nombreCliente, saldoInicial);

        char opcion;

        do {
            // Menú de opciones
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("D - Depósito");
            System.out.println("R - Retiro");
            System.out.println("F - Fin");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextLine().toUpperCase().charAt(0); // Convertir a mayúscula y tomar el primer caracter

            switch (opcion) {
                case 'D':
                    // Depósito
                    System.out.print("Tipo de depósito (1 - Efectivo, 2 - Cheque): ");
                    int tipoDeposito = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer

                    if (tipoDeposito == 1) {
                        cliente.depositarEfectivo(cantidadDeposito);
                    } else if (tipoDeposito == 2) {
                        cliente.depositarCheque(cantidadDeposito);
                    } else {
                        System.out.println("Tipo de depósito no válido.");
                    }
                    break;

                case 'R':
                    // Retiro
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    cliente.retirar(cantidadRetiro);
                    break;

                case 'F':
                    // Fin - Mostrar resumen
                    cliente.mostrarResumen();
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 'F');

        scanner.close();
    }
}
