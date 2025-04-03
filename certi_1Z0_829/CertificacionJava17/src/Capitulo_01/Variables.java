package capitulo_01;

/**
 * Clase que explica detalles sobre la declaración de variables | n° 5
 *
 * @author Diego Aarón
 */
public class Variables {

    // var tr1 = "hola"; no compila ya que var no funciona para variables de instancia
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
     *
     */
    public void whatTypeAm() {
        var name = "Hello";
        var size = 7;
        // name = 33; no funciona ya que var no soporte cambiar el tipo de variable

        //var sili;
        // sili = 3; no compila porque al utilizar var la definición y asignación van en una sola línea
    }

    /**
     * probando como definir campos con var
     *
     * @param check parametro basico
     */
    public void twoTipes(boolean check) {

        /*
        var question;
         question = 1; debe ir todo en 1 sola linea cuando usamos var
        
        var answer;
        if (check){
          answer = 33;        
        } else {
          answer = 22;
        }
        
        System.out.println(answer);
         */
    }

    /**
     * mas pruebas de la inferencia de tipos con "var"
     */
    public void tipes() {
        //int a, var b = 3; no compila porque la inferencia de tipos debe ir sola en 1 linea
        //var n = null; deberia inferirlo al tipo Object pero Java no acepta esta acción
    }

    /*
    public int addition(var a, var b){
        return a + b;
    }
    
    no compila porque var se debe usar variables locales y no como parametros
     */
}
