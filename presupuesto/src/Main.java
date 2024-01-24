import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        Regla_50_30_20 nuevoCalculo = new Regla_50_30_20();
        nuevoCalculo.calculoAhorros();

        // Ejercicio 2
        CalculoIva nuevoCalculoImpuesto = new CalculoIva();
        nuevoCalculoImpuesto.calculoImpuestos();

        // Ejercicio 3
        Calculo3D nuevo3D = new Calculo3D();
        nuevo3D.calculocosto3d();

        // Ejercicio 4
        Edad nuevaPersona = new Edad();
        nuevaPersona.evaluaEdad();

        // Ejercicio 5
        Quemaduras quemado = new Quemaduras();
        quemado.calculoQuemaduras();

        // Ejercicio 6
        Respiraciones respirar = new Respiraciones();
        respirar.calculoRespirar();

        // Ejercicio 7
        RpmPorMinuto rpm1 = new RpmPorMinuto();
        rpm1.calculoRespiracion();
    }
}