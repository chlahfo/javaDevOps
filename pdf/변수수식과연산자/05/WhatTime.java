import java.util.Scanner;

public class WhatTime{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int sec, min, hour;
		System.out.print("초 단위의 시간 입력 => ");
		sec = sc.nextInt();
		min = sec / 60;
		sec %= 60;
		hour = min / 60;
		min %= 60;
		System.out.println("입력된 시간 : "+hour+"시 "+min+"분 "+sec+"초");
	}
}