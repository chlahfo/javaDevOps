import java.util.Scanner;
class D14StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*
		int []score;		//배열의 선언
		score = new int[5]	//배열의 생성
		*/
		int []score = new int[5];
		int total = 0, avg;
		for (int i = 0; i < score.length; i++)		{
			System.out.print("학생의 점수를 입력하세요 ==> ");
			score[i] = sc.nextInt();
			total += score[i];
		}
		avg = total / score.length;

		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
}
