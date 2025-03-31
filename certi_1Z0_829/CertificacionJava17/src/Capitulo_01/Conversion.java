package capitulo_01;

/**
 * Evaluando las las referencias a objetos | n° 4
 *
 * @author Diego Aarón
 */
public class Conversion {

    /**
     * Constructor basico
     */
    public Conversion() {

    }

    /**
     * Metodo main basico para pruebas de conversion entre primivitos y objetos referenciados
     *
     * @param args entrada por defecto
     */
    public static void main(String[] args) {

        int primitivo = Integer.parseInt("123"); // convierte una cadena a primitivo
        Integer encapsulado = Integer.valueOf("123"); // convierte una cadena a un objeto

        Double numeroDecimal = Double.valueOf("200.99");
        System.out.println(numeroDecimal.byteValue()); // -56 por desbordamiento de byte | 200 - 256
        System.out.println(numeroDecimal.intValue()); // 200
        System.out.println(numeroDecimal.doubleValue()); // 200.99

    }

}
