/*
	사용자 한테 0~9사이의 수를 입력받아 
	한글표기식 출력하는 프로그램을 작성
*/

import java.util.Scanner;
class D01DigitToKorIf {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력==>");
		n = sc.nextInt();
		if( n == 0) {
			System.out.println("영");
		}else if(n == 1){
			System.out.println("일");
		}else if(n == 2){
			System.out.println("이");
		}else if(n == 3){
			System.out.println("삼");
		}else if(n == 4){
			System.out.println("사");
		}else if(n == 5){
			System.out.println("오");
		}else if(n == 6){
			System.out.println("육");
		}else if(n == 7){
			System.out.println("칠");
		}else if(n == 8){
			System.out.println("팔");
		}else if(n == 9){
			System.out.println("구");
		}else{
			System.out.println("입력범위를 넘었습니다.");
		}
	}
}
