/*if...else if...else语句*/
public class Example09 {
    public static void main(String[] args) {
        int grade = 75;
        if(grade > 90){
            System.out.println("该成绩为优。");
        }else if(grade > 80){
            System.out.println("该成绩为良。");
        }else if(grade > 70){
            System.out.println("该成绩为中。");
        }else if(grade > 60){
            System.out.println("该成绩为普。");
        }else{
            System.out.println("该成绩为差。");
        }
    }
}
