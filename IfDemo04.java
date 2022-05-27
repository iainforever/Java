import java.util.Scanner;
public class IfDemo04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(95 <= a && a <= 100){
            System.out.println("自行车");
        }else if(90 <= a && a <= 94){
            System.out.println("去游乐园");
        }else if(80 <= a && a <= 89){
            System.out.println("变形金刚模型");
        }else if(a < 80){
            System.out.println("挨打");
        }
    }
}
