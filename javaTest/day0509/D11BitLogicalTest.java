/*
연습) 사용자한테 출생 연도를 입력받아 무료 암검진 대상자인지 판별하는 프로그램 작성
	무료암검진 대상자는 짝수연도에 태어나고 나이가 40이상이어야합니다.
	(&&, &)
*/
import java.util.Scanner;
import java.util.Date;

class D11BitLogicalTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("출생연도를 입력하세요 : ");
		year = sc.nextInt() ;
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int age = thisYear - year;
		
		//if(year % 2 == 0 && age >= 40){
		if(year % 2 == 0 & age >= 40){
			System.out.println("무료 암검진 대상자입니다.");
		}else{
			System.out.println("무료 암검진 대상자가 아닙니다.");
		}
	}
}
