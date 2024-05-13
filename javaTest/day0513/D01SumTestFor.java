/*
	사용자한테 N을 입력받아 1~N까지의 합을 누적하여 출력하는 프로그램을 for, while, do~while으로 각각 작성해봅니다.
*/
import java.util.Scanner;
class  D01SumTestFor
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int sum, n;
		System.out.print("임의의 자연수 N을 입력하세요 ==> ");

		n = sc.nextInt();
		//for
		sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		//while
		int i = 0;
		sum = 0;
		while(i<= n){
			sum += i;
			i++;
		}
		System.out.println("sum : " + sum);

		//do~while
		i = 0;
		sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= n);
		System.out.println("sum : " + sum);

	}
}
