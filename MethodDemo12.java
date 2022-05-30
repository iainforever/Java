public class MethodDemo12 {
    public static void main(String[] args) {
    int[] arr = {42,52,73,24,35};
    //调用获取最大值的方法，用变量来接收返回结果
        int number = compare(arr);
        System.out.println(number);
    }
    public static int compare(int[] arr){
        int max = arr[0];
        for(int x = 1;x < arr.length;x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }
}
