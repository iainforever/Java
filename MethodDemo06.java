public class MethodDemo06 {
    public static void main(String[] args) {
        //getMax(3,5)
        int x = getMax(3,5);
        System.out.println(x);
    }
    public static int getMax(int a,int b){
       if(a > b){
           return a;
       }else {
           return b;
       }
    }
}
