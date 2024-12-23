public class Mouse{
 final static int MAX_LENGTH = 5;
 int length;

 public void grow(int inches){
  System.out.println("inicio" + length);
  if(length < MAX_LENGTH){
   int newSize = length + inches;
   length = newSize;
  }
  System.out.println("final" + length);
 }

 public static void main(String[] args){
    Mouse x1 = new Mouse();

    x1.grow(50);

 }

}
