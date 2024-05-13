/*
연습 ) 아빠나이, 엄마나이, 아들나이를 입력받아서
평균 나이를 구하여 출력하는 프로그램을 작성하고
저장하고, 컴파일하고, 실행해봅니다. 클래스이름, 변수명들은 자유롭게 합니다.
*/
import java.util.Scanner;

public class D01Family{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			int dad, mom, son, tot, avg;
			System.out.print("아빠 나이를 입력하세요==>");
			dad = sc.nextInt();
			System.out.print("엄마 나이를 입력하세요==>");
			mom = sc.nextInt();
			System.out.print("아들 나이를 입력하세요==>");
			son = sc.nextInt();

			tot=dad + mom + son;
			avg = tot / 3;

			System.out.println("*** 결과 확인 ***");
			System.out.println("아빠나이 : " + dad);
			System.out.println("엄마나이 : " + mom);
			System.out.println("아들나이 : " + son);
			System.out.println("평균나이 : " + avg);
	}
}