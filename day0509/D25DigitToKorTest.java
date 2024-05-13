/*
	사용자한테 0~9 사이의 수를 입력받아서 한글 표기식 출력하는 프로그램을 if 문을 이용하여 작성해봅니다.

	<<실행 예>>
	0~9 사이의 수를 입력하시오==> 7
	칠
*/
import java.util.Scanner;
class D25DigitToKorTest{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ch;
		System.out.print("0~9사이의 수를 입력하시오 ==> ");
		int n = sc.nextInt();
		
		
		if(n < 0 || n > 9){
			System.out.println("잘못된 값을 입력했습니다.");
			return;
		}
		if(n == 0){
			ch = "영";
		}else if(n == 1){
			ch = "일";
		}else if(n == 2){
			ch = "이";
		}else if(n == 3){
			ch = "삼";
		}else if(n == 4){
			ch = "사";
		}else if(n == 5){
			ch = "오";
		}else if(n == 6){
			ch = "육";
		}else if(n == 7){
			ch = "칠";
		}else if(n == 8){
			ch = "팔";
		}else{
			ch = "구";
		}

		System.out.printf("입력하신 수는 %s입니다", ch);
	}
}
