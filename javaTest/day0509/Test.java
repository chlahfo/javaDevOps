/*
	연습) 학생의 이름, 국어, 영어, 수학을 입력받아 합격여부를 판별하여 출력하는 프로그램을 작성합니다. 평균이 60점이상이고 모든 과목이 40점 이상이어야 합격입니다.
*/
import java.util.Scanner;
class Test{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, avg;
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();

		avg = kor + eng + math / 3;

		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60){
			System.out.printf("%s님 합격입니다.", name);
		}else{
			System.out.printf("%s님 불합격입니다.", name);
		}
	}
}
