/*为数组中元素赋值和修改*/
public class Example19 {
    public static void main(String[] args) {
        int[] ids = new int[100];
        System.out.println("ids[0]="+ids[0]);

        ids[0] = 2500;
        System.out.println("ids[0]="+ids[0]);
        System.out.println("==========");

        String[] names = new String[]{"Taylor","Jack","Aaron"};
        System.out.println("names[0]="+names[0]);

        names[0] = "Jeo";
        System.out.println("names[0]="+names[0]);
        System.out.println("==========");

        Object[] object = {"Taylor","Jack","Aaron"};
        System.out.println("object[0]="+object[0]);

        object[0] = "Jeo";
        System.out.println("object[0]="+object[0]);
    }
}
