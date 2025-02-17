package projectofinal;

public class Test {

    public static void main(String[] args) {
        System.out.println("-----");

        NumeroTriangular x1 = new NumeroTriangular();

        for (int n = 1; n < 11; n++) {
            long resultado = x1.calcular(n);
            System.out.print(resultado);
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("-----");
        
        
        int[] elementos = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};

        for (int i : elementos) {
            
            boolean resultado = x1.esTriangular(i);
            System.out.print(resultado);
            System.out.print("-");
            
        }
        System.out.println("");
        System.out.println(Math.sqrt(2 * 1));
        System.out.println((long)Math.sqrt(2 * 1));
    }

}

// Clase para Números Triangulares
class NumeroTriangular {

    private int n; // Encapsulación: 'n' es privado

    // Constructor por defecto
    public NumeroTriangular() {
        this.n = 1;
    }

    // Getters y Setters (encapsulación)
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long calcular(int n) {
        return (long) n * (n + 1) / 2;
    }

    public boolean esTriangular(long num) {
        long raiz = (long) Math.sqrt(2 * num);
        return raiz * (raiz + 1) == 2 * num;
    }

    public int encontrarTermino(long num) {
        if (!esTriangular(num)) {
            return -1; // No es triangular
        }
        return (int) Math.sqrt(2 * num);
    }
}
