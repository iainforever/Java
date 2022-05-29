/*&和&&的区别*/
public class Example06 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a,b;
        a = x >0 & y++ > 1;
        System.out.println("a="+a);
        System.out.println("y="+y);
        b = x > 0 && z++ > 1;
        System.out.println("b="+b);
        System.out.println("z="+z);
    }
}
