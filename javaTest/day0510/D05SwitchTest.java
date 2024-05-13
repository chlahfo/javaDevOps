/*
	사용자 한테 0~9사이의 수를 입력받아 
	한글표기식 출력하는 프로그램을 작성
*/

import java.util.Scanner;
class D05SwitchTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =5;		
		switch( n ){
			case 4:
			case 5:
			case 6:System.out.println("육"); break;
			case 7:
			case 0:
			case 1:
			case 2:System.out.println("이");	break;
			case 3:System.out.println("삼");	break;			
			case 8:
			case 9:System.out.println("구");	break;
			default:System.out.println("입력범위를 넘었습니다.");
		}
		System.out.println("작업종료");
	}
}

/*
	각 case에 동작시킬 명령어(들)을 한줄에 표현하여 문장을 
	더 간결하게 할 수 있어요.
*/


