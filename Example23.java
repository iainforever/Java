/*遍历寻找最值*/
public class Example23 {
    public static void main(String[] args) {
        int[] arr = {11,23,45,32,22};
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max="+max);
    }
}
