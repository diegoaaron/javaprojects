public class Archivo2 {
    public static void main(String[] args){
        String text = "Lucas Moy";
        System.out.println(text.charAt(0)); // L
        System.out.println(text.length()); // 9
        System.out.println(text.toUpperCase()); // LUCAS MOY
        System.out.println(text.concat("dev")); // Lucas Moy dev
        System.out.println(text.contains("ca")); // true
        System.out.println(text.trim()); // Lucas Moy
        System.out.println(text.replace('s','z')); // Lucaz Moy
        System.out.println(text.startsWith("lu")); // false
        System.out.println(text.indexOf("c")); // 2
        System.out.println(text.substring(3)); // as Moy
        System.out.println(text.substring(2,4)); // ca
        System.out.println(text.equalsIgnoreCase("lucas moy")); // true

        String text1 = "Hello World, how are you?";
        String[] words = text1.split(" "); // separa según encuentra el espacio

        for(String w: words){
            System.out.println(w);
        }


    }
}
