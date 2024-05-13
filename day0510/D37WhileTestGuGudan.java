/*
	사용자한테 구구단 중에 몇 단을 출력할지 물어봐서 그 구구단을 출력하는 프로그램을 while 문을 이용하여 작성해봅니다.
*/
import java.util.Scanner;
class D37WhileTestGuGudan 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int dan, i = 1;
		System.out.print("구구단 중에 몇 단을 출력할까요? ");
		dan = sc.nextInt();
		System.out.printf("*** %d단 ***\n", dan);
		while(i <=9 ){			
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			i++;
		}
		/*
		Scanner sc = new Scanner(System.in);
		int n, i = 1;
		System.out.print("임의의 수 N을 입력하세요 ==> ");
		n = sc.nextInt();
		while(i <= 9){
			System.out.printf("%d * %d = %d\n", n , i, n * i);
			i++;
		}*/

	}
}
