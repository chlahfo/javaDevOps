package com.kosta.exam;

import java.util.Scanner;

/*
 	사용자한테 두 개의 정수를 입력받아 더하기하여 결과를 출력
	
*/
public class D20_Addtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, add;
		
		System.out.print("첫번째 수를 입력해주세요 ==> ");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요 ==> ");
		b = sc.nextInt();
		add = a + b;
		System.out.println("덧셈의 결과는 "+add);
	}

}
