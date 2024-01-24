import java.util.Scanner;

public class ArregloFor {
    public void arregloConFor(){

        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);


        for(int i = 0; i< numeros.length; ++i){
            System.out.println("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }

        for(int i = 0; i< numeros.length; ++i){
            System.out.println("El numero es: "+ numeros[i]);
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i<numeros.length; ++i){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        int sumatoria = 0;

        for(int i = 0; i < numeros.length; ++i) {
            int num = numeros[i];
            sumatoria += num;
        }

        System.out.println("La sumatoria es: " + sumatoria);

        float promedio = sumatoria / numeros.length;

        System.out.println("El promedio es: " + promedio);
    }
}
