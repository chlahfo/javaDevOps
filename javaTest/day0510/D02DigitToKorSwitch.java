/*
	사용자 한테 0~9사이의 수를 입력받아 
	한글표기식 출력하는 프로그램을 작성
*/

import java.util.Scanner;
class D02DigitToKorSwitch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력==>");
		n = sc.nextInt();
		switch( n ){
			case 0:
				System.out.println("영");
			case 1:
				System.out.println("일");
			case 2:
				System.out.println("이");
			case 3:
				System.out.println("삼");
			case 4:
				System.out.println("사");
			case 5:
				System.out.println("오");
			case 6:
				System.out.println("육");
			case 7:
				System.out.println("칠");
			case 8:
				System.out.println("팔");
			case 9:
				System.out.println("구");
			default:
				System.out.println("입력범위를 넘었습니다.");
		}
	}
}

/*
C:\javaTest\day0510>java D02DigitToKorSwitch
0~9사이의 수를 입력==>5
오
육
칠
팔
구
입력범위를 넘었습니다.

C:\javaTest\day0510>java D02DigitToKorSwitch
0~9사이의 수를 입력==>100
입력범위를 넘었습니다.

C:\javaTest\day0510>java D02DigitToKorSwitch
0~9사이의 수를 입력==>9
구
입력범위를 넘었습니다.

해당하는 case 부터
끝까지 동작합니다.
만약, 해당 case만 동작 시키고자 한다면
각 case문 끝에 break를 둡니다.

따라서 switch~case문을 쓸때에
반드시 모든 case문에 break를 두어야 하는 것은 아니고
내가 해결해야 하는 문제에 따라 적절한 위치에 break를 둡니다.
*/


