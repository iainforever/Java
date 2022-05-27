import java.util.Scanner;
public class IfDemo03 {
    public static void main(String[] args){
        System.out.println("开始");

        //需求：键盘录入一个星期数（1，2，3，4，5，6，7），输出对应的星期一、星期二、。。。星期日
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数（1~7）：" );
        int week = sc.nextInt();

        if(week == 1){
            System.out.println("星期一");
        }else if(week == 2){
            System.out.println("星期二");
        }else if(week == 3){
            System.out.println("星期三");
        }else if(week == 4){
            System.out.println("星期四");
        }else if(week == 5){
            System.out.println("星期五");
        }else if(week == 6){
            System.out.println("星期六");
        }else if(week == 7){
            System.out.println("星期日");
        }else{
            System.out.println("error!");
        }
        System.out.println("结束");
    }
}
