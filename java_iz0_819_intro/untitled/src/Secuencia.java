public class Secuencia {
    public static void main(String[] args){
        for(int i = 1; i<= 100; i++){
            for(int j = 1; j<=i; j++){
                System.out.println(i + " ");
                //System.out.println("- " + j);
                break;
            }
        }
    }
}
