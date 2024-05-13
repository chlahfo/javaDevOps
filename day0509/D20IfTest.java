/*
	사용자한테 임의의 수 n을 입력받아 화면에 출력하는 프로그램을 작성합니다.
	단 그 수가 음수이면 제곱하여 출력합니다.
*/
import java.util.Scanner;
class D20IfTest 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력해주세요 ==> ");
		n = sc.nextInt();
		if(n < 0)
			n *= n;
		System.out.println(n);
	}
}
