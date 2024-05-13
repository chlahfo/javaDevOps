import java.util.Scanner;

public class MathTest{
	public static void main(String []args ){
		int a;
		int b;
		int tot;
		
		Scanner sc = new Scanner(System.in);
		a = 2 + 3;
		System.out.print("b = ");
		b = sc.nextInt();
		tot = a + b;
		System.out.println("a = " +a+ ", b = "+b+ ", tot = "+tot);
	}
}
//a 에 2+3을 대입한다.
//a와 b를 더하여 tot에 저장한다.