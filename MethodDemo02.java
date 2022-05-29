public class MethodDemo02 {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax(){
        int a = 4;
        int b = 8;
        if(a > b){
            System.out.println("max="+a);
        }else {
            System.out.println("max="+b);
        }
    }
}
