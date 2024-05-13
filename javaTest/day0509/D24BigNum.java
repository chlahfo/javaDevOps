/*
	사용자한테 3개의 정수를 입력받아 그 중에 가장 큰 수를 찾아서 출력하는 프로그램을 중첩 if 문을 이용하여 작성
*/
import java.util.Scanner;
class D24BigNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.print("임의의 수 a를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("임의의 수 b를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("임의의 수 c를 입력하세요 : ");
		c = sc.nextInt();
		max = a;

		if(a > b){
			if(c > a){
				max = c;
			}else{
				max = a;					
			}
		}else{
			if(c > b){
				max = c;
			}else{
				max = b;					
			}
		}
		System.out.println(max);
	}
}
