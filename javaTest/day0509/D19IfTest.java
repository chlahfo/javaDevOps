/*
	사용자한테 임의의 수 N을 입력받아 그 수가 양수(0포험)이면, 더하기 100을 하여 출력한 후 "작업종료"를 출력하고, 그렇지 않으면 그 수의 제곱을 출력한 후 "작업 종료"를 출력한다
*/
import java.util.Scanner;
class D19IfTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 ==> ");
		int n = sc.nextInt();
		if(n >= 0)
			System.out.println(n + 100);
		else
			System.out.println(n * n);
		System.out.println("작업종료");
		
	}
}
