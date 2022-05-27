/*
If语句格式1

格式：
    if (关系表达式) {
        语句体
    }

 */
public class IfDemo01 {
    public static void main(String[] args){
        System.out.println("开始");

        //定义两个变量
        int a = 10;
        int b = 20;

        //需求：判断a和b是否相等，如果相等，就输出a等于b
        if(a == b){
            System.out.println("a = b");
        }else{
            System.out.println("a != b");
        }
        System.out.println("结束");
    }
}
