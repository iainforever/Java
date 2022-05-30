public class Example24 {
    public static void main(String[] args) {
        int[] sc = {9,8,3,5,2};
        System.out.println("排序前数组：");
        for(int i = 0;i < sc.length;i++){
            System.out.print(sc[i]+" ");
        }
        System.out.println();
        for(int i = 1;i < sc.length;i++){
            for(int j = 0;j < sc.length - i;j++){
                if(sc[j] > sc[j+1]){
                    int temp = sc[j];
                    sc[j] = sc[j+1];
                    sc[j+1] = temp;
                }
            }
        }
        System.out.println("排序后数组：");
        for (int i = 0;i < sc.length;i++){
            System.out.print(sc[i]+" ");
        }
    }
}
