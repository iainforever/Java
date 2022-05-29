/*类型自动提升*/
public class Example03 {
    public static void main(String[] args) {
        byte b = 3;
        short s = 4;
        char c = 5;
        byte by = b + s + c;
        System.out.println("by="+by);
    }
}
