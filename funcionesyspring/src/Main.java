public class Main {
    public static void main(String[] args){

        CalculoNumero miArrayNumeros = new CalculoNumero();
        miArrayNumeros.calculandoArreglos();

        int[] valors = new int[2];
        valors[0] = 10;
        valors[1] = 20;
        calculoAreaCuadrado(valors);


    }

    private static void calculoAreaCuadrado(int[] valores){
        float ancho = valores[0];
        float alto = valores[1];

        float area = ancho * alto;
        System.out.println("el area es: " + area);
    }
}
