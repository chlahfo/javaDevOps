/*
	다음과 같이 동작하는 프로그램을 작성해봅니다.

	<<실행 예 >>
	별을 몇 개 출력할까요? 7
*/
import java.util.Scanner;
class D26PrintStar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 몇개 출력할까요? ==> ");
		int n = sc.nextInt();
		for (int i = 0;i < n ; i++)
		{
			System.out.print("*");
		}

	}
}
