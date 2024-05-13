package com.kosta.exam;

import java.util.Scanner;

public class D24CountLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int []count = new int[26];
			System.out.println("문자열을 입력하시오==> ");
			String buffer = sc.nextLine();//공백 문자도 입력 받을 수 있음
			
			//각 문자가 등장하는 횟수를 계산한다. 
			for(int i = 0; i < buffer.length();i++) {
				char ch = buffer.charAt(i);
				count[ch - 'a']++;
			}
			
			for(int i = 0; i < count.length;i++) {
				System.out.printf("%c ==> %d\n", (char)('a'+i), count[i]);
			}
	}

}
