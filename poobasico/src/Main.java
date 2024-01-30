import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Cliente cliente1 = cargarCliente();
        //cliente1.mostrarDatos();

        Cuenta cuenta1 = new Cuenta();
        cuenta1.ingresar();
        cuenta1.retirar();
        cuenta1.mostrar();
    }

    private static Cliente cargarCliente(){
        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Ingrese el nombre: ");
        cliente.setNombre(teclado.nextLine());

        System.out.println("Ingrese el apellido: ");
        cliente.setApellido(teclado.nextLine());

        System.out.println("Ingrese la edad: ");
        cliente.setEdad(teclado.nextInt());

        return cliente;
    }
}
