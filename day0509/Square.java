/*
	사용자한테 가로길이, 세로길이를 입력받아 사각형의 면적을 계산하여 출력하는 프로그램
	(면적은 소수점이하 2째자리까지 입력)
*/

import java.util.Scanner;

class Square{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double w, h, s;
		System.out.print("사각형 길이 : ");
		w = sc.nextDouble();
		System.out.print("사각형 높이 : ");
		h = sc.nextDouble();
		s = w * h;
		System.out.printf("사각형의 가로 길이는 %f\n세로 길이는 %f\n넓이는 %.2f 이다.",w,h,s);
	}
}
