/*
	사용자한테 문자열을 입력받아 그 문자열 안에 대문자 A는 모두 몇 개 있는지 판별하여 출력하는 프로그램을 작성해보기
	클래스명, 변수명 자유
*/

public class D21OperatorArithmeticTest{
	public static void main(String []args){
		int a = 13;
		int b = 48;

		int add, sub, multi, div, mode;
		add = a + b;
		sub = a - b;
		multi = a * b;
		div = a / b;
		mode = a % b;
		System.out.printf("add: %d\n", add);
		System.out.printf("sub: %d\n", mode);
		System.out.printf("multi: %d\n", multi);
		System.out.printf("div: %d\n", div);
		System.out.printf("mode: %d\n", mode);
	}
}