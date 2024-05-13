import java.util.Scanner;

public class CancerTest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name, result = "무료암검진 비대상자입니다.";
		int year, thisYear = 2024;
		int age;
		
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("출생연도를 입력하세요==>");
		year = sc.nextInt();
		age = thisYear - year;
		if(age >= 40){
			result = "무료암검진 대상자입니다.";
		}
		System.out.println("*** 무료 암검진 판별 결과 ***");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("결과:" + result);
	}	
}