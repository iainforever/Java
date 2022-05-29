/*带参数方法的定义和调用*/
public class MethodDemo03 {
    public static void main(String[] args) {
        isEvenNumber(6);
    }
    public static void isEvenNumber(int number){
        if(number % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
