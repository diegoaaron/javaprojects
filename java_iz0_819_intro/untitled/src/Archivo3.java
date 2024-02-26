public class Archivo3 {
    public static void main(String[] args){
        String[] fruits = {"banana", "mango", "banana"};
        String[] alias = fruits;
        System.out.println(fruits.equals(alias)); // true

        int[][] matrix = {{5,2,6},{3},{5,6,8}};

        System.out.println(matrix[1][0]); // 3
        System.out.println(matrix[1][1]); // Exception
    }
}
