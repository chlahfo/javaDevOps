import java.util.Scanner;

public class MaxTest{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("첫 번째 수를 입력하세요 ==> ");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 ==> ");
		b = sc.nextInt();
		
		if(b > a){
			a = b;
		}
		System.out.println(a);
	}	
}