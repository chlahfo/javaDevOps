/*
	다음과 같이 동작하는 프로그램을 작성해봅니다.

	<<실행 예 >>
	별을 몇 줄 출력할까요? 3
	별을 몇 칸 출력할까요? 5
*/
import java.util.Scanner;
class D27PrintStar{
	public static void main(String[] args) 
	{
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 몇 줄 출력할까요? ==> ");
		m = sc.nextInt();
		System.out.print("별을 몇 개 출력할까요? ==> ");
		n = sc.nextInt();

		for (int j = 0; j < m ; j++){
			for (int i = 0;i < n ; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
