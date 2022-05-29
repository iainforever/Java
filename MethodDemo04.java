/*带参数方法；打印两个数的较大值*/
public class MethodDemo04 {
    public static void main(String[] args) {
        //getMax(4,5);
        int a = 6;
        int b = 7;
        getMax(a,b);
    }
    public static void getMax(int a,int b){
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
