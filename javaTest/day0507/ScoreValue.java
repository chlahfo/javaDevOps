/*
연습) 사용자한테 이름, 국어, 영어, 수학을 입력받아 총점과 평균을 각각 구하여 출력하고 또, 평균이 60점 이상이면 "합격" 그렇지 않으면 "불합격"을 출력하는 프로그램을 작성합니다.


*/

import java.util.Scanner;

public class ScoreValue{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name,val;
		int lang, eng, math, score, n;
		
		val = "합격";
		System.out.print("이름을 입력하시오 ==> ");
		name = sc.next();
		System.out.print("국어점수를 입력하시오 ==> ");
		lang = sc.nextInt();
		System.out.print("영어점수를 입력하시오 ==> ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하시오 ==> ");
		math = sc.nextInt();
		score = lang + eng + math;
		n = score / 3;

		System.out.println("\n*** 성적 처리 결과 ***");

		System.out.println("이름 : " + name);
		System.out.println("국어 : " + lang);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + score);
		System.out.println("평균 : " + n);
		
		if(n < 60){
			val = "불합격";
		}
		
		System.out.println("결과 : " + val);
	}
}