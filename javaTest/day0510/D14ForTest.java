/*
	연습 : 사용자한테 임의의 수 n을 입력받아 1에서 n까지의 홀수를 모두 출력하는 프로그램을 작성해봅시다.
*/
import java.util.Scanner;
class D15ForTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N을 입력 ==> ");
		n = sc.nextInt();
		for(int i = 1;i <= n ; i = i +2){
			System.out.println(i);
		}
	}
}
/*
	Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("임의의 수 n을 입력해주세요 ==> ");
		n = sc.nextInt();
		for (int i = 1; i < n ; i = i +2)
		{
			System.out.printf("%5d", i);				
		}
*/