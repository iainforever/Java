/*
类型转换
 */
public class ConversionDemo {
    public static void main(String[] args){
        //自动类型转换
        double d = 10;
        System.out.println(d);

        //定义byte类型的变量
        byte b = 10;
        short s = b;
        System.out.println(s);

        //这是不可以的
        //char c = b;

        System.out.println("--------");

        //强制类型转换
        int k = (int)88.88;
        System.out.println(k);
    }
}
