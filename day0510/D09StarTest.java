/*
	사용자한테 이름, 생월, 생일을 입력받아 별자리를 판별하여 출력하는 프로그램을 작성.

	<< 실행 예 >>
	이름을 입력==> 이재원
	몇월에 태어 났나요 ==> 1
	몇일에 태어 났나요 ==> 28
	이재원님의 별자리는 물병자리 입니다.
	
	<처리조건>
	물병자리			01/20 ~ 02/18
	물고기자리			02/19 ~ 03/20
	양자리			03/21 ~ 04/19
	황소자리			04/20 ~ 05/20
	쌍둥이자리			05/21 ~ 06/21
	게자리			06/22 ~ 07/22
	사자자리			07/23 ~ 08/22
	처녀자리			08/23 ~ 09/23
	천칭자리			09/24 ~ 10/22
	전갈자리			10/23 ~ 11/22
	사수자리			11/23 ~ 12/24
	염소자리			12/25 ~ 01/19
*/
import java.util.Scanner;
class D09StarTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name,result="";
		int month, date,lastDate=31;

		System.out.print("이름을 입력하세요==>");
		name = sc.next();

		System.out.print("몇월이 태어났나요==>");
		month = sc.nextInt();

		if( month < 1 ||  month > 12 ){
			System.out.println("입력오류");
			return;
		}

		if(month == 4 || month == 6 || month == 9 || month == 11){
			lastDate = 30;
		}else if(month == 2){
			lastDate = 28;
		}


		System.out.print("몇일에 태어났나요==>");
		date = sc.nextInt();

		if(date < 1  ||  date > lastDate){
			System.out.println("입력오류");
			return;
		}

		switch(month){
			case 1:if(date <= 19){result = "염소";}else{result = "물병";}break;
			case 2:if(date <= 18){result = "물병";}else{result = "물고기";}break;
			case 3:if(date <= 20){result = "물고기";}else{result = "양";}break;
			case 4:if(date <= 19){result = "양";}else{result = "황소";}break;
			case 5:if(date <= 20){result = "황소";}else{result = "쌍둥이";}break;
			case 6:if(date <= 21){result = "쌍둥이";}else{result = "게";}break;
			case 7:if(date <= 22){result = "게";}else{result = "사자";}break;
			case 8:if(date <= 22){result = "사자";}else{result = "처녀";}break;
			case 9:if(date <= 23){result = "처녀";}else{result = "천칭";}break;
			case 10:if(date <= 22){result = "천칭";}else{result = "전갈";}break;
			case 11:if(date <= 22){result = "전갈";}else{result = "사수";}break;
			case 12:if(date <= 24){result = "사수";}else{result = "염소";}break;
		}
		System.out.printf("%s님의 별자리는 %s입니다.", name, result);
	}
}
