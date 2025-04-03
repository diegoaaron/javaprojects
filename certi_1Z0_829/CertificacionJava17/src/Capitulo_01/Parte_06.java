package capitulo_01;

/**
 * Explicaciones finales del capitulo | n° 6
 *
 * @author Diego Aarón
 */
public class Parte_06 {

    /**
     * Constructor por defecto
     */
    public Parte_06() {

    }

    /**
     * demostrando como una variable local "bites" solo se puede invocar dentro del scope donde se creo
     *
     * @param a1 parametro simple de entrada
     */
    public void eath(boolean a1) {
        if (a1) {
            int bites = 100;
        }
        //System.out.println(bites); error porque la variable local solo existe dentro de scope
    }

    /**
     * mostrando el coportamiento del GARBAGE COLECTOR para depurar memoria en el HEAP el HEAP es un espacio
     * en memoria RAM que el JVM separa para el almacenamiento de objetos creados a través de la palabra
     * reservada NEW
     *
     * @param args parametro por defecto
     */
    public static void main(String[] args) {
        String one, two;

        one = new String("a1"); // creando objeto y referenciandolo a "one"
        two = new String("b1"); // creando objeto y referenciandolo a "two"

        one = two; // "one" ahora se referencia hacia "b1"

        String three = one; // nueva referencia "three" apunta a "b1" guiandose a través de "one"

        one = null; // referenciando one ahora al vacio

        // despues de estas accioens en el HEAP el objeto "a1" queda al aire mientras las referencias 
        // "two" y "three" apuntan a "b1"
    }

}
