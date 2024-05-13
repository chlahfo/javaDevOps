package com.kosta.exam;

import java.util.Scanner;

public class D22_MaxScoreName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i = 1; i < peopleNums; i++) {
			if(max < Scores[i]) {
				max = Scores[i];
				maxPosition = i;
			}
		}
		System.out.printf("가장 점수가 높은 학생은 %s학생으로 %d점입니다.", Names[maxPosition], max);
	}

}
