//1~100 모든 수 출력하기
import java.util.Scanner;
class D28Print1ToNMultiple3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int to;
		int n = 1;
		int sum = 0;
		System.out.print("1부터 어디까지 3의 배수를 더할까?");
		to = sc.nextInt();
		while(flag){
			if(n % 3 == 0){
				sum = sum + n;
			}
			if(n == to){
				flag = false;
			}
			//n = n + 1
			//n++;
			++n;
		}
		System.out.printf("1부터 %d까지의 3의 배수의 합은 %d", to, sum);
	}
}



/*
	Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int n, i;
		
		System.out.print("출력할 숫자를 입력하세요 => ");
		n = sc.nextInt();
		i = 1;
		while(flag){
			System.out.printf("%5d",i);
			if(i == n){
				flag = false;
			}
			i = i + 1;
		}
*/
