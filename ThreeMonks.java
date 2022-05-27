/*
求三个和尚最高的身高
 */
public class ThreeMonks {
    public static void main(String[] args){
        //定义变量
        int a = 150;
        int b = 210;
        int c = 165;

        //使用三元运算符俩俩比较
        int h = (a > b) ? a : b;
        int highest = (h > c) ? h : c;
        System.out.println("highest:"+highest);
    }
}
