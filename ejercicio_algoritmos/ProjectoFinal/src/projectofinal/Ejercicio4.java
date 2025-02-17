package projectofinal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Empleado (encapsulamiento, constructor, getters y setters)
class Empleado {
    private String nombre;
    private int categoria;
    private double sueldoBasico;
    private int numeroHijos;

    public Empleado(String nombre, int categoria, double sueldoBasico, int numeroHijos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.sueldoBasico = sueldoBasico;
        this.numeroHijos = numeroHijos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    // Setters (si fueran necesarios, en este caso no modificaremos los datos una vez creados)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    

    // Métodos de cálculo
    public double calcularBonificacionCategoria() {
        switch (categoria) {
            case 1:
                return sueldoBasico * 0.15;
            case 2:
                return sueldoBasico * 0.12;
            case 3:
                return sueldoBasico * 0.10;
            default:
                return sueldoBasico * 0.07;
        }
    }

    public double calcularBonificacionHijos() {
        if (numeroHijos <= 3) {
            return numeroHijos * 25;
        } else if (numeroHijos <= 6) {
            return numeroHijos * 40;
        } else {
            return numeroHijos * 60;
        }
    }

    public double calcularSueldoNeto() {
        return sueldoBasico + calcularBonificacionCategoria() + calcularBonificacionHijos();
    }
}


// Clase principal (Programa)
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();  // Lista para almacenar los empleados

        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Ingresar empleado");
            System.out.println("2. Mostrar empleados y sueldos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Ingresar empleado
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese la categoría del empleado (1, 2, 3, u otro número): ");
                    int categoria = scanner.nextInt();

                    System.out.print("Ingrese el sueldo básico del empleado: ");
                    double sueldoBasico = scanner.nextDouble();

                    System.out.print("Ingrese el número de hijos del empleado: ");
                    int numeroHijos = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Empleado empleado = new Empleado(nombre, categoria, sueldoBasico, numeroHijos);
                    empleados.add(empleado); // Agregar el empleado a la lista
                    System.out.println("Empleado ingresado correctamente.");
                    break;

                case 2:
                    // Mostrar empleados y sueldos
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("\n--- Lista de Empleados ---");
                        for (Empleado emp : empleados) {
                            System.out.println("Nombre: " + emp.getNombre());
                            System.out.println("Categoría: " + emp.getCategoria());
                            System.out.println("Sueldo Básico: " + emp.getSueldoBasico());
                            System.out.println("Número de Hijos: " + emp.getNumeroHijos());
                            System.out.println("Bonificación por Categoría: " + emp.calcularBonificacionCategoria());
                            System.out.println("Bonificación por Hijos: " + emp.calcularBonificacionHijos());
                            System.out.println("Sueldo Neto: " + emp.calcularSueldoNeto());
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 3:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}