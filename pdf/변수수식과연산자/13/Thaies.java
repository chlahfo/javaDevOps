import java.util.Scanner;

public class Thaies{
	public static void main(String []args){
		double ac, ae, bc, de;
		Scanner sc = new Scanner(System.in);

		System.out.print("변 ac의 길이: ");
		ac = sc.nextInt();
		System.out.print("변 ae의 길이: ");
		ae = sc.nextInt();		
		System.out.print("변 bc의 길이: ");
		bc = sc.nextInt();
		de = ae * bc / ac;
		System.out.println("변 de의 길이는 "+de+"이다.");
	}
}