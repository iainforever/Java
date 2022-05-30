/*对于基本数据类型的参数，形式参数的改变，不影响实际参数的值*/
public class MethodDemo09 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(number);
    }
    public static void change(int number){
        number = 200;
    }
}
