/*带返回值方法定义和调用*/
public class MethodDemo05 {
    public static void main(String[] args) {
        //isEvenNumber(7);
        boolean a = isEvenNumber(6);
        System.out.println(a);
    }
    public static boolean isEvenNumber(int x){
        if(x % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
