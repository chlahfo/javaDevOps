/*
	5! = 5 *4* 3*2*1;
	사용자한테 N을 입력받아서 N! 을 구하여 출력하는 프로그램을 작성한다.
	<<실행 예>>
	N을 입력하세요 ==> 4
	4 * 3 * 2 * 1 = ___
*/
import java.util.Scanner;
class D32FactorialTest 
{
	public static void main(String[] args) 
	{
		int n, result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하세요 ==> ");
		n = sc.nextInt();
		/*
		int n;
		long result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하세요 ==> ");
		n = sc.nextInt();
		for (int i = n; i > 0; i--)
		{
			result *= i;
			if(i != 1)
				System.out.print(i+" * ");
			else
				System.out.print(i+" = ");
		}
		System.out.print(result);*/
		for(int i = n; i >= 1; i--){
			result *= i;
			System.out.print(i);
			if(i != 1)
				System.out.print("*");
		}
		System.out.print("=");
		System.out.println(result);
	}
}
