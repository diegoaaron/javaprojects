package capitulo_01;

/**
 * Evaluando las las referencias a objetos y bloques de espacio | n° 4
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

        String argumento = "la \" y \"\"\" escapada con un back slash";
        System.out.println(argumento);

        String argumentoBloque = """
                                 La \" y \"\"\" escapada en un bloque
                                 de texto
                                 """;
        System.out.println(argumentoBloque);

        // String argumento2 = "la \""" escapada con un back slash"; | arrojara error
        String argumentoBloque2 = """
                                 La \""" escapada en un bloque
                                 de texto
                                 """;
        System.out.println(argumentoBloque2);

        String argumento3 = "utiilzando espacio al final y se notara ";
        System.out.println(argumento3 + "|");

        String argumentoBloque3 = """
                                 utilizando espacio 
                                 al final y no se notara 
                                 """;
        System.out.println(argumentoBloque3 + "|");

        String argumento4 = "utiilzando espacio\scon \\s"; // espacio y no hay salto de linea
        System.out.println(argumento4);

        String argumentoBloque4 = """
                                 utilizando\sespacio
                                 con \\s dentro del bloque                                 
                                 """;
        System.out.println(argumentoBloque4);

        var b = 3;
        System.out.println(3 + " - " + ((Object) b).getClass().getName());

    }

}
