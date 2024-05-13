/*
	사용자 한테 0~9사이의 수를 입력받아 
	한글표기식 출력하는 프로그램을 작성
*/

import java.util.Scanner;
class D04DigitToKorSwitch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력==>");
		n = sc.nextInt();
		switch( n ){
			case 0:System.out.println("영");break;
			case 1:System.out.println("일");	break;
			case 2:System.out.println("이");	break;
			case 3:System.out.println("삼");	break;
			case 4:System.out.println("사"); break;
			case 5:System.out.println("오");	break;
			case 6:System.out.println("육"); break;
			case 7:System.out.println("칠");break;
			case 8:System.out.println("팔");	break;
			case 9:System.out.println("구");	break;
			default:System.out.println("입력범위를 넘었습니다.");
		}
	}
}

/*
	각 case에 동작시킬 명령어(들)을 한줄에 표현하여 문장을 
	더 간결하게 할 수 있어요.
*/


