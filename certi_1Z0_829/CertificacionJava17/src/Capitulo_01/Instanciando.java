package capitulo_01;

/**
 * Clase donde defini al constructor | n° 3
 *
 * @author usuario
 */
public class Instanciando {

    int numeros = 12; // inicializando en la definición de la variable 
    String nombre;

    // double valor_a = _100.00;  error
    // double valor_b = 100.00_; error
    // double valor_c = 100_.00; error
    double valor_d = 1_0_0.0_0;
    double valor_e = 1__0.00;

    /**
     * Constructor simple
     */
    public Instanciando() {
        nombre = "la lluvia"; // inicializando en el constructor
    }

}
