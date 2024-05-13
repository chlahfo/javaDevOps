/*
	사용자한테 임의의 수 N을 입력받아 그 수가 6의 배수인지 판별하여 적합한 메시지를 출력하는 프로그램을 작성합니다.
*/
import java.util.Scanner;
class D22MultipleOf6
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		String result = "6의 배수가 아닙니다.";
		System.out.print("숫자 한개를 입력하세요 ==>");
		n = sc.nextInt();
		boolean flag = n % 6 == 0;
		if(flag){
			result = "6의 배수입니다.";
		}
		System.out.printf("%d는 %s", n, result);
	}
}
/*
	int n;
		Scanner sc = new Scanner(System.in);
		boolean flag;

		System.out.print("임의의 자연수 n을 입력하세요 => ");
		n = sc.nextInt();
		flag = n % 6 == 0;
		
		if(flag){
			System.out.println("6의 배수입니다.");
		}else{
			System.out.println("6의 배수가 아닙니다.");
		}
*/