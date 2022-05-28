public class Qomolangma{
	public static void main(String[] args){
		
		double paper = 0.1;
		int count = 0;
		while(paper <= 8844430){
			paper *= 2;
			count++;
		}
		System.out.println("需要折叠"+count+"次。");
	}
}
