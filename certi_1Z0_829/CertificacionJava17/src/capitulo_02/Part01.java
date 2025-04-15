package capitulo_02;

/**
 * Practicando la sección de operadores
 *
 * @author Diego Aarón
 */
public class Part01 {

    /**
     * Constructor por defecto
     */
    public Part01() {

    }

    /**
     * probando los operadores en objetos
     *
     * @param args valor por defecto
     */
    public static void main(String[] args) {

        // pracitando el operadores complemento a uno "~" 
        // por comodidad solo mostraremos los últimos cuatro bits (en lugar de los 32)
        int value = 3; // es 0011 3
        int comp = ~3; // es 0100 4

        System.out.println(value);
        System.out.println(comp);
    }

}
