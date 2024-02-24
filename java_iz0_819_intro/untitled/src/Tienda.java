public class Tienda {
    public static void main(String args[]){
        // int, Integer, byte, Byte short, Short
        // char, Character, int, Integer, String
        // enum values
        int dayOfWeeb = 0;
        switch (dayOfWeeb) {
            default:
                System.out.println("weekday");
            case 0:
                System.out.println("sunday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
