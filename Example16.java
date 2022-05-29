/*continue语句,计算1~100偶数和*/
public class Example16 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <=100;i++){
            if(i % 2 ==0){
                continue;
            }
            sum += i;
        }
        System.out.println("sum="+sum);
    }
}
