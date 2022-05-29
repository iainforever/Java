/*forfor嵌套，打印乘法口诀表*/
public class Example14 {
    public static void main(String[] args) {
        for(int a = 1;a <= 9;a++){
            for(int b = 1;b <= a;b++){
                System.out.println(b + " * " + a + " = " + b * a + "\t");
            }
            System.out.println("");
        }
    }
}
