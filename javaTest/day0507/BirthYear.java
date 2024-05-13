import java.util.Scanner;

public class BirthYear{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name, result = "비대상자";
		int birth_year, age;
		
		System.out.print("이름을 입력하세요 ==> ");
		name = sc.next();
		System.out.print("출생연도를 입력하세요 ==> ");
		birth_year = sc.nextInt();
		age = 2024 - birth_year + 1;
		
		if(age >= 40){
			result = "대상자";
		}
		System.out.println("\n*** 무료 암검진 판별 결과 ***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("결과 : 무료 암검진 "+result+" 입니다.");
	}
}