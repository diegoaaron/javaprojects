import java.util.Scanner;

public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta(){

    }

    public String getTitular(){
        return this.titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println("titular de la cuenta: " + titular);
        System.out.println("cantidad: S/. " + cantidad);
    }

    public void ingresar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad: ");
        float valor = teclado.nextFloat();
        if(valor > 0) {
            cantidad += valor;
        }
    }

    public void retirar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar: ");
        float valor = teclado.nextFloat();
        if(valor > 0) {
            cantidad -= valor;
        }
    }
}
