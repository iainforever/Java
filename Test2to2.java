public class Test2to2 {
    public static void main(String[] args) {
        int[] arr = new int[] {25,24,12,76,101,96,28};
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i = 1;i < arr.length;i++){
            for(int j = 0;j < arr.length - i;j++){//for(int j = 0;j < i;j++){错误
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
