import java.util.Scanner;

public class Score{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int com, c_lang, eng, math, sum, score;
		
		System.out.print("컴퓨터 개론 점수는? => ");
		com = sc.nextInt();
		System.out.print("C언어 프로그래밍 점수는? => ");
		c_lang = sc.nextInt();
		System.out.print("영어 점수는? => ");
		eng = sc.nextInt();
		System.out.print("일반 수학 점수는? => ");
		math = sc.nextInt();
		sum = com + c_lang + eng + math;
		score = sum / 4;
		System.out.println("이번 학기 평균 점수 : " + score);
	}
}