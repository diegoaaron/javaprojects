import java.util.Scanner;

public class RpmPorMinuto {
    public void calculoRespiracion() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();

        System.out.println("Ingrese su nivel de actividad: ");
        System.out.println("1) Sedentario ");
        System.out.println("2) Moderado ");
        System.out.println("3) Activo ");
        int nivelActividad = teclado.nextInt();

        System.out.println("Ingrese su sexo: ");
        System.out.println("1) Hombre ");
        System.out.println("2) Mujer ");
        int sexo = teclado.nextInt();

        boolean esHombre = sexo == 1;
        float frecuenciaMaxima;
        if (esHombre) {
            frecuenciaMaxima = 220 - edad;
        } else {

            frecuenciaMaxima = 226 - edad;
        }

        float frecuenciaMinima = 0.0f;

        int SEDENTARIO = 1;
        int MODERADO = 2;
        int ACTIVO = 3;


        if (nivelActividad == SEDENTARIO) {
            frecuenciaMinima = frecuenciaMaxima * 0.5f;
        } else if (nivelActividad == MODERADO) {
            frecuenciaMinima = frecuenciaMaxima * 0.2f;
        } else if (nivelActividad == ACTIVO) {
            frecuenciaMinima = frecuenciaMaxima * 0.1f;
        }
        System.out.println("Su rango objetivo de frecuencia cardiaca es entre " + frecuenciaMinima + " a " + frecuenciaMaxima + " latidos por minuto");

    }
}
