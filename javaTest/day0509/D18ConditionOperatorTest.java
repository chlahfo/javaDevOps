/*
	사용자한테 두 개의 정수를 입력받아 그 중에 큰 수를 찾아 출력하는 프로그램을 조건식 연산자(삼항연산자를 이용하여 작성해봅니다.
*/
import java.util.Scanner;
class D18ConditionOperatorTest 
{
	public static void main(String[] args){

		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("x 를 입력하세요");
		x = sc.nextInt();
		System.out.println("y 를 입력하세요");
		y = sc.nextInt();
		System.out.printf("큰 수는 %d입니다\n", (x > y)? x : y);
		System.out.println((x>y)?x:y);
	}
}
