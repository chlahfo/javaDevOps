/*
연습) 사용자한테 두 개의 정수를 입력받아 그 중에 큰 수를 찾아서 출력하는 프로그램을 작성합니다.
클래스 이름, 변수명을 자유롭게 합니다.
<<실행 예>>
첫번째 수를 입력하세요 ==> 3
두번째 수를 입력하세요 ==> 4
4
*/

import java.util.Scanner;

public class BigNum{
	public static void main(String []args){
		int n1;
		int n2;
		int big;
		

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수를 입력하세요 ==> ");
		n1 = sc.nextInt();
		big = n1;
		System.out.print("두번째 수를 입력하세요 ==> ");
		n2 = sc.nextInt();

		if(n2 > n1){
			big = n2;
		}
		System.out.println(big);
	}
}