package com.kosta.exam;

import java.util.Scanner;
//다섯 명의 점수를 입력받아 최고값과 그 때의 index를 구하여 출력

public class D21_MaxText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		int max, maxPosition;
		for (int i = 0; i< score.length;i++) {
			System.out.printf("%d번째 점수를 입력 ==>", i);
			score[i] = sc.nextInt();
		}
		
		max = score[0];
		maxPosition = 0;
		for (int i = 1; i< score.length;i++) {
			if(max < score[i]) {
				max = score[i];
				maxPosition = i;
			}
		}
		System.out.println("가장 높은 점수는 " + max);
		System.out.println("가장 높은 점수 위치는 " + maxPosition);
	}
}
