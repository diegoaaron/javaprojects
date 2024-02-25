public class MyShop {
    static int total = 5;
    public static void main(String[] args){
        int chocolates = 5;
        while(chocolates > 0 && total > 0){
            chocolates--;
            total--;
        }
        System.out.println(chocolates + " chocolates left " + total);
    }
}
