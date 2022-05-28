import java.util.Scanner;
public class SwitchDemo02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份数（1~12）：");
        int month = sc.nextInt();

        switch (month){
            case 3,4,5:
                System.out.println("这是春季。");
                break;
            case 6,7,8:
                System.out.println("这是夏季。");
                break;
            case 9,10,11:
                System.out.println("这是秋季。");
                break;
            case 1,2,12:
                System.out.println("这是冬季。");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}
