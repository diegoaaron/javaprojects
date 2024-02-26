public class Modulo1 {
    public static void main(String[] args){
        System.out.println(1 + 3 + "a");
        System.out.println("a" + 1 + 3);

        String text = "";
        text += 1;
        text += 1;

        System.out.println(text);
        String text2 = "11";
        System.out.println(text == text2); // false
        System.out.println(text.equals(text2)); // true
    }
}
