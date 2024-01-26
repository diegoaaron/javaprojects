import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] personas = {"Lucas Moy", "Aldo Angelini", "Julia Gomez", "Manuel Santillan",
                "Juan Torres"};

        System.out.println("Ingrese su búsqueda: ");
        Scanner teclado = new Scanner(System.in);

        String personaAEncontrar = teclado.nextLine();

        // forma 1
        /*
        for(int i = 0; i<personas.length; ++i){
            if(personaAEncontrar.equalsIgnoreCase(personas[i])){
                System.out.println("Persona encontrada: " + personas[i] + " en la posicion " + i);
            }
        }
        */

        // forma 2
        for(String nombrePersona: personas) {
            if(nombrePersona.toLowerCase().contains(personaAEncontrar.toLowerCase())) {
                System.out.println("La persona es: " + nombrePersona);
            }
        }

    }
}
