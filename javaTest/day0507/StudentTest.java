import java.util.Scanner;
public class StudentTest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name, result = "불합격";
		int kor, eng, math, tot, avg;
		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.print("국어점수를 입력하시오==>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하시오==>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하시오==>");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = tot/3;
		if(avg >= 60){
			result = "합격";
		}
		
		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("결과 : "+result);
	}
}