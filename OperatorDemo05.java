/*
自增自减运算符
 */
public class OperatorDemo05 {
    public static void main(String[] args){
        //定义变量
        int i = 10;
        System.out.println("i:"+i);

        //单独使用
        i++;
        //++i;
        System.out.println("i:"+i);

        //参与操作使用
        //int j = i++;不同
        int j = ++i;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
