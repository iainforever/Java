public class MethodDemo08 {
    public static void main(String[] args) {
        System.out.println(isSameNumber(1,2));
        System.out.println(isSameNumber((byte)1,(byte)2));
        System.out.println(isSameNumber((short)1,(short)2));
        System.out.println(isSameNumber((long)1,(long)2));
    }

    public static boolean isSameNumber(byte a,byte b){
        return a == b;
    }

    public static boolean isSameNumber(short a,short b){
        return a == b;
    }

    public static boolean isSameNumber(int a,int b){
        return a == b;
    }

    public static boolean isSameNumber(long a,long b){
        return a == b;
    }
}
