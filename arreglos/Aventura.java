import java.util.Scanner;

public class Aventura {
    public void contandoHistoria(){
        System.out.println("Te encuentras en un bosque misterioso: ");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro... ");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña... ");
        Scanner teclado = new Scanner(System.in);

        int opcion1 = teclado.nextInt();

        if (opcion1 == 1) {
            System.out.println("fin");
        } else if (opcion1 == 2) {
            System.out.println("al llegar a la cabaña la puerta estaba abierta...");
            System.out.println("1) Ingreso a la cabaña con un nudo en la garganta ");
            System.out.println("2) me voy corriendo");
            opcion1 = teclado.nextInt();
        }

        if (opcion1 == 1) {
            System.out.println("encuentro todo desordenado y removido...");
        } else {
            System.out.println("Fin!");
        }

    }
}
