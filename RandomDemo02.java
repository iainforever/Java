import java.util.Random;
import java.util.Scanner;

public class RandomDemo02 {

  public static void main(String[] args) {
  
  Random r = new Random();
  Scanner sc = new Scanner(System.in);
  
  int a = r.nextInt(100)+1;
  int b = sc.nextInt();
  
  if(a < b){
    System.out.println("您猜的数据大了！随机数是："+a);
  }else if(a == b){
    System.out.println("恭喜您！猜对了！随机数是："+a);
  }else if(a > b){
    System.out.println("您猜的数据小了！随机数是："+a);
  }
   
  }
}
