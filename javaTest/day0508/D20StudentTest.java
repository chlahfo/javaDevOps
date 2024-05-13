	/*
	학생의 이름, 국어, 영어, 수학을 입력받아
	총점과 평균을 각각 구하여 출력합니다.
	단, 평균은 소수점 1째자리까지 출력합니다.
	(변수 자유)
*/
import java.util.Scanner;

class D20StudentTest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, tot;
		double avg;
		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.print("국어 점수를 입력하시오==>");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오==>");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오==>");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = tot / 3.0;
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균 :%.1f", name, kor, eng, math, tot, avg);
	}
}

/*
		String name;
		int kor, eng, math, sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 => ");
		kor = sc.nextInt();
		System.out.print("영어 점수 => ");
		eng = sc.nextInt();
		System.out.print("수학 점수 => ");
		math = sc.nextInt();
		sum = kor + eng + math;
		avg = (double)sum / 3;
		System.out.printf("총점: %d, 평균: %.1f\n", sum, avg);
*/
