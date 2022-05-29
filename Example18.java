/*定义数组，访问数组中的元素*/
public class Example18 {
    public static void main(String[] args) {
        int[] ids = new int[100];
        System.out.println(ids[0]);
        System.out.println(ids[99]);
        System.out.println("==========");

        String[] names = new String[]{"Taylor","Jack","Aaron"};
        System.out.println("names[0]="+names[0]);
        System.out.println("names[1]="+names[1]);
        System.out.println("==========");

        Object[] object = {"Shunda","Renwei","Shian"};
        System.out.println("数组的长度为："+object.length);
        System.out.println("object[0]="+object[0]);
        System.out.println("object[1]="+object[1]);
    }
}
