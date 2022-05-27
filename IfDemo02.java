/*
判断奇数偶数
 */
import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args){
        //输入一个数据
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();

        //判断是奇数还是偶数
        if(a % 2 == 0){
            System.out.println("a是偶数");
        }else{
            System.out.println("a是奇数");
        }
    }
}
