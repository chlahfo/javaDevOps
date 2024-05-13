//소수 판별
/*
	사용자한테 N을 입력받아서 소수인지 판별하는 프로그램
*/
/*
import java.util.Scanner;
class D29PrimNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		System.out.print("N을 입력하시오 ==> ");
		n = sc.nextInt();

		for(int i =1; i <= n; i++ ){
			if(n % i == 0){
				cnt++;
			}
		}

		if(cnt == 2){
			System.out.printf("%d는 소수입니다.", n);
		}else{
			System.out.printf("%d는 소수가 아닙니다.", n);
		}
	}
}
*/
import java.util.Scanner;
class D29PrimNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		if(n % 2 == 0 ||n % 3 == 0){
			flag = false;
		}else{
			for (int i = 5; i <= n / 2; i++)
			{
				if(n % i == 0){
					flag = false;
					break;
				}else{
					flag = true;
				}
			}
		}
		System.out.println(flag);
	}
}