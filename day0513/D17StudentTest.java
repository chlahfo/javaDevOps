/*
	4지 선다형 문항의 답안 10개를 입력받아 답이 옳은지 판별하여 'O', 'X' 를 출력하고 정답수와 틀린 답수를 각각 출력ㄱ하는 프로그램을 작성합니다.
*/
import java.util.Scanner;
class D17StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//모범답안을 미리 초기화합니다.
		int []dap = {1,2,3,4,1,2,3,4,1,2};

		//학생 답을 입력받기 위한 배열을 선언
		int []user = new int[10];

		//정답수를 구하기 위한 변수
		int n = 0;

		//반복문을 이용하여 10개의 문항의 답안을 입력
		for (int i = 0; i< dap.length; i++)
		{
			System.out.printf("%d번 답안을 입력하세요==>", i+1);
			user[i] = sc.nextInt();
		}
		//문항번호를 출력한다.
		for(int i = 1; i<= dap.length;i++){
			System.out.print(i+"\t");
		}
		System.out.println();

		//답이 옳은지 판별하여 O, X를 출력한다.
		for(int i = 0; i< dap.length; i++){
			if(dap[i] == user[i]){
				System.out.print("O\t");
					n++;
			}else{
				System.out.print("X\t");
			}
		}
		
		//정답수
		System.out.println("\n정답수:"+n);
		System.out.println("틀린답수:"+(10 - n));

	}
}

/*
	
	4지 선다형 문항의 답안 10개를 입력받아 답이 옳은지 판별하여 'O', 'X' 를 출력하고 정답수와 틀린 답수를 각각 출력ㄱ하는 프로그램을 작성합니다.


import java.util.Scanner;
class Test10 
{
	public static void main(String[] args) 
	{
		int answer, num;
		int Solution[] = {3,1,3,2,4,1,3,2,1,4};
		int solution_len = Solution.length;
		char Result[] = new char[solution_len];

		for(int i = 0; i < solution_len; i++){
			Scanner sc = new Scanner(System.in);
			System.out.printf("%d번 답을 입력하세요 ==> ",i+1);
			answer = sc.nextInt();
			if(answer == Solution[i])
				Result[i] = 'O';
				num++;
			else
				Result[i] = 'X';
		}

		for(int i = 0; i < solution_len; i++){
			System.out.printf("%5d",i+1);
		}
		System.out.println();
		for(int i = 0; i < solution_len; i++){
			System.out.printf("%5c",Result[i]);
		}
		
	}
}

*/
