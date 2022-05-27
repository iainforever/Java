/*
比较老虎A和老虎B的体重是否相等
 */
public class Compare {
    public static void main(String[] args){
        //定义两个变量
        int a = 180;
        int b = 200;

        //使用三元运算符进行比较
        boolean conclusion = (a == b) ? true : false;
        System.out.println("conclusion:"+conclusion);
    }
}
