package com.kosta.exam;

import java.util.Scanner;

/*
 	5명의 학생 이름, 점수를 입력받아서 최고 점수의 학생 이름을 출력해봅시다
 */

public class A1 {	
	public static void main(String[] args) {
		int max, maxPosition, peopleNums = 5;
		String Names[] = new String[peopleNums];
		int Scores[] = new int[peopleNums];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < peopleNums; i++) {
			System.out.printf("%d번째 학생의 이름은? =>",i+1);
			Names[i] = sc.next();
			System.out.printf("%d번째 학생의 점수는? =>",i+1);
			Scores[i] = sc.nextInt();
		}
		max = Scores[0];
		maxPosition = 0;
		for(int i = 0; i < peopleNums; i++) {
			if(max < Scores[i]) {
				max = Scores[i];
				maxPosition = i;
			}
		}
		System.out.printf("가장 점수가 높은 학생은 %s학생으로 %d점입니다.", Names[maxPosition], Scores[maxPosition]);
	}
}
