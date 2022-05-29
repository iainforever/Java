import java.util.Random;

public class RandomDemo01 {

  public static void main(String[] args) {
  
  Random r = new Random();
  int number = r.nextInt(10);
  System.out.println(number);
   
  }
}
