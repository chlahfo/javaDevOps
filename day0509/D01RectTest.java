/*
	사용자한테 가로길이, 세로길이를 입력받아 사각형의 면적을 계산하여 출력하는 프로그램
	(면적은 소수점이하 2째자리까지 입력)
*/

import java.util.Scanner;

class D01RectTest{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double width, height, area;
		System.out.println("사각형 가로길이");
		width = sc.nextDouble();
		System.out.println("사각형 높이길이");
		height = sc.nextDouble();
		area = width * height;
		System.out.printf("사각형의 면적: %.2f", area);
	}
}
