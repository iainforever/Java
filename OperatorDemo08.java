/*
短路逻辑运算符
 */
public class OperatorDemo08 {
    public static void main(String[] args){
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        //&&
        System.out.println((i > j) && (i > k));//f && f
        System.out.println((i < j) && (i > k));//t && f
        System.out.println((i > j) && (i < k));//f && t
        System.out.println((i < j) && (i < k));//t && t
        System.out.println("--------");

        //||
        System.out.println((i > j) || (i > k));//f || f
        System.out.println((i < j) || (i > k));//t || f
        System.out.println((i > j) || (i < k));//f || t
        System.out.println((i < j) || (i < k));//t || t
        System.out.println("--------");

        //&&和&
        //System.out.println((i++ > 100) & (j++ > 100));//f & f
        System.out.println((i++ > 100) && (j++ > 100));//f && f
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
