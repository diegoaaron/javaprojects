package capitulo_01;

/**
 * Clase que explica detalles sobre la declaración de variables | n° 5
 *
 * @author Diego Aarón
 */
public class Variables {

    /**
     * Constructor de referencia
     */
    public Variables() {
        // tipos de definición de variables

        long okident;
        float $Okdent;
        boolean _alsoOk1d3;
        char _SStest;

        // int 3dpoint; no se puede empezar con un numero
        // byte holy@; no se puede utilizar @
        // String public; no se puede utilizar una palabra reservada
        // String *$dad; no se puede iniciar o utilzar el caracter *     
    }

    /**
     * funcion donde definimos 4 variable pero inicializamos 2
     */
    void sandFen() {
        String s1, s2;
        String s3 = "si", s4 = "no";
    }

    /**
     * funcion donde definimos 3 variables pero inicializamos solo la última
     */
    void ladFen() {
        int a1, a2, a3 = 0;
    }

    /**
     * no compila la funcion porque falta un valor para onlyBranch en el "else"
     */
    void findAndswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyBranch;

        if (check) {
            onlyBranch = 3;
            answer = 1;
        } else {
            answer = 12;
        }

        System.out.println(answer);
        // System.out.println(onlyBranch); 
    }

    /**
     * mostrando posibles problemas con una variable local
     */
    public void checkAnswer() {
        boolean value; // value es una variable local
        //findAndswer(value); no compila porque "value" no se inicializo
    }
    
    /**
     * mostrando el uso de "var" para definir variables locales
     */
    public void whatTypeAm(){
        var name = "Hello";
        var size = 7;
        
    }

}
