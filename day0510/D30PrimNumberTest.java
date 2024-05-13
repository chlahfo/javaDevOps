//소수 판별
/*
	사용자한테 N을 입력받아서 소수인지 판별하는 프로그램
*/

import java.util.Scanner;
class D30PrimNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		System.out.print("N을 입력 ==> ");
		for (int i = 2; i < n; i++){
			if(n % i == 0){
				isPrime = false;
				break;		//for를 탈출하거나 switch를 탈출하는 것
			}
		}
		if(isPrime){
			System.out.printf("%d는 소수입니다.", n);
		}else{
			System.out.printf("%d는 소수가 아닙니다.", n);
		}
	}
	
}
