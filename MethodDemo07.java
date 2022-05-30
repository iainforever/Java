/*方法重载*/
public class MethodDemo07 {
    public static void main(String[] args) {
        int x = sum(10,20);
        System.out.println(x);

        double y = sum(10.0,20.0);
        System.out.println(y);

        int z = sum(10,20,30);
        System.out.println(z);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(double a,double b){
        return a + b;
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }
}
