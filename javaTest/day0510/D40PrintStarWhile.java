/*
	다음과 같이 동작하는 프로그램을 중첩 while문을 이용하여 작성해봅니다.

	별을 몇 줄 출력할까요? 3
	별을 몇 칸 출력할까요? 5
	*****
	*****
	*****
*/
import java.util.Scanner;
class D40PrintStarWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rows, cols, i = 1, j = 1;
		System.out.print("별을 몇줄 출력할까요?");
		rows = sc.nextInt();
		System.out.print("별을 몇칸 출력할까요?");
		cols = sc.nextInt();

		while(i<= rows){
			j = 0;
			while(j <=cols){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		/*
		Scanner sc = new Scanner(System.in);
		int i, j, n, m;
		i = 0;
		
		System.out.print("별을 몇줄 출력할까요? ");
		n = sc.nextInt();
		System.out.print("별을 몇칸 출력할까요? ");
		m = sc.nextInt();

		while(i < n){
			j = 0;
			while(j < m){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
	}
}
